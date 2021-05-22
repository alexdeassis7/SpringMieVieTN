package ar.com.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ar.com.aop.dao.ClienteDao;
import ar.com.aop.dao.ClienteVIPDAO;

public class ClasePrincipal {

	public static void main(String[] args) {
		// leemos la configuracion de Spring
		// le indicamos al metodo constructor cual es la clase que posee la
		// configuracion
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);

		// obtenemos el bean del contenedor de Spring
		ClienteDao miCliente = contexto.getBean("clienteDAO", ClienteDao.class);

		// obtenemos otro bean del contenedor de Spring
		ClienteVIPDAO miClienteVIP = contexto.getBean("clienteVIPDAO", ClienteVIPDAO.class);

		// llamamos al metodo insertaCliente()
		System.out.println("********************* miCliente.insertaCliente() ***********************************");
		miCliente.insertaCliente();// este es el nombre del metodo que debe coincidir con la anotation @Before
		System.out.println("********************* miClienteVIP.insertaCliente()*********************************");
		miClienteVIP.insertaCliente();
		System.out.println("********************* miClienteVIP.insertaClienteVIP()*********************************");
		miClienteVIP.insertaClienteVIP();
		System.out.println("********************* miClienteVIP.insertaClienteVIPConError()*************************");
		try {
			miClienteVIP.insertaClienteVIPConError();
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("e.getMessage()" + e.getMessage());
			System.out.println("Se capturo una Exception");
		}

		// cerramos el contexto
		contexto.close();
	}

}
