import axios from 'axios';

const baseUrl = "http://localhost:8080/api"

const getAll = async()=>{
//funciona en paralelo
    const respuesta = await axios.get(baseUrl + "/obtener/autos");
    //await axios.get(localhost:8080/api/obtener/autos)
    console.log(respuesta.data)
    return respuesta.data;
}

const eliminarAuto = async(id)=>{
    //eliminarAuto(1)
    //peticion con valores en path
    const res = await axios.post(baseUrl+"/eliminar/"+id);
    //axios.post(http://localhost:9080/api/eliminar/1)
    return res.data;
}

const saveAuto = async(auto)=>{
    //peticion con valor desde body
    const res = await axios.post(baseUrl+"/guardar/auto", auto);
    return res.data;
}



export {getAll, eliminarAuto, saveAuto}