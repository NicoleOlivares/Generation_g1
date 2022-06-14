package com.generation.f20220524;

import java.util.Scanner;

public class datosCasino {
	
	public static void main(String[] args) {
	//Capturar datos por consola
	Scanner sc = new Scanner(System.in);
	/*nombre
	*String nombre = sc.nextLine();
	*primero solicitar todos los string
	*nombre, apellido, dirección
	*todo lo númerico
	*edad numero de la direccion
	*Saldo billullo
	
	*vamos a validar que el usuario sea mayor de edad
	*saldo $50.000
	*no puede apostar, ¿cuánto puede apostar?
	*el minimo para apostar 10.000*/
		
	//solicitando todos los string
		
	//nombre
	System.out.println("Ingrese su nombre:");
	String nombre = sc.nextLine();
	//apellido
	System.out.println("Ingrese su apellido:");
	String apellido = sc.nextLine();
	//direccion
	System.out.println("Ingrese su dirección, sin número:");
	String direccion = sc.nextLine();
		
	//solicitando datos númericos
	
	//edad
	System.out.println("Ingrese su edad:");
	int edad = sc.nextInt();
	//numero de la direccion
	System.out.println("Ingrese el número de su dirección:");
	int numeroDireccion = sc.nextInt();
	//saldo
	System.out.println("Ingrese su saldo disponible:");
	int saldo = sc.nextInt();
	
	//validando datos
	int mayoriaEdad = 18;
	int saldoMin = 50000;
	int apuestaMin = 10000;
	int saldoApuesta;
	
	//que el usuario sea mayor de edad
	if(edad >= mayoriaEdad) {
		System.out.println("Usted es un adulto,");
		
		//que el saldo sea $50.000
		if(saldo >= saldoMin) {
			System.out.println("¿Cuánto desea apostar?");
			saldoApuesta = sc.nextInt();
			
			//minimo de apuesta es $10.000
			if(saldoApuesta >= apuestaMin) {
				System.out.println("Apuesta aceptada");
				
			}else {
				System.out.println("La apuesta mínima son $10.000");
			}
		}else {//No cumple con apuesta minima
			System.out.println("Pero no cumple con el saldo mínimo para ingresar");
		}
		
	}else {//MENOR DE EDAD
		System.out.println("No esta permitido su ingreso");
	}		
	

	}
}
