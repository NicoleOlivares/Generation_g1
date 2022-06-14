package com.generation.f20220524;

import java.util.Scanner;

public class Condicionales {
	
	public static void main(String[] args) {
		//capturar el ingreso por consola
		Scanner sc = new Scanner(System.in);
		//validar la mayoria de edad,
		//establecer punto critico -> 18 años
		
		int mayoriaEdad = 18;
		
		//solicitar el ingreso de edad
		System.out.println("Ingrese su edad:");
		int edad = sc.nextInt();//capturando el ingreso por consola
		
		if(edad >= mayoriaEdad) {
			System.out.println("Usted es mayor de edad");
		}else {
			System.out.println("No esta permitido su ingreso");
		}
		
		/*nombre*/
		String nombre = sc.nextLine();
		//primero solicitar todos los string
		//nombre, apellido, dirección
		//todo lo númerico
		//edad numero de la direccion
		//Saldo billullo
		
		//vamos a validar que el usuario
		//sea mayor de edad
		//saldo $50.000
		//no puede apostar, ¿cuánto puede apostar?
		//el minimo para apostar 10.000
		
		
		
	}

}
