package com.generation.f20220526;

import java.util.Arrays;

public class ColeccionArray {
	
	public static void main(String[] args) {
		//array o arreglo o matriz ESTATICOS o fijos
		//definiendo matriz
		//definir tipo de dato
		
		String[] colores  = {"red","blue","yellow","orange","black"};
		Integer [] numerosPares = {2,4,6,8,10,12};
		int[] primerosNumeros = {1,2,3,4,5,6,7,8,9,9,0};
		
		//posicion iniciaal es cero (0)
		//lo consultamos con el uso de la variable y los corchetes
		System.out.println(colores[0]);
		System.out.println(numerosPares[0]);
		System.out.println(primerosNumeros[0]);
		
		//nombre array [posicioin] -> accediendo al elemento del arreglo de esa posicion
		numerosPares[3] = 14;//cambia el elemento del número 8 a el numero 14
		System.out.println(numerosPares[3]);
		
		//numerosPares[7] = 14;//supera el tamaño del arreglo 
		//la diferencia con javascript es que no adiciona espacios vacios
		//se le dice ERROR FUERA DE INDICE
		
		System.out.println("tamaño array colores " + colores.length);
		System.out.println("tamaño array numeros pares " + numerosPares.length);
		
		//
		System.out.println(colores);
		System.out.println(numerosPares);
		System.out.println(primerosNumeros);
		
		//así era en los otros lenguajes
		System.out.println(colores.toString());
		System.out.println(numerosPares.toString());
		System.out.println(primerosNumeros.toString());
		
		//imprimir el contenido del arreglo
		System.out.println(Arrays.toString(colores));
		System.out.println(Arrays.toString(numerosPares));
		System.out.println(Arrays.toString(primerosNumeros));
		
		//recorrer un arreglo
		for (int i = 0; i < primerosNumeros.length; i++) {
		System.out.println(primerosNumeros[i]+" ");	//espacio
		}
		
		//salto de linea
		System.out.println("\n");
		//foreach
		for (int elemento : primerosNumeros) {
			System.out.println(elemento);
		
		}
		
		for (String color : colores) {
		System.out.print(color + " ");
		}
	}
	
	

}
