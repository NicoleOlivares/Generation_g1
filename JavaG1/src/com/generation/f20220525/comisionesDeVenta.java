package com.generation.f20220525;

import java.util.Scanner;

public class comisionesDeVenta {
	
	public static void main(String[] args) {
	//Calculadora de comisiones
	
	/*Aplicación que tome la entrada númerica*/
	Scanner sc = new Scanner(System.in);
	

	System.out.println("Ingrese el monto de venta:");
	int montoVenta = sc.nextInt();
	
	int montoComision;
	String suComisionEs = "Su comision es $";
	  
	final float porcentaje1 = 0.1f;
	final float porcentaje2 = 0.2f;
	final float porcentaje3 = 0.3f;

	/*
	 * Se debe calcular la comisión en función de;
	 * Comisión de ventas:
	>= a   $10000 - 30% 
	$5001 - $9999 - 20%
	$5000 no tiene comision 
	$1001 - $4999 - 10%  
	<= a     $1000 - N/A */ 
	
	if (montoVenta >= 10000) {
        System.out.println("Su comision es de: " +  montoVenta * porcentaje3 + " pesos");
    } else if (montoVenta >= 5001) {
        System.out.println("Su comision es de: " +  montoVenta * porcentaje2 + " pesos");
    } else if (montoVenta < 5000 && montoVenta >= 1001) {
        System.out.println("Su comision es de: " +  montoVenta * porcentaje1 + " pesos");
    } else {
        System.out.println("No tiene comision");
    }

}
}