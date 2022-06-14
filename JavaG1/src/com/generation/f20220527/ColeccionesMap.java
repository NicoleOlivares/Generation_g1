package com.generation.f20220527;

import java.util.ArrayList;
import java.util.HashMap;

public class ColeccionesMap {

	public static void main(String[] args) {
		// colecciones Map
		//Pares clave <-> valor
		//HashMap<K,V> map = new HashMap<K,V>();
		//K key o clave; V value o valor
		//HashMap mapa = new HashMap();  Este es el que más se utiliza
		//es lo más parecido a un api?
		HashMap objetoHashMap = new HashMap();
		
		objetoHashMap.put("Nombre", "Nicole");
		objetoHashMap.put("ApellidoP", "Olivares");
		objetoHashMap.put("ApellidoM", "Vidal");
		objetoHashMap.put("Edad", "42");
		objetoHashMap.put("Saludo", "Hola");
		
		System.out.println("Elementos del mapa");
		System.out.println(objetoHashMap);
		
		//Obtener un valor a traves de la clave
		System.out.println(objetoHashMap.get("ApellidoM"));
		
		//eliminar par
		objetoHashMap.remove("ApellidoP");
		System.out.println(objetoHashMap);
		
		//muestra todas las llaves disponibles
		System.out.println(objetoHashMap.keySet());
		
		//mostrando todos los valores en el mapa (un siso)
		System.out.println(objetoHashMap.values());
		
		ArrayList<String> vocales = new ArrayList<String>();
		vocales.add("a");
		vocales.add("e");
		vocales.add("i");
		vocales.add("o");
		vocales.add("u");
		
		//creando un arreglo permite agregar harta data
		objetoHashMap.put("vocales", vocales);
		System.out.println(objetoHashMap);
		
		//imprimiendo array
		System.out.println(objetoHashMap.get("vocales"));
		
		//Recorriendo un HashMap
		objetoHashMap.keySet();
		for(Object clave : objetoHashMap.keySet()) {
			System.out.println("clave: "+clave +" - valor: "+objetoHashMap.get(clave)); 

		}
	}

}
