package com.generation.f20220601.pruebasunitarias;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

	@Test
	public void testSuma() {
		Calculadora calc = new Calculadora();
		int resultado = calc.suma(12, 42);

		// assertEquals(ValorEsperado, Resultado);
		assertEquals(54, resultado);
	}

	@Test
	public void testDivision() {
		Calculadora calc = new Calculadora();
		String resultado = calc.division(0, 0);

		assertEquals("No se puede dividir por cero", resultado);
		assertNotNull(resultado);

	}

	// test resta
	@Test
	public void testResta() {
		Calculadora calc = new Calculadora();
		int resultadoResta = calc.resta(5, 5);

		assertEquals(0, resultadoResta);

	}

	// test multiplicacion
	@Test // indica que es un test
	public void testMultiplicacion() {// funcion para el test
		Calculadora calc = new Calculadora();// Instancia
		int resultadoMultiplicacion = calc.multiplicacion(5, 5);// variable con llamado a la funcion?

		assertEquals(25, resultadoMultiplicacion);// test
	}

	@Test
	public void testnumPar() {
		Calculadora calc = new Calculadora();//instancia
		
		
		Boolean esPar = true;
		Boolean noPar = false;
		
		Boolean testEsPar = calc.numPar(8);
		Boolean testNoPar = calc.numPar(3);
		
		assertEquals(testEsPar, esPar);
		assertEquals(testNoPar, noPar);
		
	}

}
