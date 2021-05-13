package com.eduit;

public class JefeEmpleado implements Empleados {

	@Override
	public String getTareas() {
		return "soy el jefe y me encargo de toda tarea operativa ";
	}

	@Override
	public String getInforme() {
		return " ";
	}

}
