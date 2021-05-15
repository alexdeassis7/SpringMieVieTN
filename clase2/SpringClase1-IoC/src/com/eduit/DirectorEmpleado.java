package com.eduit;

public class DirectorEmpleado implements Empleados {
	// Creamos un atributo del Tipo CreacionInformes(la interface) , para la
	// inyeccion de dependencia
	private CreacionInformes informeNuevo;

	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		return "Gestiono la nomina de todos los empleados";
	}

	@Override
	public String getInforme() {
		// implementamos el metodo getInforme de la interface
		return "informe creado por el director ";
	}

	// creamos metodo init : ejecutar tareas antes de que el bean este disponible
	// dentro del containner
	// los metodos no tienen por que ser "void" siempre , pero la mayoria de las
	// veces lo seran
	// y tampoco tienen que llamarse init o destroy, pueden tener cualquier nombre
	// valido !
	public void metodoInicial() {
		// aca va el codigo que deseamos ejecutar antes de que el bean este disponible
		System.out.println("ejecutando tareas antes de que el bean este listo para su uso ");
	}

	public void metodoFinal() {
		// aca va el codigo que deseamos ejecutar luego de que el bean "muera"
		System.out.println("Ejecutando tareas dentro del metodo destroy");

	}
}