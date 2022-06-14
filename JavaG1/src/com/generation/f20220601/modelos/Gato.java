package com.generation.f20220601.modelos;

public class Gato extends Mascota {
	private Boolean garrasRetractil;
	private Boolean visionNocturna;
	private String sonidoVocal;

	// constructor parametro vacio
	public Gato() {
		super();
	}

	// constructor con parametro
	public Gato(Boolean garrasRetractil, Boolean visionNocturna, String sonidoVocal) {
		super();
		this.garrasRetractil = garrasRetractil;
		this.visionNocturna = visionNocturna;
		this.sonidoVocal = sonidoVocal;
	}

	// getter y setter accesadores y mutadores
	public Boolean getGarrasRetractil() {
		return garrasRetractil;
	}

	public void setGarrasRetractil(Boolean garrasRetractil) {
		this.garrasRetractil = garrasRetractil;
	}

	public Boolean getVisionNocturna() {
		return visionNocturna;
	}

	public void setVisionNocturna(Boolean visionNocturna) {
		this.visionNocturna = visionNocturna;
	}

	public String getSonidoVocal() {
		return sonidoVocal;
	}

	public void setSonidoVocal(String sonidoVocal) {
		this.sonidoVocal = sonidoVocal;
	}

	@Override
	public String toString() {
		return "Gato [garrasRetractil=" + garrasRetractil + ", visionNocturna=" + visionNocturna + ", sonidoVocal="
				+ sonidoVocal + super.toString() + "]";
	}

	// super permite enlazarse con su clase padre
	// Funcion en Java
	@Override //Estamos sobreescribiendo el metodo que tienen por default las mascotas Se asegura que es una sobreescritura
	public void hacerSonido() {
		System.out.println("Miau, Miau");
	}
}
