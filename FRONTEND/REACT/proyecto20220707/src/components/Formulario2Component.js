import React, { useState } from "react";

const initialValues = [
    {
        key: '',
        nombre: '',
        genero: ''
    }
]

const Formulario2Component = ({ registroAdd }) => {

    const [values, setValues] = useState(initialValues);
    const { key, nombre, genero } = values;
    
    const handleInputChange = (e) => {
        const changedFormValue = {
            ...values,
            [e.target.name]: e.target.value
        }
        setValues(changedFormValue)
    }

    const handleSubmit = (e) => {
        e.preventDefault();
        registroAdd(values)
    }

    return (
        <form onSubmit={handleSubmit}>
            <div className="form-group">
                <label>ID</label>
                <input
                    type="text"
                    className="form-control"
                    id="key"
                    placeholder="key..."
                    value={key}
                    name='key'
                    onChange={handleInputChange}
                />
                <br />
            </div>
            <div className="form-group">
                <label>Nombre Anime:</label>
                <input 
                type="text"
                className="form-control"
                id="nombre"
                placeholder="Nombre Anime..."
                value={nombre}
                name='nombre'
                onChange={handleInputChange}
                />
                <br />
            </div>
            <div className="form-group">
                <label>Genero:</label>
                <input 
                type="text"
                className="form-control" 
                id="genero"
                placeholder="genero..."
                value={genero}
                name='genero'
                onChange={handleInputChange}
                />
                <br/>
            </div>
            <button type="submit" className="btn btn-outline-primary">Enviar</button>
        </form>);
}

export default Formulario2Component;