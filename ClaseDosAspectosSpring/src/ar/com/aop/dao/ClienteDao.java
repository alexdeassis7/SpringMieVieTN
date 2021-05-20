package ar.com.aop.dao;

import org.springframework.stereotype.Component;

@Component("clienteDAO")
public class ClienteDao {

	public void insertaCliente() {

		System.out.println("se inserto el cliente en la base de datos correctamente ");
	}

}
