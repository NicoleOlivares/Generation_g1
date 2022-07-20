import React, { useState, useEffect } from "react";

const initialValues = [
    {
        key: '',
        nombre: '',
        apellido: '',
        edad: '',
        password: ''
    }
]

const userValues = [
    {
        id: '',
        nombre: '',
        apellido: '',
        rut: '',
        fecha: '',
        email: '',
        password: ''
    }
]


const FormularioComponent = ({ usuarioAdd, usuarioEditado, usuarioEdit, setUsuarioEditado }) => {
    //constantes
    const [values, setValues] = useState(userValues);
    const { key, nombre, apellido, edad, password } = values;

    //llamando o declarando a useEffect
    useEffect(
        () => {
            if (usuarioEditado !== null) {
                setValues(usuarioEditado)
            } else {
                setValues({
                    key: '',
                    nombre: '',
                    apellido: '',
                    edad: '',
                    password: ''
                })
            }
        }
        , [usuarioEditado]);

    /*useEffect(accion que debe hacer, [estado del cual debe estar pendiente])*/

    const handleInputChange = (e) => {
        const changedFormValue = {
            ...values,
            //key:key
            [e.target.name]: e.target.value
        }
        setValues(changedFormValue)
    }

    const handleSubmit = (e) => {
        e.preventDefault();
        if (usuarioEditado !== null) {
            usuarioEdit(values)
        } else {
            usuarioAdd(values)
        }

    }

    return (
        <form onSubmit={handleSubmit}>
            {/*usuario editado es nulo, si no es nulo, muestra editar usuario.
            si es nulo, muestra el ingresar usuario */}
            <h1>{usuarioEditado ? 'Editar Usuario' : 'Crear usuario'}</h1>
            <div className="form-group">
                <label>ID</label>
                <input
                    type="text"
                    className="form-control"
                    id="key"
                    placeholder="key"
                    value={key}
                    name='key'
                    onChange={handleInputChange}
                />
                <br />
            </div>
            <div className="form-group">
                <label>Nombre</label>
                <input
                    type="text"
                    className="form-control"
                    id="nombre"
                    placeholder="Nombre"
                    value={nombre}
                    name='nombre'
                    onChange={handleInputChange}
                />
                <br />
            </div>
            <div className="form-group">
                <label>Apellido</label>
                <input
                    type="text"
                    className="form-control"
                    id="apellido"
                    placeholder="Apellido"
                    value={apellido}
                    name='apellido'
                    onChange={handleInputChange}
                />
                <br />
            </div>
            <div className="form-group">
                <label>Edad</label>
                <input
                    type="text"
                    className="form-control"
                    id="edad"
                    placeholder="Edad"
                    value={edad}
                    name='edad'
                    onChange={handleInputChange}
                />
                <br />
            </div>
            <div className="form-group">
                <label>Password</label>
                <input
                    type="password"
                    className="form-control"
                    id="password"
                    placeholder="Password"
                    value={password}
                    name='password'
                    onChange={handleInputChange}
                ></input>
                <br />
            </div>
            <div>
                <button type="submit" className="btn btn-dark mr-2">{usuarioEditado ? 'Editar' : 'Crear'}</button>
                {usuarioEditado ? (<button type="button" className="btn btn-warning" onClick={() => { setUsuarioEditado(null) }}>Cancelar</button>) : ''}
            </div>
        </form>);
}

const FormularioEditar = ({ userAdd, userEditado, userEdit, setUserEditado }) => {
    const [values, setValues] = useState(userValues);
    const { nombre, apellido, rut, fecha, email, password  } = values;

    useEffect(
        () => {
            if (userEditado !== null) {
                setValues(userEditado)
            } else {
                setValues({
                    id: '',
                    nombre: '',
                    apellido: '',
                    rut: '',
                    fecha: '',
                    email: '',
                    password: ''
                })
            }
        }
        , [userEditado]);

    const handleInputChange = (e) => {

        const changedFormValue = {
            ...values,
            [e.target.name]: e.target.value
            //key:key
        }
        setValues(changedFormValue)
    }

    const handleSubmit = (e) => {
        e.preventDefault();
        userAdd(values);

    }

    return (
        <form onSubmit={handleSubmit}>
            <h1>{userEditado ? 'Editar Usuario' : 'Crear usuario'}</h1>
            <div className="form-group">
                <label>Nombre</label>
                <input
                    type="text"
                    className="form-control"
                    id="nombre"
                    placeholder="Nombre..."
                    value={nombre}
                    name='nombre'
                    onChange={handleInputChange}
                />
                <br />
            </div>
            <div className="form-group">
                <label>Apellido</label>
                <input
                    type="text"
                    className="form-control"
                    id="apellido"
                    placeholder="Apellido..."
                    value={apellido}
                    name='apellido'
                    onChange={handleInputChange}
                />
                <br />
            </div>
            <div className="form-group">
                <label>Rut</label>
                <input
                    type="text"
                    className="form-control"
                    id="rut"
                    placeholder="rut"
                    value={rut}
                    name='rut'
                    onChange={handleInputChange}
                />
                <br />
            </div>
            <div className="form-group">
                <label>Fecha</label>
                <input
                    type="date"
                    className="form-control"
                    id="fecha"
                    placeholder="Fecha..."
                    value={fecha}
                    name='fecha'
                    onChange={handleInputChange}
                ></input>
                <br />
            </div>
            <div className="form-group">
                <label>Email</label>
                <input
                    type="email"
                    className="form-control"
                    id="email"
                    placeholder="Email..."
                    value={email}
                    name='email'
                    onChange={handleInputChange}
                ></input>
                <br />
            </div>
            <div className="form-group">
                <label>Password</label>
                <input
                    type="password"
                    className="form-control"
                    id="password"
                    placeholder="Password..."
                    value={password}
                    name='password'
                    onChange={handleInputChange}
                ></input>
                <br />
            </div>
            <div>
                <button type="submit" className="btn btn-dark mr-2">{userEditado ? 'Editar' : 'Crear'}</button>
                {userEditado ?
                    (<button type="button" className="btn btn-warning" onClick={() => { setUserEditado(null) }}>Cancelar</button>) : ''}

            </div>

        </form>
    );
}


export {FormularioComponent, FormularioEditar};