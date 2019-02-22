package br.com.fiap.teste;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.engine.transaction.jta.platform.internal.SynchronizationRegistryBasedSynchronizationStrategy;

import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Sexo;

public class TesteCrud {

	public static void main(String[] args) {
		//ENTITY MANAGER
		
		//1o preciso criar a fabrica
		
		//FABRICA
		//isso e uma classe
		//AQUI QUE CONECTO COM O MEU BANCO QUE SE CHAMA ORACLE NO CASO
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ORACLE");

		
		//criar o Entity Manager
		EntityManager em = factory.createEntityManager();
		
		//CADASTRAR 
		Cliente cliente2 = new Cliente("Bia", "42092667874", new GregorianCalendar(2000, Calendar.APRIL, 2), null, Sexo.FEMININO);
		Cliente cliente3 = new Cliente("Sofia", "42092667874", new GregorianCalendar (1994, Calendar.SEPTEMBER, 3), null, Sexo.FEMININO);

		
		
		em.persist(cliente3);
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		//PESQUISAR
		//pesquisar o cliente de id = 1
		Cliente pesquisaCliente = em.find(Cliente.class, 1);
		//verificar com sysout se esta funcionando
		System.out.println(pesquisaCliente.getNome());
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(pesquisaCliente.getDataNascimento().getTime()));
	
		//UPDATE
		//maneira incorreta --> atualizacao nao vai ser feita diretamente no banco
		pesquisaCliente.setNome("Beatriz");
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		//CORRETO
		//aqui estou atualizando o cliente de id 2
		Cliente atualizarCliente = new Cliente(2,"Luisa", "42092667874", new GregorianCalendar (1998, Calendar.MARCH, 6), null, Sexo.FEMININO);
		em.merge(atualizarCliente);
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		//METODO REFRESH 
		//Pesquisar o cliente de codigo 1
		Cliente pesquisaCliente2 = em.find(Cliente.class, 1);
		
		//Exibir o nome do cliente
		System.out.println(pesquisaCliente2.getNome());
		
		//Alterar no java o nome do cliente 
		cliente2.setNome("Mariana");
		
		//Exibir o nome
		System.out.println(cliente2.getNome());
		
		//Realizar Refresh	
		em.refresh(pesquisaCliente2);
		
		//Exibir o nome
		System.out.println(pesquisaCliente2.getNome());
		
		//REMOVE
		//Remover o cliente de id 1
		Cliente deleteCliente = em.find(Cliente.class,1);
		em.remove(deleteCliente);
		em.getTransaction().begin();
		em.getTransaction().commit();
		
	
		//fechar a fabrica e o manager	
		em.close();
		factory.close();
	}

}
