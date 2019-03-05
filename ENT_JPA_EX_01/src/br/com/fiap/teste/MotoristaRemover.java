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
import br.com.fiap.exception.ErroNotFoundException;

public class MotoristaRemover {

	public static void main(String[] args) throws ErroCommitException, ErroNotFoundException {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ORACLE");
		EntityManager em = factory.createEntityManager();
		
		//INSTANCIEI MEU FUNCIONARIO DAO 
		MotoristaDAO dao = new MotoristaDAOImpl(em);
		
		//pesquisar 
		
		Scanner ent = new Scanner (System.in);
		
		int carteira;
		System.out.println("Digite o número da carteira");
		carteira = ent.nextInt();
		
		Motorista m = dao.pesqMotorista(carteira);
		dao.removMotorista(carteira);
		dao.commit();
		
		em.close();
		factory.close();
				
	}

}
