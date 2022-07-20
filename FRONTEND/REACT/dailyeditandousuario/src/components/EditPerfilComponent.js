import React, { useEffect, useState } from "react";
import {FormularioEditar} from './FormularioComponent';
import {TarjetaUser} from './TarjetaComponent';
import { getAll, eliminarUsuario, saveUsuario } from "../services/UsuarioServices"; 

const initialEditPerfil = [
    {
        id: 1,
        nombre: '',
        apellido: '',
        rut: '',
        fecha: '',
        email: '',
        password:''
    }
]

const EditPerfilComponent = () => {

    const [users, setUsers] = useState(initialEditPerfil);
    /*const [state, setState] = useState();*/

    const [userEditado, setUsersEditado] = useState(null);

    const obtenerUsers = async()=>{
        setUsers(await getAll())
    }

    useEffect(
        ()=>{obtenerUsers()}
        ,[])

    const tarjetaDelete =async(userId)=>{
        await eliminarUsuario(userId)
        setUsers(await getAll())
    }

    const userAdd =async(user)=>{
        await saveUsuario(user)
        setUsers(await getAll())
    }

    const userEdit = (userEditado) => {
        const changeUsers = users.map(user => (user.id === userEditado.id ? userEditado : user))
        setUsers(changeUsers)
    }

    return (
        <div className="container-fluid bg-info">
            <div className='row'>
                <div className='col-8 mt-4'>
                    <h1>Usuarios Registrados</h1>
                    {
                        users.map(u =>
                            <TarjetaUser
                                id={u.id}
                                user={u}
                                tarjetaDelete={tarjetaDelete}
                                setUserEditado={setUsersEditado} />)
                    }
                    {/*<TarjetaComponent auto={auto1} />
                    <TarjetaComponent auto={auto2} />*/}
                    {/*Final tarjeta*/}
                </div>
                <div className='col-4 mt-4'>
                    {/*FormularioComponent*/}
                    <FormularioEditar
                        userAdd={userAdd}
                        userEditado={userEditado}
                        userEdit={userEdit}
                        setUserEditado={setUsersEditado} />

                </div>
            </div>
        </div>);
}

export default EditPerfilComponent;