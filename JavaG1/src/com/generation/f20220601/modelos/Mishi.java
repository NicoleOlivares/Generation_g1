package com.generation.f20220601.modelos;

public class Mishi extends Gato{
	private Boolean famosoEnInternet;
	
	//Constructor vacio
	public Mishi() {
		super();
	}

	
	//Constructor con parametros
	public Mishi(Boolean famosoEnInternet) {
		super();
		this.famosoEnInternet = famosoEnInternet;
	}


	public Boolean getFamosoEnInternet() {
		return famosoEnInternet;
	}

	//getter y setter
	public void setFamosoEnInternet(Boolean famosoEnInternet) {
		this.famosoEnInternet = famosoEnInternet;
	}


	@Override
	public String toString() {
		return "Mishi [famosoEnInternet=" + famosoEnInternet + this.getColor() + "]";
	}
	
	@Override
	public void hacerSonido() {
		System.out.println("Miuuuu, miuuu");
	}
	
	

}
