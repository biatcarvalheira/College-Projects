package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dao.MotoristaDAO;
import br.com.fiap.dao.MotoristaDAOImpl;
import br.com.fiap.entity.Gen;
import br.com.fiap.entity.Motorista;
import br.com.fiap.exception.ErroCommitException;

public class MotoristaCadastrar {

	public static void main(String[] args) throws ErroCommitException {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory ("ORACLE");
		EntityManager em = factory.createEntityManager();
		
		//estou instanciando um novo objeto do motorista e implementando com o novo objeto do motorista dao 
		MotoristaDAO dao = new MotoristaDAOImpl (em);
		
		Motorista nwMotorista = new Motorista(2555, "Sofia", new GregorianCalendar(1994, Calendar.SEPTEMBER,03),null, Gen.FEMININO);
		
		
		dao.MotoristaCad(nwMotorista);
		dao.commit();
		
		em.close();
		factory.close();
		
		

	}
	

}
