package br.com.fiap.entity;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table (name="T_EA_PAGAMENTO")
@SequenceGenerator(name="seqPagamento",sequenceName="seq_t_pagamento",allocationSize=1)
public class Pagamento {
	@Id	
	@GeneratedValue(generator="seqPagamento",strategy=GenerationType.SEQUENCE)
	@Column (name="cd_pagamento")
	int cdPagamento;
	
	@Column (name="dt_pagamento")
	Calendar dtPagamento;
	
	@Column (name="vl_pagamento")
	double vlPagamento;
	
	@Column (name="ds_forma_pagamento")
	String formaPagamento;

	public Pagamento(Calendar dtPagamento, double vlPagamento, String formaPagamento) {
		super();
		this.dtPagamento = dtPagamento;
		this.vlPagamento = vlPagamento;
		this.formaPagamento = formaPagamento;
	}

	public Pagamento() {
		super();
	}

	public int getCdPagamento() {
		return cdPagamento;
	}

	public void setCdPagamento(int cdPagamento) {
		this.cdPagamento = cdPagamento;
	}

	public Calendar getDtPagamento() {
		return dtPagamento;
	}

	public void setDtPagamento(Calendar dtPagamento) {
		this.dtPagamento = dtPagamento;
	}

	public double getVlPagamento() {
		return vlPagamento;
	}

	public void setVlPagamento(double vlPagamento) {
		this.vlPagamento = vlPagamento;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	
}
