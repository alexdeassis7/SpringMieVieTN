package com.prueba.anotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.interfaces.CreacionInformesFinancieros;
import com.interfaces.IEmpleados;

//utilizamos una anotation para registrar el bean en el contenedor de spring , no es necesario 
//qeu el id coincida con el nombre de la clase , podemos  prescindir de darle un ID al componente
//y Spring tomaria como id al nombre de la clase pero con la primer letra en minuscula ,
@Component("comercialExperimentado")

//demo @spcope , lo modificamos para que sea capaz de crear varias instancias de un objeto 
//@Scope("prototype")
public class ComercialExperimentado implements IEmpleados {

	private CreacionInformesFinancieros informeNuevo;

	// creamos un constructor para que a traves de este constructor pueda inyectar
	// la dependencia,
	// con @Autowired spring busca en todo mi proyecto
	// si existe una clase que implemente la interface "CreacionInformesFinancieros"
	// y si la encuentra
	// es de esa clase de donde obtiene la inyeccion de dependencia , en este caso
	// encontraria la clase
	// "InformeFinancieroTrimestre1" , una vez que spring detecta la clase
	// despues solamente deberiamos invocar al metodo getInforme()
	@Autowired
	// si comentamos el @AutoWired todo seguira funcionando , en las ultimas
	// versiones de spring no
	// es necesario utilizarlo , si es recomendable

	public ComercialExperimentado(CreacionInformesFinancieros informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		return "Soy un Super vendedor y me encargo de vender mucho!";
	}

	@Override
	public String getInforme() {
		// utilizamos el metodo getInforme de la interface mediante la inyeccion de
		// dependencias
		return informeNuevo.getInformeFinanciero();
	}

	// Para usar PostConstruct y PreDestroyd SI o SI debemos utlizar scope
	// "Singleton" y
	// si estamos en versiones de java * o superior recordar que no trae el package
	// "javax.anotation-api"
	// esto se debe a que spring no maneja el ciclo de vida por completo del bean si
	// trabajamos con un scope "prototype" ,

	// ejecucion de codigo despues de la creacion o construccion del bean
	@PostConstruct
	public void ejecutarDespuesCreacion() {
		System.out.println("ejecutamos este proceso tras la creacion de nuestro bean en el containner ");
	}

	// ejecucion de codigo despues del apagado del contenedor de spring
	@PreDestroy
	public void ejecutaAntesCreacion() {
		System.out.println("ejecutando antes de la destrucccion ");
	}

}
