package br.com.colecoes.beans;

import java.util.List;

public class Colaborador {
	private String nome;
	private String cpf;
	private List<String> fone;
	
	public Colaborador(String nome, String cpf, List<String> fone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.fone = fone;
	}
	public Colaborador() {
		super();
	}
	
	public void setAll(String nome, String cpf, List<String> fone) {
		this.nome = nome;
		this.cpf = cpf;
		this.fone = fone;
	}
	
	public String getAll() {
		return
				"Nome: "+ nome + "\n" +
				"CPF: "+ cpf + "\n" +
				"Fone: "+ getFone() ;
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
	public List<String> getFone() {
		return fone;
	}
	public void setFone(List<String> fone) {
		this.fone = fone;
	}
	
	
}
