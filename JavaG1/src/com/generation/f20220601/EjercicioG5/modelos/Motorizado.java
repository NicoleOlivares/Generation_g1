package com.generation.f20220601.EjercicioG5.modelos;

public class Motorizado extends Terrestres {
	
	//atributo
	private Boolean motorElectrico;
	private String diseñoManurio;
	
	
	//constructor vacio
	public Motorizado() {
		super();
	}

	
	//constructor con parametros
	public Motorizado(Boolean motorElectrico, String diseñoManurio) {
		super();
		this.motorElectrico = motorElectrico;
		this.diseñoManurio = diseñoManurio;
	}


	//accesadores y mutadores getter y setter
	public Boolean getMotorElectrico() {
		return motorElectrico;
	}


	public void setMotorElectrico(Boolean motorElectrico) {
		this.motorElectrico = motorElectrico;
	}


	public String getDiseñoManurio() {
		return diseñoManurio;
	}


	public void setDiseñoManurio(String diseñoManurio) {
		this.diseñoManurio = diseñoManurio;
	}


	@Override
	public String toString() {
		return "Motorizado [motorElectrico=" + motorElectrico + ", diseñoManurio=" + diseñoManurio + "]";
	}	
}