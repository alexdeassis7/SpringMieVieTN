package com.prueba.anotations;

import org.springframework.stereotype.Component;

import com.interfaces.CreacionInformesFinancieros;

//esta clase es la dependencia de la clase "ComercialExperimentado"
//la registramos en el contenedor de Spring 
@Component
public class InformeFinancieroTrimestre1 implements CreacionInformesFinancieros {

	@Override
	public String getInformeFinanciero() {
		
		return "presentaciom del informe financiero del primer trimetre del año";
	}

}
