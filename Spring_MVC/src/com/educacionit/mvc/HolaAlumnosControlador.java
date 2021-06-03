package com.educacionit.mvc;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//en esta clase crearemos dos metodos uno solicitara el formulario y el otro 
//procesara la informacion que el usuario relleno en el formulario 
@Controller
public class HolaAlumnosControlador {

	// este metodo proporcionara el formulario al user
	// le indicamos a Spring que haremos una peticion de una url , por comvencion
	// solemos usar el mismo nombre que el nombre del metodo
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario() {
		return "HolaAlumnosFormulario";
	}

	@RequestMapping("/procesaFormulario")
	public String procesaFormulario() {
		return "HolaAlumnosSpring";
	}

	// este metodo procesara la informacion del modelo y llama luego a la vista
	@RequestMapping("/procesaFormulario2")
	// este metodo recibe dos parametros el request y el modelo
	public String procesaFormularioDos(HttpServletRequest request, Model modelo) {
		// leemos la informacion que viene del input del form (este seria el nombre )
		String nombre = request.getParameter("nombreAlumno");

		// le agregamos informacion al modelo
		nombre += " es el alumno mejor calificado para su empresa! ";

		String mensajeFinal = " Quien es el mejor de su grupo? " + nombre;

		// agregamos informacion o datos al modelo
		modelo.addAttribute("mensaje", mensajeFinal);

		return "HolaAlumnosSpring";
	}

}
