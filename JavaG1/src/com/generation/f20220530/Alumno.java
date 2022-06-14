package com.generation.f20220530;

public class Alumno {//El objeto debe ser singular y no plural
	
	/*atributo:
	 * privado: se necesita permiso para acceder a los atributos.
	 * publico: es como un condominio o parque, todos tienen acceso.*/
	private String nombre;
	private String apellido;
	private int edad;
	private String curso;

	//CONSTRUCTORES
	//constructor vacio
	public Alumno() {
		super();
	}

	
	//Constructor con parametros 
	public Alumno(String nombre, String apellido, int edad, String curso) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.curso = curso;
	}


	
	//ACCESADORES Y mutadores
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}

	//to String clic secundario->source->Generate to String ()...
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", curso=" + curso + "]";
	}	
	
	
	//METODOS O FUNCIONES PERSONALIZADAS

}
