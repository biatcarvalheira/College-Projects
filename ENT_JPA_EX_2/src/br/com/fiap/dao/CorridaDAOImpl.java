package br.com.fiap.dao;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Corrida;

public class CorridaDAOImpl extends GenericDAOImpl<Corrida,Integer> implements CorridaDAO {
	public CorridaDAOImpl (EntityManager em) {
		super(em);
	}
}
