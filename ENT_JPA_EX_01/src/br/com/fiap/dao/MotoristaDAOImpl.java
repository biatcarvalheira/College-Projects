package br.com.fiap.dao;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Motorista;
import br.com.fiap.exception.ErroCommitException;
import br.com.fiap.exception.ErroNotFoundException;

public class MotoristaDAOImpl implements MotoristaDAO {

	private EntityManager em;

	public MotoristaDAOImpl(EntityManager em) {
		super();
		this.em = em;
	}
	
	
	//CREATE
	@Override 
	public void MotoristaCad (Motorista motorista) {
		em.persist(motorista);
	}
	
	
	//READ 
	@Override
	public Motorista pesqMotorista (int carteira) {
		return em.find(Motorista.class, carteira);
	}
	
	
	//UPDATE 
	@Override
	public void atualMotorista (Motorista motorista) {
		 em.merge(motorista);
	}
	
	
	//REMOVE
	@Override
	public void removMotorista(int carteira) throws ErroNotFoundException {
		
		Motorista m = pesqMotorista(carteira);
		
		if (m==null) {
			
			throw new ErroNotFoundException("Motorista não cadastrado");
		}
		
		em.remove(m);
	}
	
	
	//COMMIT
	@Override
	public void commit() throws ErroCommitException {
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();

			
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
			throw new ErroCommitException ("Erro de commit");
		}
	}

}
 