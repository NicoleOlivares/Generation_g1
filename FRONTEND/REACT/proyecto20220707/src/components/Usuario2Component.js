import React,{useState} from "react";
import Formulario2Component from './Formulario2Component';
import ListaComponent from './ListaComponent';

/*const registro1 = {
    li: 'Nombre anime'
}*/

const initialRegistros = [
    {
        key: 0,
        li: 'Toradora'
    },

    {
        key: 1,
        li: 'Chobits'
    },
    {
        key: 2,
        li: 'Blame!'
    },

    {
        key: 3,
        li: 'Record Of Ragnarok'
    },

    {
        key: 4,
        li: 'Boku no hiro'
    },

    {
        key: 5,
        li: 'Golden Time'
    },

    {
        key: 6,
        li: 'Hellsing'
    }
]

const Usuario2Component = () => {
    /*const [state, setState] = useState();*/
    const [registros, setRegistros] = useState(initialRegistros);

    const listaDelete = (registroKey)=>{
        const changeRegistros = registros.filter(r => r.key != registroKey)
        setRegistros(changeRegistros)
    }

    const registroAdd = (registro)=>{
        const addRegistros = [
            ...registros,
            registro
        ]
        setRegistros(addRegistros)
    }


    return (
        <div className="container mt-4">
            <div className='row'>
                <div className='col-8'>
                    <h1>Lista de Anime</h1>
                    <ol class="list-group list-group-numbered">
                        {
                            registros.map(r => <ListaComponent key={r.key} registro={r} listaDelete={listaDelete} />)
                        }
                    </ol>
                    {/* Lista no ordenada */}
                    {/*<ListaComponent registro={registro1}/>*/}
                </div>
                <div className='col-4'>
                    <h1>Formularios</h1>
                    {/* Formulario */}
                    <Formulario2Component registroAdd={registroAdd} />
                </div>
            </div>
        </div>
    );
}

export default Usuario2Component;