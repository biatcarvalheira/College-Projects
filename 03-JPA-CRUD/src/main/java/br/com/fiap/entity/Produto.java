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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name="T_PRODUTO")
@SequenceGenerator(name="seqProduto",sequenceName="SQ_T_PRODUTO",allocationSize=1)
public class Produto {
	@Id
	@GeneratedValue(generator="seqProduto",strategy=GenerationType.SEQUENCE)
	@Column(name="cd_produto")
	private int cdProduto;
	
	@Column(name="nm_produto")
	private String nomeProduto;
	
	@Column(name="vl_produto")
	private double vlProduto;
	
	@Column(name="dt_venc")
	@Temporal (TemporalType.DATE)//Vai gravar somente a data
	private Calendar dtVencimento;
	
	@Column(name="ds_tipo")
	@Enumerated (EnumType.STRING)
	private Categoria tipo;
	
	@Lob
	@Column(name="fl_foto")
	private byte[] foto;

	
	//CONSTRUTORES
	public Produto(int cdProduto, String nomeProduto, double vlProduto, Calendar dtVencimento, Categoria tipo,
			byte[] foto) {
		super();
		this.cdProduto = cdProduto;
		this.nomeProduto = nomeProduto;
		this.vlProduto = vlProduto;
		this.dtVencimento = dtVencimento;
		this.tipo = tipo;
		this.foto = foto;
	}


	public Produto(String nomeProduto, double vlProduto, Calendar dtVencimento, Categoria tipo, byte[] foto) {
		super();
		this.nomeProduto = nomeProduto;
		this.vlProduto = vlProduto;
		this.dtVencimento = dtVencimento;
		this.tipo = tipo;
		this.foto = foto;
	}


	public Produto() {
		super();
	}


	//GETTER E SETTER
	public int getCdProduto() {
		return cdProduto;
	}


	public void setCdProduto(int cdProduto) {
		this.cdProduto = cdProduto;
	}


	public String getNomeProduto() {
		return nomeProduto;
	}


	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}


	public double getVlProduto() {
		return vlProduto;
	}


	public void setVlProduto(double vlProduto) {
		this.vlProduto = vlProduto;
	}


	public Calendar getDtVencimento() {
		return dtVencimento;
	}


	public void setDtVencimento(Calendar dtVencimento) {
		this.dtVencimento = dtVencimento;
	}


	public Categoria getTipo() {
		return tipo;
	}


	public void setTipo(Categoria tipo) {
		this.tipo = tipo;
	}


	public byte[] getFoto() {
		return foto;
	}


	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	
	
	
	
	
}
