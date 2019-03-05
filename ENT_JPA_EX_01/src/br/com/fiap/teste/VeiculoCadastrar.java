package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dao.VeiculoDAO;
import br.com.fiap.dao.VeiculoDAOImpl;
import br.com.fiap.entity.Veiculo;
import br.com.fiap.exception.ErroCommitException;

public class VeiculoCadastrar {

	public static void main(String[] args) throws ErroCommitException {
		
		//CREATE 
		//Para criar um teste tenho que criar um Entity Manager e uma Entity Factory
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory ("ORACLE");
		EntityManager em = factory.createEntityManager();
		
		VeiculoDAO dao = new VeiculoDAOImpl(em);
		
		Veiculo nwVeiculo = new Veiculo("Volkswagen - carro2", "verde", 2012);
		
		dao.cadVeiculo(nwVeiculo);
		dao.commit();
		
		em.close();
		factory.close();
		

	}

}
