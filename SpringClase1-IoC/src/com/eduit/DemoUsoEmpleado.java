package com.eduit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoUsoEmpleado {

	public static void main(String[] args) {
		//creamos objetos de tipo empleado 
		
		JefeEmpleado e1 = new JefeEmpleado();
		
		//me creo una referencia a la abstraccion 
		Empleados e2 = new DirectorEmpleado();
		Empleados e3 = new SecretarioEmpleado();
		
		System.out.println("e1:" + e1.getTareas());
		System.out.println("e2:" + e2.getTareas());
		System.out.println("e3:" + e3.getTareas());
		
		//ahora hacemos lo mismo pero con el contenedor de spring 
		//paso 1 cargar el xml 
		//primero creo un contexto y le ponemos el nombre del archivo xml 
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//paso 2 
		//solicitarle el beans al archivo xml , pasandole el alias o id , y en segundo lugar 
		//le paso el nombre de la interface
		
		Empleados Juan = contexto.getBean("miEmpleado" , Empleados.class);
		
		//paso 3 : utilizamos el objeto que nos dio Spring 
		
		System.out.println("Utilizando mi primer bean : " + Juan.getTareas());
		
		
		
		//paso 4 : cerramos el contexto , para liberar recursos 
		contexto.close();
		
		
	}

}
