package br.com.BANKOFOZ.beans;

public class Cliente {
	
	private int id;
	private String nome;
	private String cpf;
	private Endereco endereco;
	
	public String getAll() {
		return 
				"Id.........: " + id+ "\n" +
				"Nome.......: " + nome+ "\n" +
				"CPF........: " + cpf+ "\n" +
				endereco.getAll();
		}
	
	
	public void setAll(int id, String nome, String cpf, Endereco endereco) {
		this.id=id;
		this.nome=nome;
		this.cpf=cpf;
		this.endereco=endereco;
	}
	
	public Cliente() {
		super();
	}
	public Cliente(int id, String nome, String cpf, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	

}
