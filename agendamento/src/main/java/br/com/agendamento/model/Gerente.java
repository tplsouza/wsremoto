package br.com.agendamento.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="TB_GERENTES")
public class Gerente {
	
	@Id
	@Column(name="racf",length=10)
	private String racf;
	
	@Column(name="email_gerente",length=100)
	private String email;
		
	@Column(name="senha_gerente",length=10)
	private String senha;
	
	@Column(name="nome_gerente",length=100)
	private String nome;
	
	@Column(name="foto_gerente",length=100)
	private String foto;
	
	@ManyToOne
	private Agencia agencia;
	

	public Gerente(String email, String racf, String senha, String nome, String foto, Agencia agencia) {
		super();
		this.email = email;
		this.racf = racf;
		this.senha = senha;
		this.nome = nome;
		this.foto = foto;
		this.agencia = agencia;
	}
	public Gerente() {
		super();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRacf() {
		return racf;
	}
	public void setRacf(String racf) {
		this.racf = racf;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	
	
	
}
