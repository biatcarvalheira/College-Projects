package br.com.fiap.bean.anotacoes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//interface e uma anotacao 

@Retention (RetentionPolicy.RUNTIME)

@Target(ElementType.FIELD) //field == atributos

public @interface Coluna {

	String nome();
	
	String tipo();
	
	boolean obrigatorio() default false;
	
	//inseri um valor padrao, se nada for informado ele vai ser falso
	
}
