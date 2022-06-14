package com.generation.f20220523;

public class CalculoPromedio {
	
	public static void main(String[] args) {
		//int cantidadNotas = 12;
		//arreglo
		Integer[] notas = {20,50,67,99,-5,10,0,88,-88,77,58,-5,79,33,50};
	
	//variables acumuladoras
	int sumaNotas = 0;
	int notasFueraDeRango = 0;
	
	//como recorrer el arreglo de notas
	for (int i = 0; i < notas.length; i++) {
		//validar notas negativa o arriba de 100
		if(notas[i] < 0 || notas [i] > 100) {
			System.out.println("la nota:" +notas[i] + " en la posicion " + (i+1) + ", esta fuera de rango");
			notasFueraDeRango++;
		}
		
		sumaNotas = sumaNotas + notas[i];//accedemos a la nota [i]
		
	}
	//System.out.println("suma de notas " + sumaNotas);

	//promedio-> suma todas las notas / cantidad de notas;
	float promedio = sumaNotas/notas.length;
	
	System.out.println("\nEl promedio es: " +promedio);
	/*TODO validar el orden >= */
	//101
	
	//punto critico
	//0>=reprobado<=49; 50>=Aprobado<=100
	
	
	if (promedio >= 50 && promedio <= 100) {
		System.out.println("Alumno aprobado");
		
	}else if(promedio >= 0 && promedio <= 50){
		System.out.println("Alumno reprobado");	
	}else {
		System.out.println("El dato que ingreso esta fuera del rango");
	}
	
	}
	
}
