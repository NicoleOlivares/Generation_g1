package com.generation.f20220601;

import java.util.ArrayList;
import java.util.List;

import com.generation.f20220601.modelos.Gato;
import com.generation.f20220601.modelos.Mascota;
import com.generation.f20220601.modelos.Mishi;
import com.generation.f20220601.modelos.Perro;

public class Main {

	public static void main(String[] args) {
		//Herencia
		Mascota mascota = new Mascota();
		mascota.setColor("gris");
		mascota.setNombre("tom");
		
		
		
		Perro perro = new Perro();
		perro.setColor("RedFaund");
		perro.setNombre("Ayun");
		
		
		Gato gato = new Gato();
		gato.setEspecie("Felino");
		gato.setPelaje("pelo");
		gato.setPeso(3);
		
		System.out.println(gato.toString());
		
		Mishi mishi = new Mishi(true);
		mishi.setColor("Amarillo");
		
		System.out.println(mishi.toString());
		
		/*Polimorfismo*/
		//Paso 2: 
		List<Mascota> listaMascotas = new ArrayList<Mascota>();
		//Paso 1: Creando una instancia de mascota
		Mascota regalon = new Mascota("negro", "Canes", "Pelo", "Firulais", 1.5f, "Macho");
		//agregando regalon a la lista
		listaMascotas.add(regalon);
		
		//un objeto padre se comporta como hija
		//instancia numero 2
		Mascota felix = new Gato();
		felix.setNombre("Felix");
		felix.setColor("Negro");
		felix.setPeso(3);
		
		//agregando a la lista
		listaMascotas.add(felix);
		
		//instancia numero 3
		Perro chocolo = new Perro();
		chocolo.setNombre("Chocolo");
		chocolo.setColor("Café");
		chocolo.setPeso(10);
		//agregando a la lista
		listaMascotas.add(chocolo);
		
		//instancia de prueba 4
		Mascota nieto = new Mishi();
		nieto.setNombre("Copito");
		nieto.setColor("Blanco");
		nieto.setPeso(1);
		//agrego a la lista
		listaMascotas.add(nieto);
		
		
		//LLamando al metodo en mascota
		regalon.hacerSonido();
		felix.hacerSonido();
		chocolo.hacerSonido();
		//llamando al mishi
		nieto.hacerSonido();
		
		
		System.out.println("**********foreach*********");
		//recorrer el arreglo
		for (Mascota mascota2 : listaMascotas) {
			mascota2.hacerSonido();
			
		}
		
		//transformar el objeto generico a uno especifico
		//generico quiere decir que solo accedemos a los setter y getter de mascota
		//especifico es que se le dan los setter y getter de Perro
		Perro perroChocolo = (Perro) chocolo;
		perroChocolo.setCantPaseos(6);
		
		
		
		System.out.println(perroChocolo);
	}

}
