package br.com.fiap.dao;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Passageiro;

public class PassageiroDAOImpl extends GenericDAOImpl<Passageiro,Integer> implements PassageiroDAO {
	public PassageiroDAOImpl (EntityManager em) {
		super(em);
	}
}
