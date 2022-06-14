package com.generation.f20220601.pruebasunitarias;

public class Calculadora {

	public static void main(String[] args) {
		int numero = 21;
		if (numPar(numero)) {
			System.out.println("Es par");
		} else {
			System.out.println("No es par");
		}

	}

	// sumar, restar, division, multiplicacion

	// suma
	public int suma(int numero1, int numero2) {
		return numero1 + numero2;
	}

	// resta
	public int resta(int numero1, int numero2) {
		return numero1 - numero2;
	}

	// multiplicacion
	public int multiplicacion(int numero1, int numero2) {
		return numero1 * numero2;
	}

	// division
	public String division(int numero1, int numero2) {
		if (numero2 != 0) {
			String resultado = Integer.toString(numero2 / numero2);
			return resultado;
		}
		return "No se puede dividir por cero";
	}

	// Metodo numero par/impar
	public static Boolean numPar(int num1) {
		if (num1 % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}

}
