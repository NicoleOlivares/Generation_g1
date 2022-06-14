package com.generation.f20220526;

public class funcionesCalculadora {
	
	public static void main(String[] args) {
		//libreria Math
		
		//elevar o potencia 
		double numeroElevado = Math.pow(4.4, 1);
		System.out.println(numeroElevado);
		
		//Redondear al entero nayor
		double enteroMayor = Math.ceil(numeroElevado);
		System.out.println(enteroMayor);
		
		//Redondear al entero menor
		double enteroMenor = Math.floor(numeroElevado);
		System.out.println(enteroMenor);
		
		//Redondeo
		double enteroRedondeado = Math.round(3.49);
		System.out.println(enteroRedondeado);
		
		double num1 = 12;
		double num2 = 5;
		double div = num1/num2;
		System.out.println(div);
		
		//numeros aleatorios
		//Math.random() >= 0.0 y < 1.0
		double aleatorio = Math.random();
		System.out.println(aleatorio);
		
		//numeros aletorios entre 0 y otro número se debe multiplicar
		double num010 = Math.random() * 10;
		System.out.println(num010);
		
		//numeros aleatorios entre 2 y 8 maximo con el minimo sumado con el minimo
		double num28 = (Math.random() * (8-2))+2;
		System.out.println(num28);
		System.out.println(Math.abs(num28));
		System.out.println(Math.round(num28));
		System.out.println(Math.floor(num28));
		
		//
		double num29 = (Math.random() * (1+2))-2;
		System.out.println(num29);
	}

	
}
