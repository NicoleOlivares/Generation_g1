import React from "react";

const TarjetaComponent = ({usuario,tarjetaDelete, setUsuarioEditado}) => {
    return (<div className="card bg-light mb-3">
        <div className="card-body">
            <h3 className="card-title">{usuario.nombre} {usuario.apellido}</h3>
            <p>edad: {usuario.edad}</p>
            <hr />
            <div className="d-flex justify-content-end">
                <button className="btn btn-sm btn-outline-primary mr-2" onClick={() => setUsuarioEditado(usuario)}>Editar</button>
                <button className="btn btn-sm btn-outline-danger" onClick={() => tarjetaDelete(usuario.key)}>Eliminar</button>
            </div>
        </div>
    </div>);
}

const TarjetaUser = ({user,tarjetaDelete, setUserEditado}) => {
    return (<div className="card bg-light mb-3">
        <div className="card-body">
            <h3 className="card-title">{user.nombre} {user.apellido}</h3>
            <p>Rut: {user.rut}</p>
            <p>Fecha: {user.fecha}</p>
            <p>Email: {user.email}</p>
            <p>Password: {user.password}</p>
            <hr />
            <div className="d-flex justify-content-end">
                <button className="btn btn-sm btn-outline-primary mr-2" onClick={() => setUserEditado(user)}>Editar</button>
                <button className="btn btn-sm btn-outline-danger" onClick={() => tarjetaDelete(user.id)}>Eliminar</button>
            </div>
        </div>
    </div>);
}

export {TarjetaComponent, TarjetaUser};