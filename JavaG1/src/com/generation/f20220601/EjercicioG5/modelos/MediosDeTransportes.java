package com.generation.f20220601.EjercicioG5.modelos;

public class MediosDeTransportes {
	//Atributos
	private int cantRuedas;
	private String matContruccion;
	private String color;
	private String tipoTraccion;
	private Boolean tieneLuces;
	private int cantLuces;
	
	//constructor vacio
	public MediosDeTransportes() {
		super();
	}

	//constructor con parametros
	public MediosDeTransportes(int cantRuedas, String matContruccion, String color, String tipoTraccion,
			Boolean tieneLuces, int cantLuces) {
		super();
		this.cantRuedas = cantRuedas;
		this.matContruccion = matContruccion;
		this.color = color;
		this.tipoTraccion = tipoTraccion;
		this.tieneLuces = tieneLuces;
		this.cantLuces = cantLuces;
	}
	
	
	
	//accesadores y mutadores getter y setter
	public int getCantRuedas() {
		return cantRuedas;
	}

	public void setCantRuedas(int cantRuedas) {
		this.cantRuedas = cantRuedas;
	}

	public String getMatContruccion() {
		return matContruccion;
	}

	public void setMatContruccion(String matContruccion) {
		this.matContruccion = matContruccion;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipoTraccion() {
		return tipoTraccion;
	}

	public void setTipoTraccion(String tipoTraccion) {
		this.tipoTraccion = tipoTraccion;
	}

	public Boolean getTieneLuces() {
		return tieneLuces;
	}

	public void setTieneLuces(Boolean tieneLuces) {
		this.tieneLuces = tieneLuces;
	}

	public int getCantLuces() {
		return cantLuces;
	}

	public void setCantLuces(int cantLuces) {
		this.cantLuces = cantLuces;
	}

	@Override
	public String toString() {
		return "MediosDeTransportes [cantRuedas=" + cantRuedas + ", matContruccion=" + matContruccion + ", color="
				+ color + ", tipoTraccion=" + tipoTraccion + ", tieneLuces=" + tieneLuces + ", cantLuces=" + cantLuces
				+ "]";
	}
}
