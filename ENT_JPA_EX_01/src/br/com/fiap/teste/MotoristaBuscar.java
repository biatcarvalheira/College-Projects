package br.com.fiap.teste;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dao.MotoristaDAO;
import br.com.fiap.dao.MotoristaDAOImpl;
import br.com.fiap.entity.Motorista;

public class MotoristaBuscar {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ORACLE");
		EntityManager em = factory.createEntityManager();
		
		//INSTANCIEI MEU FUNCIONARIO DAO 
		MotoristaDAO dao = new MotoristaDAOImpl(em);
		
		//pesquisar 
		
		Scanner ent = new Scanner (System.in);
		
		int numCarteira;
		System.out.println("Digite o número da carteira");
		numCarteira = ent.nextInt();
		
		Motorista m = dao.pesqMotorista(numCarteira);
		
		System.out.println("Nome: " + m.getNome());
		
	}

}
