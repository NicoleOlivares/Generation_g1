import React, { useState, useCallback } from "react";
import { FormularioComponent } from './FormularioComponent';
import { TarjetaComponent } from './TarjetaComponent';
import { useNavigate } from 'react-router-dom'

/*
const usuario1 = {
    nombre: 'Joseph',
    apellido: 'Joestar',
    edad: '18'
}

const usuario2 = {
    nombre: 'Josuske',
    apellido: 'Higashikata',
    edad: '16'
}*/

const initialUsuarios = [
    {
        key: 0,
        nombre: 'Joseph',
        apellido: 'Joestar',
        edad: '18',
        password: '1234'
    },
    {
        key: 1,
        nombre: 'Josuske',
        apellido: 'Higashikata',
        edad: '16',
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
        nombre: 'Almendra',
        apellido: 'Ponce',
        edad: '20',
        password: '1234'
    },
    {
        key: 4,
        nombre: 'Meiruko',
        apellido: '- chan',
        edad: '16',
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

    const handleOnClick = useCallback(() => navigate('/autos', { replace: true }, [navigate]));


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
        <div className="container mt-4">
            <div className='row'>
                <div className='col-8'>
                    <h1>Lista</h1>
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
                <div className='col-4'>
                    <h1>Formularios</h1>
                    {/*FormularioComponent*/}
                    <FormularioComponent
                        usuarioAdd={usuarioAdd}
                        usuarioEditado={usuarioEditado}
                        usuarioEdit={usuarioEdit}
                        setUsuarioEditado={setUsuarioEditado} />

                </div>
                <br/>
                <div>
                    <button type="buttom" className="btn btn-outline-primary my-2" onClick={handleOnClick}>Ir a Autos</button>
                </div>
            </div>
        </div>);
}

export default UsuarioComponent;