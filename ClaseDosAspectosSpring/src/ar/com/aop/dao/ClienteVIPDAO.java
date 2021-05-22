package ar.com.aop.dao;

import org.springframework.stereotype.Component;

@Component("clienteVIPDAO")
public class ClienteVIPDAO {
	// esta clase poseee un metodo insertaCliente() con el mismo nombre que la clase
	// ClienteDAO()
	public void insertaCliente() {

		// aqui estaria el codigo que realiza la insercion en la Base de datos

		System.out.println("insertaCliente() se inserto un cliente VIP en la base de datos con exito!");
	}

	public void insertaClienteVIP() {
		// aqui estaria el codigo que realiza la insercion en la Base de datos

		System.out.println("insertaCliente() se inserto un cliente VIPPPPPPPP en la base de datos con exito!");
	}

	public void insertaClienteVIPConError() throws Exception {
		// aqui estaria el codigo que realiza la insercion en la Base de datos
		System.out.println("insertaClienteVIPConError() se inserto un cliente VIP en la base de datos con exito!");
		throw new Exception();
	}

}
