package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//antes da classe vem as notacoes de entity, de tabela e sequence (se houver)

@Entity 
@Table (name="T_VEICULO")
@SequenceGenerator (name="seq_veiculo",sequenceName="seq_t_veiculo", allocationSize=1)

public class Veiculo {
	
	@Id
	@GeneratedValue(generator="seq_veiculo",strategy=GenerationType.SEQUENCE)
	@Column (name="cd_veiculo")
	private int cd_veiculo;
	
	@Column (name="ds_veiculo")
	private String ds_veiculo;
	
	@Column (name="ds_cor")
	private String ds_cor;
	
	@Column (name="nr_ano")
	private int ano;
	
	
	public Veiculo(String ds_veiculo, String ds_cor, int ano) {
		super();
		this.ds_veiculo = ds_veiculo;
		this.ds_cor = ds_cor;
		this.ano = ano;
	}
	
	
	
	public Veiculo() {
		super();
	}



	public int getCd_veiculo() {
		return cd_veiculo;
	}
	public void setCd_veiculo(int cd_veiculo) {
		this.cd_veiculo = cd_veiculo;
	}
	public String getDs_veiculo() {
		return ds_veiculo;
	}
	public void setDs_veiculo(String ds_veiculo) {
		this.ds_veiculo = ds_veiculo;
	}
	public String getDs_cor() {
		return ds_cor;
	}
	public void setDs_cor(String ds_cor) {
		this.ds_cor = ds_cor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	

	
}
