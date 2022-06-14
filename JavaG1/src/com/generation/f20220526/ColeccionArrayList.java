package com.generation.f20220526;

import java.util.ArrayList;
import java.util.Collections;

public class ColeccionArrayList {

	public static void main(String[] args) {
		//Arreglo de tipo objeto
		
		// ArrayList palabra reservada DINAMICOS
		//tipo de dato
		//instancia de clase: es un objeto o una variable o colores de tipo String que la estamos inicializando como objeto
		
		ArrayList<String> colores = new ArrayList<String>();
		ArrayList<Integer> numerosPares = new ArrayList<Integer>();
		
		//agregar un elemento a la lista
		colores.add("rojo");
		colores.add("azul");
		colores.add("morado");
		colores.add("naranja");
		colores.add("dorado");
		
		//si existe un elemento en esa posicion lo desplaza a la derecha
		colores.add(1,"verde");
		
		//imprimir el contenido
		System.out.println(colores);

		//acceder a un elemento
		System.out.println(colores.get(0));
		
		//tamaño del arreglo size()  
		System.out.println(colores.size());
		
		//modificar un elemento
		colores.set(1, "Negro");
		System.out.println(colores);
		
		//quitar un elemento
		colores.remove(1);
		System.out.println(colores);
		
		System.out.print("\n");
		
		//recorrer el arreglo
		for (int i = 0; i < colores.size(); i++) {
			System.out.println(colores.get(i));
		}
		
		System.out.println("***********************");
		//foreach
		for (String color : colores) {
			System.out.println(color);
		}
		
		//ordena el array de forma ascendente desde donde esta hacia abajo afecta al arreglo
		Collections.sort(colores);
		System.out.println(colores);
				
		//quitar todos los elementos
		colores.clear();
		System.out.println(colores);
		
		
		numerosPares.add(14);
		numerosPares.add(2);
		numerosPares.add(8);
		numerosPares.add(6);
		numerosPares.add(10);
		numerosPares.add(20);
		System.out.print(numerosPares+" ");
		System.out.println();
		
		System.out.println("\n********reverse********");
		//No ordena descendentemente 
		Collections.reverse(numerosPares);
		System.out.println(numerosPares+" ");
		System.out.println("***********************\n");
		//ordena de menor a mayor
		Collections.sort(numerosPares);
		System.out.println(numerosPares+" ");
	}
}
