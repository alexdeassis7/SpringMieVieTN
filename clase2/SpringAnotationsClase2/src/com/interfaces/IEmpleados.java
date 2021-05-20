package com.interfaces;

//creamos una abstraccion , que tiene el metodo getTareas y getinformes
public interface IEmpleados {

	public String getTareas();

	// este metodo lo utilizaremos para la Inyeccion de dependencias
	public String getInforme();

}
