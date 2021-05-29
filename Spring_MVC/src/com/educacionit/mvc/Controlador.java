package com.educacionit.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //indicamos que esta clase es un controlador 
public class Controlador {
	//url : http://localhost:8080/Spring_MVC
	
	@RequestMapping
	public String muestraPagina() {
		//aqui le decimos la ruta , pero sin la extension del archivo
		return "paginaEjemplo";
	}
}
