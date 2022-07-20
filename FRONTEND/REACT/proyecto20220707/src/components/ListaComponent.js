import React from "react";
import BotonesComponent from "./botones";


const ListaComponent = ({ registro}) => {
    return (
        /*<li class="list-group-item">Meiruko - chan</li>
        <li class="list-group-item">Chobits</li>
        <li class="list-group-item">BLAME!</li>
        <li class="list-group-item">Record Of Ragnarok</li>
        <li class="list-group-item">Boku no hiro</li>
        <li class="list-group-item">Golden Time</li>
        <li class="list-group-item">Hellsing</li>*/
        <li class="list-group-item">{registro.li} <BotonesComponent /></li>
    );

}

export default ListaComponent;