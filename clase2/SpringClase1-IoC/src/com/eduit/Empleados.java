package com.eduit;

//creamos una abstraccion , con un metodo getTareas
public interface Empleados {
	public String getTareas();

	// este metodo lo utilizaremos para la inyeccion de dependencias
	public String getInforme();
}
