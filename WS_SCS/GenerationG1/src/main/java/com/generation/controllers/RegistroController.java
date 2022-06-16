package com.generation.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.generation.models.Usuario;
import com.generation.services.UsuarioService;

@Controller
@RequestMapping("/registro")
public class RegistroController {
	
	//inyeccion de dependencias (se hace en la parte superior para tener un orden)
	@Autowired
	UsuarioService usuarioService;
	
	// agregaremos una ruta para desplegar el jsp
	// Mapeo -metodo-return jsp
	@RequestMapping("")
	public String registro(@ModelAttribute("usuario") Usuario usuario) {//pasando un objeto vacio
		return "Registro.jsp";// pagina a desplegar
	}
	
	
	@PostMapping("/usuario/respaldo")
	public String registroUsuario(@RequestParam(value="nombre") String nombre,
			@RequestParam(value="apellido") String apellido,
			@RequestParam(value="edad") String edad){
		
		System.out.println("Parametro nombre " + nombre);
		System.out.println("Parametro apellido " + apellido);
		System.out.println("Parametro edad " + edad);
		
		return "Registro.jsp";// pagina a desplegar
	}
	
	@PostMapping("/usuario")
	public String guardarUsuario(@Valid @ModelAttribute("usuario") Usuario usuario,
			BindingResult resultado,
			//enviando informacion desde el controlador al jsp
			Model model) {
		
		if(resultado.hasErrors()) {//capturando si existe un error en el ingreso de datos desde el jsp
			model.addAttribute("msgError", "Debe realizar ingreso correcto de los datos");
			return "Registro.jsp";
			
		}
		
		//capturamos el objeto con los atributos llenos
		System.out.println(usuario.getNombre()+" "+usuario.getApellido()+" "+usuario.getEdad()+" "+usuario.getPassword());
		
		//enviar el objeto al service
		usuarioService.saveUsuario(usuario); 
		
		return "index.jsp";
	}
}