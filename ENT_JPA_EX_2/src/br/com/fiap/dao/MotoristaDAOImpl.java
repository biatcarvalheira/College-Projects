package br.com.fiap.dao;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Motorista;

public class MotoristaDAOImpl extends GenericDAOImpl<Motorista,Integer> implements MotoristaDAO{
	public MotoristaDAOImpl (EntityManager em) {
		super(em);
	}

}
