package com.generation.f20220526;

public class funciones {
	//static nos permite acceder al metodo
	public static void main(String[] args) {
		/*funciones, hay 4 tipos:
		 * 2 que retornan: public Integer, public int, public string, etc.
		 * 2 que no retornan: void: solo ejecuta no retorna,
		 * nombre_funcion se escribe con minuscula la primera letra */
		//no puede CREAR un metodo dentro de otro metodo, si puede llamar a otro metodo como el llamar la funcion saludo
		saludo();
		calculoSumaPares(true, 23, "33", 44l, "Sumar");
		
		//ejemplo edad
		int edad = obtenerEdad();
		System.out.println(edad);
	}
	
	//nivel de acceso, tipo_de_retorno, nombre_funcion(parametro a recibir)
	public static void calculoSumaPares(boolean verdad, int numero1, String numero2, Long numero3, String accion) {//tenemos que definir el tipo de dato que voy a recibir
		
		//Aqui lo modifico para futuras operaciones
		Integer num2 = Integer.parseInt(numero2);
		
		//Si lo ponemos aquí solo sirve para esa operacion Integer.parseInt(numero2)
		System.out.println(numero1 +  num2 + numero3);
		
	}
	
	//puede recibir o no recibir parametros
	public void calculoSumaImpares() {
		//solicitar el ingreso de datos
	}
	
	public static void saludo() {
		System.out.println("Buenos días");
	}
	
	//tipo publica que retorna un tipo de dato
	public static Integer obtenerEdad() {
		
		Integer edad = 18;
		
		return edad;//retorna el contenido de la variable
	}
	
	//funcion publica boleana: true o false
	public Boolean validarMayorEdad(Integer edad) {
		
		if(edad >=18) {
			System.out.println("Es mayor de edad");
			return true;
		}else {
			System.out.println("Es menor de edad");
			return false;
		}
	}
}
