package br.com.fiap.dao;

import br.com.fiap.entity.Motorista;
import br.com.fiap.exception.ErroCommitException;
import br.com.fiap.exception.ErroNotFoundException;

public interface MotoristaDAO {
	
	//vou colocar as assinaturas dos metodos aqui 
	//CRUD
	
	
	//CREATE
	void MotoristaCad (Motorista motorista);
	
	//READ
	Motorista pesqMotorista (int carteira);
	
	//UPDATE 
	void atualMotorista (Motorista motorista);
	
	//DELETE 
	void removMotorista (int carteira) throws ErroNotFoundException;
	
	void commit() throws ErroCommitException;


}
