package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.PrePersist;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="T_CLIENTE")

//um e o nome da sequencia no codigo java e o outro e o nome da sequencia no banco
@SequenceGenerator(name="seqCliente",sequenceName="SQ_T_CLIENTE",allocationSize=1)

public class Cliente {
	
	@Id
	//tenho que colocar qual vai ser o gerador de sequencia --> e importante ter o mesmo
	//nome
	@GeneratedValue(generator="seqCliente",strategy=GenerationType.SEQUENCE)
	@Column(name="cd_cliente")
	private int cd;
	
	@Column (name="nm_cliente", nullable = false, length = 50)
	private String nome;
	
	@Column(name="ds_cpf", nullable = false)
	private String cpf;
	
	@Temporal (TemporalType.DATE)//Vai gravar somente a data
	@Column(name="dt_nasc")
	private Calendar dataNascimento;
	
	@Transient //desconsidera esse atributo e não o insere na tabela
	private boolean logado;
	
	@Lob //grava um arquivo no banco --> BLOB
	@Column(name="fl_foto")
	private byte[] foto;
	
	@Enumerated (EnumType.STRING) //grava o texto da constante ao inves do padrao que e a posicao (0,1,2...)
	@Column(name="ds_genero")
	private Sexo genero;
	
	//vai aparecer essa mensagem antes do cadastro ocorrer 
	@PrePersist
	public void antesCadastrar() {
		System.out.println("Executado antes de cadastrar");
	}

	
	//CONSTRUTOR
	
	public Cliente(String nome, String cpf, Calendar dataNascimento, byte[] foto, Sexo genero) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.foto = foto;
		this.genero = genero;
	}
	
	
	

	public Cliente(int cd, String nome, String cpf, Calendar dataNascimento, byte[] foto, Sexo genero) {
		super();
		this.cd = cd;
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.foto = foto;
		this.genero = genero;
	}




	public Cliente() {
		super();
	}


	//GETTER E SETTER


	public int getCd() {
		return cd;
	}




	public void setCd(int cd) {
		this.cd = cd;
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public String getCpf() {
		return cpf;
	}




	public void setCpf(String cpf) {
		this.cpf = cpf;
	}




	public Calendar getDataNascimento() {
		return dataNascimento;
	}




	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}




	public boolean isLogado() {
		return logado;
	}




	public void setLogado(boolean logado) {
		this.logado = logado;
	}




	public byte[] getFoto() {
		return foto;
	}




	public void setFoto(byte[] foto) {
		this.foto = foto;
	}




	public Sexo getGenero() {
		return genero;
	}




	public void setGenero(Sexo genero) {
		this.genero = genero;
	}

	
	

	


	
	
	

	
	
	
	
	

}
