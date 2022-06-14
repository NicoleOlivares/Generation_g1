package com.generation.f20220525;

import java.util.Scanner;

public class ConditionalSwitch {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//menu
		System.out.println("Ingrese opción:");
		System.out.println("1 sumar \n 2 restar \n 3 multiplicar \n 4 dividir");
		int opcion = sc.nextInt();
		
		switch (opcion) {
		case 1:
			//accion para la opcion 1
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
			
		default:
			System.out.println("opción invalida");
			break;
		}
	}
}
