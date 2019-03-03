package br.com.fiap.beans;

public class Aluno extends Pessoa {
	int rm;
	Genero sexo;

	public Aluno(String nome, int cpf, int rm) {
		super(nome, cpf);
		this.rm = rm;
	}


	public Aluno(String nome, int cpf, int rm, Genero sexo) {
		super(nome, cpf);
		this.rm = rm;
		this.sexo = sexo;
	}
	
	

	public int getRm() {
		return rm;
	}


	public void setRm(int rm) {
		this.rm = rm;
	}


	public Genero getSexo() {
		return sexo;
	}


	public void setSexo(Genero sexo) {
		this.sexo = sexo;
	}


	@Override
	public void cadastrar() {
		
	}

	
	



	
	

}
