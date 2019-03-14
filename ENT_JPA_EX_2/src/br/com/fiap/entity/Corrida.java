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
@Table(name="T_EA_CORRIDA")
@SequenceGenerator(name="seqCorrida",sequenceName="seq_t_corrida",allocationSize=1)

public class Corrida {
	
	@Id
	@GeneratedValue(generator="seqCorrida",strategy=GenerationType.SEQUENCE)
	@Column (name="cd_corrida")
	int cdCorrida;
	
	@Column (name="ds_origem",nullable=false,length=50)
	String dsOrigem;
	
	@Column (name="ds_destino",nullable=false,length=100)
	String dsDestino;
	

	@Column (name="dt_corrida",nullable=false)
	Calendar dtCorrida;
	
	@Column (name="vl_corrida",nullable=false)
	Double vlCorrida;
	
	public Corrida(int cdCorrida, String dsOrigem, String dsDestino, Calendar dtCorrida, Double vlCorrida) {
		super();
		this.cdCorrida = cdCorrida;
		this.dsOrigem = dsOrigem;
		this.dsDestino = dsDestino;
		this.dtCorrida = dtCorrida;
		this.vlCorrida = vlCorrida;
	}

	public Corrida(String dsOrigem, String dsDestino, Calendar dtCorrida, Double vlCorrida) {
		super();
		this.dsOrigem = dsOrigem;
		this.dsDestino = dsDestino;
		this.dtCorrida = dtCorrida;
		this.vlCorrida = vlCorrida;
	}

	public Corrida() {
		super();
	}

	public int getCdCorrida() {
		return cdCorrida;
	}

	public void setCdCorrida(int cdCorrida) {
		this.cdCorrida = cdCorrida;
	}

	public String getDsOrigem() {
		return dsOrigem;
	}

	public void setDsOrigem(String dsOrigem) {
		this.dsOrigem = dsOrigem;
	}

	public String getDsDestino() {
		return dsDestino;
	}

	public void setDsDestino(String dsDestino) {
		this.dsDestino = dsDestino;
	}

	public Calendar getDtCorrida() {
		return dtCorrida;
	}

	public void setDtCorrida(Calendar dtCorrida) {
		this.dtCorrida = dtCorrida;
	}

	public Double getVlCorrida() {
		return vlCorrida;
	}

	public void setVlCorrida(Double vlCorrida) {
		this.vlCorrida = vlCorrida;
	}
	
	

}
