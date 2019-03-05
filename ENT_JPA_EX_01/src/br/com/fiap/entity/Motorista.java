package br.com.fiap.entity;

import java.util.Calendar;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="T_MOTORISTA")

public class Motorista {
	
	@Id
	@Column (name="nr_carteira")
	private int carteira;
	
	@Column (name = "nm_motorista")
	private String nome;
	
	@Column (name="dt_nascimento")
	private Calendar dt_nascimento;
	
	@Column (name="fl_carteira")
	private byte[] foto;
	
	@Enumerated (EnumType.STRING)
	@Column (name="ds_genero")
	private Gen genero;
	
	public Motorista(int carteira, String nome, Calendar dt_nascimento, byte[] foto, Gen genero) {
		super();
		this.carteira = carteira;
		this.nome = nome;
		this.dt_nascimento = dt_nascimento;
		this.foto = foto;
		this.genero = genero;
	}



	public Motorista() {
		super();
	}

	
	
	//GETTER E SETTER

	public int getCarteira() {
		return carteira;
	}
	public void setCarteira(int carteira) {
		this.carteira = carteira;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Calendar getDt_nascimento() {
		return dt_nascimento;
	}
	public void setDt_nascimento(Calendar dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}
	public byte[] getFoto() {
		return foto;
	}
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	public Gen getGenero() {
		return genero;
	}
	public void setGenero(Gen genero) {
		this.genero = genero;
	}
}
