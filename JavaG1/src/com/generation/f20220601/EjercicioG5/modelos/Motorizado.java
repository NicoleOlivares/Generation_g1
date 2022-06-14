package com.generation.f20220601.EjercicioG5.modelos;

public class Motorizado extends Terrestres {
	
	//atributo
	private Boolean motorElectrico;
	private String dise�oManurio;
	
	
	//constructor vacio
	public Motorizado() {
		super();
	}

	
	//constructor con parametros
	public Motorizado(Boolean motorElectrico, String dise�oManurio) {
		super();
		this.motorElectrico = motorElectrico;
		this.dise�oManurio = dise�oManurio;
	}


	//accesadores y mutadores getter y setter
	public Boolean getMotorElectrico() {
		return motorElectrico;
	}


	public void setMotorElectrico(Boolean motorElectrico) {
		this.motorElectrico = motorElectrico;
	}


	public String getDise�oManurio() {
		return dise�oManurio;
	}


	public void setDise�oManurio(String dise�oManurio) {
		this.dise�oManurio = dise�oManurio;
	}


	@Override
	public String toString() {
		return "Motorizado [motorElectrico=" + motorElectrico + ", dise�oManurio=" + dise�oManurio + "]";
	}	
}