package com.prueba.anotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.interfaces.IEmpleados;

public class DemoUsoAnottations {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		IEmpleados comercialDario = contexto.getBean("comercialExperimentado", IEmpleados.class);

		IEmpleados comercialSantiago = contexto.getBean("comercialExperimentado", IEmpleados.class);

		if (comercialDario == comercialSantiago) {
			System.out.println("Direcciones de memoria :");
			System.out.println("Singleton : apuntan al mismo objeto en memoria ");
			System.out.println(comercialDario + " \n " + comercialSantiago);
		} else {
			System.out.println("Prototype : NO APUNTAN al mismo lugar en memoria ,son dos intancias diferentes");
			System.out.println(comercialDario + " \n " + comercialSantiago);
		}
		
		
		contexto.close();
	}

}
