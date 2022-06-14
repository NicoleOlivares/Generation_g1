package com.generation.f20220523;

public class main {
	
	public static void main(String[] args) {
		//variables
		//Se define el tipo de dato al cual pertenecera la variable
		//tipo de dato nombre_variable = asignación;
		String nombre = "Generation1234''\" \n 56787!akjgkgb";
		System.out.println(nombre);
		
		//variables numericas
		//32bits
		int numeroInt = 2147483647;
		System.out.println(numeroInt);
		
		//8bits
		byte numeroByte = 127;
		System.out.println(numeroByte);
		
		//16bits
		short numeroShort = 32767;
		System.out.println(numeroShort);
		
		//64bits(2^63)
		long numeroLong = 123456;
		System.out.println(numeroLong);
		
		//16bits 
		//char 
		
		//variable booleana (true false)
		boolean acepta = true;//false
		
		//variable genero y color de cabello
		String genero = "Genero: Femenino";
		System.out.println(genero);
		
		String cabello = "Cabello: negro";
		System.out.println(cabello);
		
		//variable compromiso debe ser boolean
		boolean compromiso = true;
		if (compromiso == true) {
			System.out.println("Estoy comprometida");
		}else {
			System.out.println("Me da lo mismo");
		}
		
		//poblacion
		int poblacion = 356;
		
		/******************************/
		
		//Variables tipo objeto 
		//String
		System.out.println(cabello.charAt(1));
		
		String curso = "g1";
		
		//lois String se comparan con equals
		if(curso.equals("G1")) {
			System.out.println("iguales");
		}else {
			System.out.println("distintos");
		}
		
		if(curso.equalsIgnoreCase("g1")) {
			System.out.println("iguales");
		}else {
			System.out.println("distintos");
		}
		
		//minuscula
		if(curso.toLowerCase().equals("g1")) {
			System.out.println("iguales");
			
		}else {
			System.out.println("distintos");
		}
		
		//mayuscula
		if(curso.equals("g1".toUpperCase())) {
			System.out.println("iguales");
			
		}else {
			System.out.println("distintos");
		}
		
		String curso2 = "";//vacio
		
		String curso3 = null; //null
		
		//comparar un String con null
		if (null == curso3) {}
		
		
		//float y double
		//cast, es convertir un dato a otro tipo de dato
		float altura = (float) 1.56; //1.73f
		Float peso = (float) 85.5; //85.5f
		
		
		Float gravedad = Float.parseFloat("9.6");
		
		//Parse: convertir String a un tipo de numero
		Integer.parseInt("23"); //sirve para funciones
		Long.parseLong("1243425466");
		Float.parseFloat("85.5");
		Double.parseDouble("1241234.56");
		
		//ejercicio
		//como convertir una variable primitiva a una variable de tipo objeto
		int num1= 12;
		
		/*CONVERSION DE DATOS*/
		//automatica
		//byte > short > int > long > float > double
		
		int num4 = 18;
		float num4f = num4;
		System.out.println(num4+" "+ num4f);
		
		//manual 
		//double > float > long > int >...
		//Double peso2 = 75.9;
		//float peso2F = peso2.floatValue();
		//Float peso2F = peso2PF;
		//Float peso2F = peso2.floatValue();
		
		
		//de float a int se pierden los decimales
		//Float a Integer, se pierden los decimales.
		
		/*if( 5 == (3+2) ) {
			
		}*/

		
	}

}
