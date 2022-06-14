package com.generation.f20220601.EjercicioG5.modelos;

public class Maritimos extends MediosDeTransportes{
	
	//atributos
	private float pesoAncla;
	private int cantidadVelas;
	
	//constructor vacio
	public Maritimos() {
		super();
	}

	
	//constructor con parametros
	public Maritimos(float pesoAncla, int cantidadVelas) {
		super();
		this.pesoAncla = pesoAncla;
		this.cantidadVelas = cantidadVelas;
	}


	
	//accesadores y mutadores getter y setter
	public float getPesoAncla() {
		return pesoAncla;
	}


	public void setPesoAncla(float pesoAncla) {
		this.pesoAncla = pesoAncla;
	}


	public int getCantidadVelas() {
		return cantidadVelas;
	}


	public void setCantidadVelas(int cantidadVelas) {
		this.cantidadVelas = cantidadVelas;
	}


	@Override
	public String toString() {
		return "Maritimos [pesoAncla=" + pesoAncla + ", cantidadVelas=" + cantidadVelas + "]";
	}
}
