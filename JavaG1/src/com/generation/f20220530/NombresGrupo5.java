package com.generation.f20220530;

public class NombresGrupo5 {

	public static void main(String[] args) {
		Alumno alumno1 = new Alumno("Héctor", "Gómez", 29, "G1");
		Alumno alumno2 = new Alumno("Coty", "Mardones", 27, "G1");
		Alumno alumno3 = new Alumno("Ignacio", "Galaz", 29, "G1");
		Alumno alumno4 = new Alumno("Fernando", "Faúndez", 29, "G1");
		Alumno alumno5 = new Alumno("Nicole", "Olivares", 28, "G1");
		
		//alumno
		System.out.println("*****************");
		System.out.println("*****Grupo 5*****");
		System.out.println("*****************");
		
		System.out.println();

		System.out.println("Datos de alumno 1:");
		System.out.println("- Nombre: " + alumno1.getNombre());
		System.out.println("- Apellido: " + alumno1.getApellido());
		System.out.println("- Edad: " + alumno1.getEdad());
		System.out.println("- Curso: " + alumno1.getCurso());
		System.out.println();

		System.out.println("Datos de alumno 2:");
		System.out.println("- Nombre: " + alumno2.getNombre());
		System.out.println("- Apellido: " + alumno2.getApellido());
		System.out.println("- Edad: " + alumno2.getEdad());
		System.out.println("- Curso: " + alumno2.getCurso());
		System.out.println();

		System.out.println("Datos de alumno 3:");
		System.out.println("- Nombre: " + alumno3.getNombre());
		System.out.println("- Apellido: " + alumno3.getApellido());
		System.out.println("- Edad: " + alumno3.getEdad());
		System.out.println("- Curso: " + alumno3.getCurso());
		System.out.println();

		System.out.println("Datos de alumno 4:");
		System.out.println("- Nombre: " + alumno4.getNombre());
		System.out.println("- Apellido: " + alumno4.getApellido());
		System.out.println("- Edad: " + alumno4.getEdad());
		System.out.println("- Curso: " + alumno4.getCurso());
		System.out.println();

		System.out.println("Datos de alumno 5:");
		System.out.println("- Nombre: " + alumno5.getNombre());
		System.out.println("- Apellido: " + alumno5.getApellido());
		System.out.println("- Edad: " + alumno5.getEdad());
		System.out.println("- Curso: " + alumno5.getCurso());
		
	}

}
