package com.eduit;

public class SecretarioEmpleado implements Empleados {

	private CreacionInformes informeNuevo;

	@Override
	public String getTareas() {
		return "soy un secretario y me gusta obedecer ordenes de mi jefe";
	}

	@Override
	public String getInforme() {
		return "";
	}

	// Inyeccion de dependencias mediante un setters
	// para hacer uso de esta inyeccion tenemos que previamente
	// definir el tag <property> den nuestro applicationContex.xml

	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
}
