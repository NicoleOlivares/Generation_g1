package com.generation.f20220601.modelos;

public class Perro extends Mascota {
	// atributos
	private Integer cantPaseos;
	private Float tamanioHocico;
	private String sonidoVocal;

	// constructor parametros vacios
	public Perro() {
		super();
	}

	// constructor con parametros
	public Perro(Integer cantPaseos, Float tamanioHocico, String sonidoVocal) {
		super();
		this.cantPaseos = cantPaseos;
		this.tamanioHocico = tamanioHocico;
		this.sonidoVocal = sonidoVocal;
	}

	// accesadores y mutadores getter y setter
	public Integer getCantPaseos() {
		return cantPaseos;
	}

	public void setCantPaseos(Integer cantPaseos) {
		this.cantPaseos = cantPaseos;
	}

	public Float getTamanioHocico() {
		return tamanioHocico;
	}

	public void setTamanioHocico(Float tamanioHocico) {
		this.tamanioHocico = tamanioHocico;
	}

	public String getSonidoVocal() {
		return sonidoVocal;
	}

	public void setSonidoVocal(String sonidoVocal) {
		this.sonidoVocal = sonidoVocal;
	}

	@Override
	public String toString() {
		return "Perro [cantPaseos=" + cantPaseos + ", tamanioHocico=" + tamanioHocico + ", sonidoVocal=" + sonidoVocal
				+ super.toString() + "]";
	}

	@Override
	// Funcion en Java
	public void hacerSonido() {
		System.out.println("Guau, guau");
	}

}
