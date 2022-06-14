package com.generation.f20220602.modelos;

public class Cliente extends Fabrica {

	// atributos
	// un almacen pequeño
	private Boolean capacidadDeCompra;
	private int cantidadArticulos;
	private Integer dineroDeCompraMensual;

	// constructor vacio
	public Cliente() {
		super();
	}

	// constructor con parametros
	public Cliente(Boolean capicidadDeCompra, int cantidadArticulos, Integer dineroDeCompraMensual) {
		super();
		this.capacidadDeCompra = capicidadDeCompra;
		this.cantidadArticulos = cantidadArticulos;
		this.dineroDeCompraMensual = dineroDeCompraMensual;
	}

	// getter y setter accesadores y mutadores
	public Boolean getCapicidadDeCompra() {
		return capacidadDeCompra;
	}

	public void setCapicidadDeCompra(Boolean capicidadDeCompra) {
		this.capacidadDeCompra = capicidadDeCompra;
	}

	public int getCantidadArticulos() {
		return cantidadArticulos;
	}

	public void setCantidadArticulos(int cantidadArticulos) {
		this.cantidadArticulos = cantidadArticulos;
	}

	public Integer getDineroDeCompraMensual() {
		return dineroDeCompraMensual;
	}

	public void setDineroDeCompraMensual(Integer dineroDeCompraMensual) {
		this.dineroDeCompraMensual = dineroDeCompraMensual;
	}

	@Override
	public String toString() {
		return "Cliente [capicidadDeCompra=" + capacidadDeCompra + ", cantidadArticulos=" + cantidadArticulos
				+ ", dineroDeCompraMensual=" + dineroDeCompraMensual + super.toString() + "]";
	}

	@Override
	public void comprar() {
		System.out.println("Comprar producto final");
	}

	// test
	public String almacen(Boolean sinStock) {
		if (sinStock == true) {
			return "Debe comprar mercadería";
		} else {
			return "No es necesario";

		}
	}
}
