package br.com.fiap.beans;

public class Pessoa {
	private String nome;
	private int cpf;

	public Pessoa(String nome, int cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	
	
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	
	public void cadastrar() {
		
	}



	


	
	
	
}
