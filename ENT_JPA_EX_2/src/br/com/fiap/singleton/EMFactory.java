package br.com.fiap.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFactory {

	//1. Atributo estático que será unico
	//factory só vai ser instanciada uma vez
	private static EntityManagerFactory factory;
	
	//2. Construtor privado vazio, para a classe não ser instanciada
	private EMFactory() {
		
	}
	
	//3. Método estático com a lógica para criar o objeto único --> o factory so vai ser criado uma vez
	public static EntityManagerFactory getInstance() {
		//se o objeto factory estiver vazio vai ser criado---> se não, não vai ser
		if (factory == null) {
			factory = Persistence.createEntityManagerFactory("ORACLE");
		}
		return factory;
	}
	
}