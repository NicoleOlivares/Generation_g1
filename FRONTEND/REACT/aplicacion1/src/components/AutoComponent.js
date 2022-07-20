import React, { useEffect, useState } from "react";
import {FormularioAuto} from './FormularioComponent';
import {TarjetaAuto} from './TarjetaComponent';
import { getAll, eliminarAuto, saveAuto } from "../services/AutoServices"; 

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

    const [autos, setAutos] = useState(initialAuto);
    /*const [state, setState] = useState();*/

    const [autoEditado, setAutoEditado] = useState(null);

    const obtenerAutos = async()=>{
        setAutos(await getAll())
    }

    useEffect(
        ()=>{obtenerAutos()}
        ,[])

    const tarjetaDelete =async(autoId)=>{
        await eliminarAuto(autoId)
        setAutos(await getAll())
    }

    const autoAdd =async(auto)=>{
        await saveAuto(auto)
        setAutos(await getAll())
    }

    const autoEdit = (autoEditado) => {
        const changeAutos = autos.map(auto => (auto.id === autoEditado.id ? autoEditado : auto))
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
                                id={u.id}
                                auto={u}
                                tarjetaDelete={tarjetaDelete}
                                setAutoEditado={setAutoEditado} />)
                    }
                    {/*<TarjetaComponent auto={auto1} />
                    <TarjetaComponent auto={auto2} />*/}
                    {/*Final tarjeta*/}
                </div>
                <div className='col-4'>
                    <h1>Formulario</h1>
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