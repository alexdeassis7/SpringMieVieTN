package com.eduit;

public class DirectorEmpleado implements Empleados {

	
	
	
	@Override
	public String getTareas() {
		
		return "Gestiono la nomina de todos los empleados";
	}

	@Override
	public String getInforme() {
		//implementamos el metodo getInforme de la interface 
		return "informe creado por el director ";
	}

}
