import React, { useState, useCallback } from "react";
import { FormularioComponent } from './FormularioComponent';
import { TarjetaComponent } from './TarjetaComponent';
import { useNavigate } from 'react-router-dom'


const initialUsuarios = [
    {
        key: 0,
        nombre: 'Héctor',
        apellido: 'Gómez',
        edad: '28',
        password: '1234'
    },
    {
        key: 1,
        nombre: 'Coty',
        apellido: 'Mardones',
        edad: '25',
        password: '1234'
    },
    {
        key: 2,
        nombre: 'Nicole',
        apellido: 'Olivares',
        edad: '28',
        password: '1234'
    },
    {
        key: 3,
        nombre: 'Ignacio',
        apellido: 'Galaz',
        edad: '29',
        password: '1234'
    },
    {
        key: 4,
        nombre: 'Fernando',
        apellido: 'Faundez',
        edad: '29',
        password: '1234'
    }
]

const UsuarioComponent = () => {
    /*Los hooks permiten cambios en los estados de nuestros componentes o elementos
    Para  que exporte, nos entrega un arreglo con dos respuesta
    1- componente en si 
    2- funcion 
    Necesita que le entreguemos un estado inicial (initialUsuarios)
    Parte con esta informacion de base
    */

    const [usuarios, setUsuarios] = useState(initialUsuarios);
    /*const [state, setState] = useState();*/

    const [usuarioEditado, setUsuarioEditado] = useState(null);

    const navigate = useNavigate();

    const handleOnClick = useCallback(() => navigate('/editar/usuario', { replace: true }, [navigate]));


    const tarjetaDelete = (usuarioKey) => {
        const changeUsuarios = usuarios.filter(u => u.key != usuarioKey)
        setUsuarios(changeUsuarios)
    }

    const usuarioAdd = (usuario) => {
        const addUsuarios = [
            ...usuarios,
            usuario
        ]
        setUsuarios(addUsuarios)
    }

    const usuarioEdit = (usuarioEditado) => {
        const changeUsuarios = usuarios.map(usuario => (usuario.key === usuarioEditado.key ? usuarioEditado : usuario))
        setUsuarios(changeUsuarios)
    }

    return (
        <div className="container-fluid bg-info">
            <div className='row'>
                <div className='col-8 mt-4'>
                    <h1>Grupo 5</h1>
                    {
                        usuarios.map(u =>
                            <TarjetaComponent
                                key={u.key}
                                usuario={u}
                                tarjetaDelete={tarjetaDelete}
                                setUsuarioEditado={setUsuarioEditado} />)
                    }
                    {/*<TarjetaComponent usuario={usuario1} />
                    <TarjetaComponent usuario={usuario2} />*/}
                    {/*Final tarjeta*/}
                </div>
                <div className='col-4 mt-4'>
                    {/*FormularioComponent*/}
                    <FormularioComponent
                        usuarioAdd={usuarioAdd}
                        usuarioEditado={usuarioEditado}
                        usuarioEdit={usuarioEdit}
                        setUsuarioEditado={setUsuarioEditado} />

                </div>
                <br/>
                <div>
                    <button type="buttom" className="btn btn-dark m-3" onClick={handleOnClick}>Editar Usuario</button>
                </div>
            </div>
        </div>);
}

export default UsuarioComponent;