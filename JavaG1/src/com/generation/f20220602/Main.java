package com.generation.f20220602;

import java.util.ArrayList;
import java.util.List;

import com.generation.f20220601.modelos.Mascota;
import com.generation.f20220602.modelos.Cliente;
import com.generation.f20220602.modelos.Fabrica;
import com.generation.f20220602.modelos.Proveedor;

public class Main {

	public static void main(String[] args) {

		// instancia
		// General
		Fabrica fabrica = new Fabrica();
		fabrica.setNombre("TuFabriquita");
		fabrica.setRut("123456789-0");

		Proveedor proveedor = new Proveedor();
		proveedor.setNombre("TuProveedor");
		proveedor.setRut("5555555-5");

		Cliente cliente = new Cliente();
		cliente.setNombre("ElMasGlorioso");
		cliente.setRut("2222222-2");

		System.out.println(fabrica.toString());

		/* Polimorfismo */
		List<Fabrica> listaF = new ArrayList<Fabrica>();
		Fabrica fabricandoAndo = new Fabrica("LaFabriquita", "12345-0", "Aquitoy 23", "Mayorista", 000021);
		listaF.add(fabricandoAndo);

		// una fabrica/proveedor
		Fabrica mayorista = new Proveedor();
		mayorista.setNombre("Mayoreo");
		listaF.add(mayorista);

		Fabrica abastecimiento = new Cliente();
		abastecimiento.setNombre("MateriaPrima");
		listaF.add(abastecimiento);

		fabricandoAndo.comprar();
		mayorista.comprar();
		abastecimiento.comprar();

		System.out.println("\n**********foreach*********");
		// foreach
		for (Fabrica fabrica2 : listaF) {
			fabrica2.comprar();

		}

		// espacio
		System.out.println();

		// dando propie
		Cliente almacen = (Cliente) abastecimiento;
		almacen.setCantidadArticulos(20);

		System.out.println(almacen);

	}

}
