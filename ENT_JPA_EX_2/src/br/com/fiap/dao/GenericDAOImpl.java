package br.com.fiap.dao;

import javax.persistence.EntityManager;

import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.IdNotFoundException;

import java.lang.reflect.ParameterizedType;


public class GenericDAOImpl<T,K> implements GenericDAO<T,K> {
	
	//E instanciar o EntityManager
		private EntityManager em;
	
	//Armazenar a classe do tipo
	private Class<T> clazz;
	

	//adiciono construtor
	 public GenericDAOImpl(EntityManager em) {
         super();
         this.em = em;
                               // isso é do java.lang.reflect 
         this.clazz = (Class<T>) ((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
         //
     }



	@Override
	public void cadastrar(T entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public T pesqT(K codigo) throws IdNotFoundException {
		T entidade = em.find(clazz,codigo);
		if (entidade == null) {
			throw new IdNotFoundException("Código não encontrado");
		}
		
		return entidade;
	}


	@Override
	public void atualizar(T entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void remover(K codigo) throws IdNotFoundException {
		em.remove(pesqT(codigo));
	}


	@Override
	public void commit() throws CommitException {
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
			throw new CommitException("Erro de Commit");
		}
		
	}
	
	
	
	
	
}
