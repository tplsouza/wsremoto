package br.com.agendamento.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name="TB_AGENCIA")
public class Agencia {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nome_agencia",length=100)
	private String nomeAgencia;
	
	@Column(name="hora_inicio")
	private String horaInicio;
	
	@Column(name="hora_fim")
	private String horaFim;
	
	@OneToMany(mappedBy="agencia", cascade=CascadeType.ALL)
	@JsonIgnoreProperties("agencia")
	private List<Agendamento> agendamentos;
	

	
	public List<Agendamento> getAgendamentos() {
		return agendamentos;
	}

	public void setAgendamentos(List<Agendamento> agendamentos) {
		this.agendamentos = agendamentos;
	}

	public Agencia(int id, String nomeAgencia, String horaInicio, String horaFim, List<Agendamento> agendamentos) {
		super();
		this.id = id;
		this.nomeAgencia = nomeAgencia;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
		this.agendamentos = agendamentos;
	}

	public Agencia() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeAgencia() {
		return nomeAgencia;
	}

	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(String horaFim) {
		this.horaFim = horaFim;
	}
	
	
	
}
