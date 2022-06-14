package com.generation.f20220602.modelos;

public class Proveedor extends Fabrica {

	// atributos
	private Integer productos;
	private Integer numCentroDistribucion;
	private Boolean despacho;

	// constructor vacio
	public Proveedor() {
		super();
	}

	// constructor con parametros
	public Proveedor(Integer productos, Integer numCentroDistribucion, Boolean despacho) {
		super();
		this.productos = productos;
		this.numCentroDistribucion = numCentroDistribucion;
		this.despacho = despacho;
	}

	// accesadores y mutadores

	public Integer getProductos() {
		return productos;
	}

	public void setProductos(Integer productos) {
		this.productos = productos;
	}

	public Integer getNumCentroDistribucion() {
		return numCentroDistribucion;
	}

	public void setNumCentroDistribucion(Integer numCentroDistribucion) {
		this.numCentroDistribucion = numCentroDistribucion;
	}

	public Boolean getDespacho() {
		return despacho;
	}

	public void setDespacho(Boolean despacho) {
		this.despacho = despacho;
	}

	@Override
	public String toString() {
		return "Proveedor [productos=" + productos + ", numCentroDistribucion=" + numCentroDistribucion + ", despacho="
				+ despacho + super.toString() + "]";
	}

	@Override
	public void comprar() {
		System.out.println("Comprar producto para vender al mayor");
	}

	// test
	public String pedidos(Boolean repartos) {
		if (repartos == true) {
			return "Repartos pendientes";
		} else {
			return "No hay repartos por hacer";
		}
	}

}
