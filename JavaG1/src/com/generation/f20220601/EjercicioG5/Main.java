package com.generation.f20220601.EjercicioG5;

import com.generation.f20220601.EjercicioG5.modelos.Aereo;
import com.generation.f20220601.EjercicioG5.modelos.Maritimos;
import com.generation.f20220601.EjercicioG5.modelos.MediosDeTransportes;
import com.generation.f20220601.EjercicioG5.modelos.Motorizado;
import com.generation.f20220601.EjercicioG5.modelos.Terrestres;

public class Main {
	
	public static void main (String[] args) {
		
		//instancia de objetos
		MediosDeTransportes mediosDT = new MediosDeTransportes();
		Terrestres terrestres = new Terrestres();
		Maritimos maritimo = new Maritimos();
		Aereo aereo = new Aereo();
		Motorizado motorizado = new Motorizado();
		
		//setter y getter
		mediosDT.setColor("Rojo");
		mediosDT.setCantLuces(4);
		mediosDT.setCantRuedas(2);
		mediosDT.setMatContruccion("Acero");
		
		terrestres.setCantRuedas(4);
		
		maritimo.setCantidadVelas(4);
		
		aereo.setTurbina("Holi");
		
		motorizado.setMotorElectrico(true);
		
		
		
		//System.out.println();
		System.out.println(mediosDT.toString());
		System.out.println(terrestres.toString());
		System.out.println(maritimo.toString());
		System.out.println(aereo.toString());
		System.out.println(motorizado.toString());

		
		
		
	}

}
