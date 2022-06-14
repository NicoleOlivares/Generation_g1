package com.generation.f20220601.EjercicioG5.modelos;

public class Terrestres extends MediosDeTransportes{
	
	//atributos
	private Boolean motor;
	private String carroceria;
	
	//constructor vacio
	public Terrestres() {
		super();
	}

	
	//constructor con parametros
	public Terrestres(Boolean motor, String carroceria) {
		super();
		this.motor = motor;
		this.carroceria = carroceria;
	}


	
	//accesadores y mutadores getter y setter
	public Boolean getMotor() {
		return motor;
	}


	public void setMotor(Boolean motor) {
		this.motor = motor;
	}


	public String getCarroceria() {
		return carroceria;
	}


	public void setCarroceria(String carroceria) {
		this.carroceria = carroceria;
	}


	@Override
	public String toString() {
		return "Terrestres [motor=" + motor + ", carroceria=" + carroceria + "]";
	} 
}
