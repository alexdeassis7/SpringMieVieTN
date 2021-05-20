package ar.com.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//clase que configura para que spring sepa que se trata del archivos de conf 
//y que vamos a utilizar AOP , tambien le indicaremos donde buscar las clases con los aspectos
@Configuration // indicamos que esta clase es un archivo de conf
@EnableAspectJAutoProxy // habilitamos la configuracion de AOP
@ComponentScan("ar.com.aop") // le indicamos a donde ir a buscar los aspectos , esto busca en el package raiz
								// yen los package subyacentes
public class Configuracion {
//esta clase no nesecita codigo en su interior 
}
