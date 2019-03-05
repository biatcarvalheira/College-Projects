package br.com.fiap.dao;

import br.com.fiap.entity.Veiculo;
import br.com.fiap.exception.ErroCommitException;
import br.com.fiap.exception.ErroNotFoundException;

public interface VeiculoDAO {
	//CRUD 
	
	void cadVeiculo (Veiculo veiculo);
	
	Veiculo pesqVeiculo (int cd_veiculo);
	
	void atualVeiculo (Veiculo veiculo);
	
	void removeVeiculo (int cd_veiculo) throws ErroNotFoundException;
	
	void commit() throws ErroCommitException;

}
