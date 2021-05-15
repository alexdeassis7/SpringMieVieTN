package com.eduit;

public class Informe implements CreacionInformes {

	@Override
	public String getInforme() {
		
		return "Esto es un informe detallado , y es la caracteristica en comun que "
				+ "tienen todos los objetos (secretario,director, etc...)";
	}

}
