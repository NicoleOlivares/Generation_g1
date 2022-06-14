package com.generation.f20220527;

public class Auto {
	
		//Una clase es un modelo o prototipo 
		//a partir de el se van a crear objetos
		//un objeto nace a partir de la clase, caracteristicas o atributo
		//tiene metodos o funciones
		//algo concreto, lo convertimos en abstracto(no tangible).
		//tangible: usamos los 5 sentidos para describir
		
		//atributo
		/*color;
		ruedas:
		marca;
		luces;
		chasis;
		carroceria;
		modelo;
		nitro;
		puertas;
		asientos;
		peso;
		velocidad;
		kilometraje;
		precio;
		combustible;*/
		
		//funciones
		/*traslado
		trabajo
		cargar
		encender
		frenar
		reproducir musica
		volar
		remolcar
		frenar
		ventilar
		retroceder/avanzar*/
		
		//atributo siempre privados
		//accesador tipo nombreDelAtributo
		private String color;
		private String marca;
		private String modelo;
		private Double velocidad;
		
		//CONSTRUCTORES
		
		//constructor vacio
		public Auto() {
			
		}
		
		//Constructor con parametros clic secundario->source->generate constructor using Fields
		public Auto(String color, String marca, String modelo, Double velocidad) {
			super();
			this.color = color;
			this.marca = marca;
			this.modelo = modelo;
			this.velocidad = velocidad;
		}

		
		//ACCESADORES Y mutadores (get y set) clic secundario->source->Generate Getters and Setters
		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public Double getVelocidad() {
			return velocidad;
		}

		public void setVelocidad(Double velocidad) {
			this.velocidad = velocidad;
		}
		
		//METODOS O FUNCIONES PERSONALIZADAS
		public void aumentarVelocidad() {//las funciones que sean creadas dentro de un objeto no llevan el static
			this.velocidad = 10d;
			//vamos a crearle a esta variable un valor
			
		}

}
