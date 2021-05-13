package com.eduit;

public class SecretarioEmpleado implements Empleados {

	@Override
	public String getTareas() {
		return "soy un secretario y me gusta obedecer ordenes de mi jefe";
	}

	@Override
	public String getInforme() {
		return "";
	}

}
