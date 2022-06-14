package com.generation.f20220531.manager;

import java.util.List;

import com.generation.f20220531.Cliente;

public class ClienteManager {

	// recorrer el arreglo e imprimir
	// recibimos la lista dentro de una funcion
	public void recorrerArrregloCliente(List<Cliente> listaCliente) {
		for (int i = 0; i < listaCliente.size(); i++) {
			System.out.println("Cliente "  + i +"\n" + listaCliente.toString());
		}
	}

}
