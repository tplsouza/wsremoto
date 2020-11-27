package br.com.agendamento.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="TB_AGENDAMENTO")
public class Agendamento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="num_seq")
	private int numSeq;
	
	@Column(name="nome_cliente",length=100)
	private String nomeCliente;
	
	@Column(name="email_cliente",length=100)
	private String emailCliente;
	
	@Column(name="celular_cliente",length=20)
	private String celularCliente;
	
	@Column(name="data_agendamento")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
	private LocalDate dataAgendamento;
	
	@Column(name="hora_agendamento")
	private String horaAgendamento;
	
	@Column(name="observacao",length=255)
	private String observacao;
	
	@ManyToOne
	@JsonIgnoreProperties("agendamentos")
	private Agencia agencia;
	


	public Agendamento(int numSeq, String nomeCliente, String emailCliente, String celularCliente, LocalDate dataAgendamento,
			String horaAgendamento, String observacao, Agencia agencia) {
		super();
		this.numSeq = numSeq;
		this.nomeCliente = nomeCliente;
		this.emailCliente = emailCliente;
		this.celularCliente = celularCliente;
		this.dataAgendamento = dataAgendamento;
		this.horaAgendamento = horaAgendamento;
		this.observacao = observacao;
		this.agencia = agencia;
	}
	
	

	public Agencia getAgencia() {
		return agencia;
	}



	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}



	public Agendamento() {
		super();
	}



	public int getNumSeq() {
		return numSeq;
	}

	public void setNumSeq(int numSeq) {
		this.numSeq = numSeq;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public String getCelularCliente() {
		return celularCliente;
	}

	public void setCelularCliente(String celularCliente) {
		this.celularCliente = celularCliente;
	}

	public LocalDate getDataAgendamento() {
		return dataAgendamento;
	}

	public void setDataAgendamento(LocalDate dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}

	public String getHoraAgendamento() {
		return horaAgendamento;
	}

	public void setHoraAgendamento(String horaAgendamento) {
		this.horaAgendamento = horaAgendamento;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	
	
}
