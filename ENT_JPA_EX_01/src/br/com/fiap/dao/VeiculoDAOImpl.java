package br.com.fiap.dao;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Motorista;
import br.com.fiap.entity.Veiculo;
import br.com.fiap.exception.ErroCommitException;
import br.com.fiap.exception.ErroNotFoundException;

public class VeiculoDAOImpl implements VeiculoDAO {
	
	//crio a Entity manager 
	EntityManager em;

	
	//CONSTRUTOR
	public VeiculoDAOImpl(EntityManager em) {
		super();
		this.em = em;
	}
	
	//CREATE 
	
	@Override
	public void cadVeiculo (Veiculo veiculo) {
		em.persist(veiculo);
	}
	
	
	//READ
	@Override
	public Veiculo pesqVeiculo (int cd_veiculo) {
		return em.find(Veiculo.class, cd_veiculo);
	}
	
	//UPDATE
	@Override
	public void atualVeiculo (Veiculo veiculo) {
		em.merge(veiculo);
	}
	
	//REMOVE
	@Override
	public void removeVeiculo(int cd_veiculo) throws ErroNotFoundException{
		Veiculo v = pesqVeiculo(cd_veiculo);
		
		if (v==null) {
			throw new ErroNotFoundException("Veiculo não cadastrado");
		}
		
		em.remove(v);
	}
	
	
	//COMMIT
	//begin and commit
	
	public void commit() throws ErroCommitException {
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
			throw new ErroCommitException("Erro de commit");
		}
		
	}
	

}
