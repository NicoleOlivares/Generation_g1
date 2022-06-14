package com.generation.f20220602.modelos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ProveedorTest {
	@Test
	public void testProveedor() {
		Proveedor proveedor = new Proveedor();
		String delivery = "Repartos pendientes";
		String noDelivery = "No hay repartos por hacer";

		String testDelivery = proveedor.pedidos(true);
		String testNoDelivery = proveedor.pedidos(false);

		assertEquals(testDelivery, delivery);
		assertEquals(testNoDelivery, noDelivery);
	}

	@Test
	public void testCliente() {
		Cliente cliente = new Cliente();
		String sinStock = "Debe comprar mercadería";
		String hayStock = "No es necesario";

		String testSinStock = cliente.almacen(true);
		String testHayStock = cliente.almacen(false);

		assertEquals(testSinStock, sinStock);
		assertEquals(testHayStock, hayStock);
		
		assertFalse(false, testHayStock);
		assertTrue(true, testSinStock);

	}

}
