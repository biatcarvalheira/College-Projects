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
@Table (name="T_EA_PASSAGEIRO")
@SequenceGenerator(name="seqPassageiro",sequenceName="seq_t_passageiro",allocationSize=1)
public class Passageiro {
	
	@Id
	@GeneratedValue (generator="seqPassageiro",strategy=GenerationType.SEQUENCE)
	@Column(name="cd_passageiro")
	int cdPassageiro;
	
	@Column(name="nm_passageiro")
	String nmPassageiro;
	

	@Column(name="dt_nascimento")
	Calendar dtNascimento;
	
	
	@Column(name="ds_genero")
	Gen genero;

	public Passageiro(String nmPassageiro, Calendar dtNascimento, Gen genero) {
		super();
		this.nmPassageiro = nmPassageiro;
		this.dtNascimento = dtNascimento;
		this.genero = genero;
	}

	public Passageiro() {
		super();
	}

	public int getCdPassageiro() {
		return cdPassageiro;
	}

	public void setCdPassageiro(int cdPassageiro) {
		this.cdPassageiro = cdPassageiro;
	}

	public String getNmPassageiro() {
		return nmPassageiro;
	}

	public void setNmPassageiro(String nmPassageiro) {
		this.nmPassageiro = nmPassageiro;
	}

	public Calendar getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Calendar dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public Gen getGenero() {
		return genero;
	}

	public void setGenero(Gen genero) {
		this.genero = genero;
	}

	
		
	
}
