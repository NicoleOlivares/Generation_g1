package com.generation.f20220601.EjercicioG5.modelos;

public class Motorizado extends Terrestres {
	
	//atributo
	private Boolean motorElectrico;
	private String diseņoManurio;
	
	
	//constructor vacio
	public Motorizado() {
		super();
	}

	
	//constructor con parametros
	public Motorizado(Boolean motorElectrico, String diseņoManurio) {
		super();
		this.motorElectrico = motorElectrico;
		this.diseņoManurio = diseņoManurio;
	}


	//accesadores y mutadores getter y setter
	public Boolean getMotorElectrico() {
		return motorElectrico;
	}


	public void setMotorElectrico(Boolean motorElectrico) {
		this.motorElectrico = motorElectrico;
	}


	public String getDiseņoManurio() {
		return diseņoManurio;
	}


	public void setDiseņoManurio(String diseņoManurio) {
		this.diseņoManurio = diseņoManurio;
	}


	@Override
	public String toString() {
		return "Motorizado [motorElectrico=" + motorElectrico + ", diseņoManurio=" + diseņoManurio + "]";
	}	
}