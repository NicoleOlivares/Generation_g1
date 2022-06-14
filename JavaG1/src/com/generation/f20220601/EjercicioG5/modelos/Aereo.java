package com.generation.f20220601.EjercicioG5.modelos;

public class Aereo extends MediosDeTransportes {
	
	//atributo
	private String turbina;
	private int cantidadHelices;
	private float largoAlas;
	
	//constructor vacio
	public Aereo() {
		super();
	}

	
	//constructor con parametros
	public Aereo(String turbina, int cantidadHelices, float largoAlas) {
		super();
		this.turbina = turbina;
		this.cantidadHelices = cantidadHelices;
		this.largoAlas = largoAlas;
	}

	
	//accesadores y mutadores getter y setter
	public String getTurbina() {
		return turbina;
	}


	public void setTurbina(String turbina) {
		this.turbina = turbina;
	}


	public int getCantidadHelices() {
		return cantidadHelices;
	}


	public void setCantidadHelices(int cantidadHelices) {
		this.cantidadHelices = cantidadHelices;
	}


	public float getLargoAlas() {
		return largoAlas;
	}


	public void setLargoAlas(float largoAlas) {
		this.largoAlas = largoAlas;
	}


	@Override
	public String toString() {
		return "Aereo [turbina=" + turbina + ", cantidadHelices=" + cantidadHelices + ", largoAlas=" + largoAlas + "]";
	}
}
