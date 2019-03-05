package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dao.MotoristaDAO;
import br.com.fiap.dao.MotoristaDAOImpl;
import br.com.fiap.entity.Gen;
import br.com.fiap.entity.Motorista;
import br.com.fiap.exception.ErroCommitException;

public class MotoristaAtualizar {

	public static void main(String[] args) throws ErroCommitException {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ORACLE");
		EntityManager em = factory.createEntityManager();
		
		//INSTANCIEI MEU FUNCIONARIO DAO 
		MotoristaDAO dao = new MotoristaDAOImpl(em);
		
		//pesquisar 
		
		Scanner ent = new Scanner (System.in);
		
		int numCarteira;
		System.out.println("Digite o número da carteira");
		numCarteira = ent.nextInt();
		
		Motorista m = new Motorista(26, "Bia Carva", new GregorianCalendar(1992,Calendar.AUGUST,26), null, Gen.FEMININO);
		m.setCarteira(numCarteira);
		dao.atualMotorista(m);
		dao.commit();
		
		em.close();
		factory.close();
				
	}

}
