package com.generation.f20220602.modelos;

public class Fabrica {

	// Atributos
	private String nombre;
	private String rut;
	private String direccion;
	private String giro;
	private int factura;
	// comprador vendedor

	// constructor vacio
	public Fabrica() {
		super();
	}

	// constructor con parametros
	public Fabrica(String nombre, String rut, String direccion, String giro, int factura) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.direccion = direccion;
		this.giro = giro;
		this.factura = factura;
	}

	// accesadores y mutadores getter y setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getGiro() {
		return giro;
	}

	public void setGiro(String giro) {
		this.giro = giro;
	}

	public int getFactura() {
		return factura;
	}

	public void setFactura(int factura) {
		this.factura = factura;
	}

	@Override
	public String toString() {
		return "Fabrica [nombre=" + nombre + ", rut=" + rut + ", direccion=" + direccion + ", giro=" + giro
				+ ", factura=" + factura + "]";
	}

	// Funcion en Java
	public void comprar() {
		System.out.println("Comprar materia prima");
	}
}
