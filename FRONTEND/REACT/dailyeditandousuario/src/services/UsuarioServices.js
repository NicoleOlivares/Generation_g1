import axios from 'axios';

const baseUrl = "http://localhost:8080/api"

const getAll = async()=>{
//funciona en paralelo
    const respuesta = await axios.get(baseUrl + "/obtener/usuarios");
    //await axios.get(localhost:8080/api/obtener/usuarios)
    console.log(respuesta.data)
    return respuesta.data;
}

const eliminarUsuario = async(id)=>{
    //eliminarUsuario(1)
    //peticion con valores en path
    const res = await axios.post(baseUrl+"/eliminar/"+id);
    //axios.post(http://localhost:9080/api/eliminar/1)
    return res.data;
}

const saveUsuario = async(usuario)=>{
    //peticion con valor desde body
    const res = await axios.post(baseUrl+"/guardar/usuario", usuario);
    return res.data;
}



export {getAll, eliminarUsuario, saveUsuario}