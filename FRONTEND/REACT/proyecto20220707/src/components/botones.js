import React from "react";

const BotonesComponent = ({registro,listaDelete}) => {
    return (
        <div className="d-flex justify-content-end">
            <button className="btn btn-sm btn-outline-primary mr-2">Editar</button>
            <button className="btn btn-sm btn-outline-danger" onClick={() => listaDelete(registro.key)}>Eliminar</button>
        </div>
    );
}

export default BotonesComponent;