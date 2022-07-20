import React from 'react';
import {BrowserRouter, Routes, Route} from 'react-router-dom';
import UsuarioComponent from './components/UsuarioComponent';
import EditPerfilComponent from './components/EditPerfilComponent';

//para que se muestren ambas etiquetas agregamos un div
const App = () => {
    return (
        <BrowserRouter>
        <Routes>
            <Route path='/' element={<UsuarioComponent/>}></Route>
            <Route path='/editar/usuario' element={<EditPerfilComponent/>}></Route>
        </Routes>
        </BrowserRouter>
    );

};

export default App;