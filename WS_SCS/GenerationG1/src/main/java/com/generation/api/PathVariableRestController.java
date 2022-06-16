package com.generation.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/var") //localhost:8080/var -> path por default
public class PathVariableRestController {
	/** capturar variables desde la ruta o path */
	
	//{Puede ser cualquier nombre}
	//localhost:8080/var/anio/2022/mes/6/dia/13
	//capturando valores que van en la ruta
	@RequestMapping("/anio/{a}/mes/{m}/dia/{d}")
	public String capturarVariablesPath(@PathVariable("a") String anio, 
			@PathVariable("m") String mes, 
			@PathVariable("d") String dia) {
		
		return "la fecha es: " + anio + "/" + mes + "/" + dia;
	}
	
	//localhost:8080/var/fecha/2022/6/13 url
	//localhost:8080/var/fecha/{anio}/{mes}/{dia} estructura
	@RequestMapping("/fecha/{anio}/{mes}/{dia}")
	public String rutaCorta(@PathVariable("anio") String anio, 
			@PathVariable("mes") String mes,
			@PathVariable("dia") String dia) {
		
		return "la fecha es: " + anio + "/" + mes + "/" + dia;
	}
}