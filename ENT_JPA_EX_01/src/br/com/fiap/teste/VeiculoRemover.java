package br.com.fiap.teste;


import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import br.com.fiap.dao.VeiculoDAO;
import br.com.fiap.dao.VeiculoDAOImpl;
import br.com.fiap.entity.Veiculo;
import br.com.fiap.exception.ErroCommitException;
import br.com.fiap.exception.ErroNotFoundException;

public class VeiculoRemover {

	public static void main(String[] args) throws ErroCommitException, ErroNotFoundException {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ORACLE");
		EntityManager em = factory.createEntityManager();
		
		//INSTANCIEI MEU FUNCIONARIO DAO 
		VeiculoDAO dao = new VeiculoDAOImpl(em);
		
		//pesquisar 
		
		Scanner ent = new Scanner (System.in);
		
		int cdVeiculo;
		System.out.println("Digite o código do veículo");
		cdVeiculo = ent.nextInt();
		
		Veiculo v = dao.pesqVeiculo(cdVeiculo);
		dao.removeVeiculo(cdVeiculo);
		dao.commit();
		
		em.close();
		factory.close();
				
	}

}
