package com.prueba.anotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.interfaces.IEmpleados;

public class DemoDosUsoAnottations {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		IEmpleados comercialDario = contexto.getBean("comercialExperimentado", IEmpleados.class);

		System.out.println(comercialDario.getTareas());
		System.out.println(comercialDario.getInforme());
		
		
		contexto.close();

	}

}
