import React, { useState } from "react";
import {FormularioAuto} from './FormularioComponent';
import {TarjetaAuto} from './TarjetaComponent';

const initialAuto = [
    {
        id: 1,
        marca: '',
        modelo: '',
        velocidad: 0,
        color: '',
        valor: 0
    }
]

const AutoComponent = () => {
    /*Los hooks permiten cambios en los estados de nuestros componentes o elementos
    Para  que exporte, nos entrega un arreglo con dos respuesta
    1- componente en si 
    2- funcion 
    Necesita que le entreguemos un estado inicial (initialautos)
    Parte con esta informacion de base
    */

    const [autos, setAutos] = useState(initialAuto);
    /*const [state, setState] = useState();*/

    const [autoEditado, setAutoEditado] = useState(null);

    const tarjetaDelete = (autoId) => {
        const changeAutos = autos.filter(u => u.key != autoId)
        setAutos(changeAutos)
    }

    const autoAdd = (auto) => {
        const addAuto = [
            ...autos,
            auto
        ]
        setAutos(addAuto)
    }

    const autoEdit = (autoEditado) => {
        const changeAutos = autos.map(auto => (auto.key === autoEditado.key ? autoEditado : auto))
        setAutos(changeAutos)
    }

    return (
        <div className="container mt-4">
            <div className='row'>
                <div className='col-8'>
                    <h1>Lista</h1>
                    {
                        autos.map(u =>
                            <TarjetaAuto
                                key={u.key}
                                auto={u}
                                tarjetaDelete={tarjetaDelete}
                                setAutoEditado={setAutoEditado} />)
                    }
                    {/*<TarjetaComponent auto={auto1} />
                    <TarjetaComponent auto={auto2} />*/}
                    {/*Final tarjeta*/}
                </div>
                <div className='col-4'>
                    <h1>Formularios</h1>
                    {/*FormularioComponent*/}
                    <FormularioAuto
                        autoAdd={autoAdd}
                        autoEditado={autoEditado}
                        autoEdit={autoEdit}
                        setAutoEditado={setAutoEditado} />

                </div>
            </div>
        </div>);
}

export default AutoComponent;