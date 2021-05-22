package ar.com.aop.aspectos;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


//esta clase sera nuestro aspecto , con esa funcionalidad "transversal" que tiene que 
//ejecutarse siempre 
@Component //indicamos que esta clase es un componente
@Aspect // indicamos que esta clase ademas sera un Aspecto 
public class LoginConAspectos {

	//utilizamos before para que se ejecute ANTES del metodo insertaCliente
	//que pasa si tengo mas de un metodo con este nombre en distintas clases??? 
	//hagamos la prueba con una clase nueva ClienteVIPDAO  ,el aspecto se va a ejecutar siempre 
	//por que no hace distinciones de nombre de clase ,que pasa si solo quiero que se ejecute 
	//el aspecto creado para los clienteVIP
	//como podemos hacedrlo ?? simplemente utilizando un pointCutExpression
	//para ello tenemos que incluir la ruta en la anotacion @Before
	//@Before("execution(public void ar.com.aop.dao.ClienteVIPDAO.insertaCliente())")
	
	//y si quiero que se ejecute el aspecto para todos los metodos que se llamen 
	//inserta......*()
	//utilizamos este pointCut
	//@Before("execution(public void inserta*())")
	
	@Before("execution(public void insertaCliente())")
	public void antesInsertarCliente() {
		System.out.println("ASPECTO >>>>>> Se comprobo y efectivamente el usuario que intenta hacer el insert se encuentra logueado ");
		System.out.println("ASPECTO >>>>>> el role/perfil del usuario logueado posee los permisos necesarios y puede insertar en la base de datos ");
	}
	
	//Esta anotacion ejecuta un advice despues de la ejecucion del pointCut especificado ,
	//siempre que el metodo del punto de corte retorne de forma "normal" osea sin lanzar una exception
	@AfterReturning("execution(public void insertaCliente())")
	public void despuesDeInsertarCliente() {
		System.out.println("Este metodo se ejecuta magicamente despues de insertaCliente()");
	}
	
	@AfterThrowing(pointcut = "execution(public * insertaClienteVIPConError())", throwing = "daoe")
	public void logExeption(Exception daoe) {
		System.out.println("sucedio un Error en el metodo insertaClienteVIPConError() por eso me acabo de ejecutar!!!");
	}
	
	
}
