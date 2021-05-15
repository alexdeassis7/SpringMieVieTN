package com.eduit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoUsoSingletonVsPrototype {

	public static void main(String[] args) {
		// cargamos el archivo de configuracion
		// primero creo un contexto y le ponemos el nombre del archivo xml
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");

		// petiiciones de beans al containner de spring
		// pedimos dos beans del tipo SecretarioEmpleado
		// como por defecto Spring trabaja con Singleton , esto quiere decir que
		// ambos beans deberian aputanr a la misma ddireccion de memoria

		SecretarioEmpleado marta = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);

		SecretarioEmpleado oscar = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);

		System.out.println(marta);
		System.out.println(oscar);

		if (marta == oscar) {
			System.out.println(" marta y oscar apuntan al mismo objeto ");
		} else {
			System.out.println(" marta y oscar NOOO son el mismo objeto ");

		}

	}
}
