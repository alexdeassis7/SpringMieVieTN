package com.eduit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoCicloDeVidaDeLosBeans {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");

		Empleados director = contexto.getBean("miDirectorEmpleado", DirectorEmpleado.class);

		System.out.println(director.getInforme());

		contexto.close();
		
	}

}
