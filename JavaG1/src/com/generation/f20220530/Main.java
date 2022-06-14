package com.generation.f20220530;

import java.util.ArrayList;//Ctrl + clic
import java.util.List;

import com.generation.f20220531.Cliente;

public class Main {
	//las interfaces solamente definen los metodos, es decir, es solo la estructura.
	//en cambio el ArrayList es una clase 
	public static void main(String[] args) {
		//Definiendo lista de alumnos//23
		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
		
		
		//instancia de una clase: es invocar un objeto, se puede invocar un objeto dentro de otro objeto.
		//Alumno = objeto; alumno = variable; Alumno = instancia
		Alumno alumno = new Alumno();//asignamos constructor vacio
		//asignamos constructor con parametros
		Alumno alumno2 = new Alumno("Leonardo", "Utreras", 26, "G1");
		
		
		
		//agregando variables//23
		listaAlumnos.add(alumno);
		listaAlumnos.add(alumno2);
		
		
		
		//getter: obtiene un valor del atributo
		System.out.println(alumno.getNombre());//variable alumno
		System.out.println(alumno2.getNombre());//variable alumno2
		
		//alumno.setNombre("Diana");
		//setter: asignar un valor al atributo
		alumno.setNombre("Nicole");//asignando nombre
		System.out.println(alumno.getNombre());
		
		
		System.out.println("******************for*************");
		
		//For para la lista//23
		for(int i = 0; i < listaAlumnos.size(); i++) {
			System.out.println(listaAlumnos.get(i).getNombre());
			System.out.println(listaAlumnos.get(i).getApellido());
			System.out.println(listaAlumnos.toString());
			
		}
		
		System.out.println("******************foreach****************");
		
		//foreach
		for (Alumno objetoAlumno : listaAlumnos) {
			System.out.println(objetoAlumno.getNombre());
			System.out.println(objetoAlumno.getCurso());
			System.out.println("**********************************");
			System.out.println(objetoAlumno.toString());
		}
		
		
		System.out.println("*******************to String***************");
		
		//to String clic secundario->source->Generate to String ()...
		System.out.println(alumno2.toString());//el to String se debe hacer donde se declara el objeto.
		
	}

}
