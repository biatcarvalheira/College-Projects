package br.com.fiap.dao;

import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.IdNotFoundException;

//t e k são os tipos --> uso k para definir depois o tipo do meu codigo

public interface GenericDAO<T,K> {
	
	//aqui coloco os métodos comuns a toda classe --> create, read, update, delete
	
	//CRUD
	
	//1 - Persist
	void cadastrar(T entity);
	
	//2 - Read
	T pesqT (K codigo) throws IdNotFoundException;
	
	//3 - Update
	void atualizar (T entity);
	
	//4 - Delete
	void remover (K codigo) throws IdNotFoundException;
	
	//COMMIT
	void commit() throws CommitException;
	
}