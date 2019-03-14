package br.com.fiap.teste;


import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.fiap.dao.VeiculoDAO;
import br.com.fiap.dao.VeiculoDAOImpl;
import br.com.fiap.entity.Veiculo;
import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.IdNotFoundException;

class VeiculoDAOteste {

	// variavel dao precisa ser usada em todos entao vou criar fora dos metotos
	private static VeiculoDAO dao;

	// ANTES de todos os testes vou instanciar os objetos que se repetem

	@BeforeAll
	public static void beforeAll() {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("testeJUnit");
		EntityManager em = fabrica.createEntityManager();
		          dao = new VeiculoDAOImpl(em);
	}

	@Test
	@DisplayName("Teste de cadastro do DAO Generico")
	void Cadastrotest() {

		// Arrange - instanciar os objetos --> instancio todos os objetos que preciso
		Veiculo v = new Veiculo("Caminhão", "vermelho", 2017);
		
		// Act - chamar o metodo que sera testado
		dao.cadastrar(v);
		
		try {
			dao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
			
		}

		// Assert - validar o resultado
		assertNotEquals(0, v.getCd_veiculo());

	}

}
