package com.generation.f20220601.pruebasunitarias;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class CalculadoraTest2 {

	@Test
	public void testSuma() {
		Calculadora calc = new Calculadora();
		int resultado = calc.suma(12, 42);

		// assertEquals(ValorEsperado, Resultado);
		assertEquals(54, resultado);
	}

	@Test
	public void testResta() {

	}

	@Test
	public void testMultiplicacion() {

	}

	@Test
	public void testDivision() {
		Calculadora calc = new Calculadora();
		String resultado = calc.division(12, 0);

		// assertEquals(ValorEsperado, Resultado);
		assertNotNull(resultado);
	}

}
