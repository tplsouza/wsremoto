package br.com.folha.beans;

public class Funcionario  implements PadraoFuncionario{
	private String nome;
	private int numeroRegistro;
	
	public Funcionario(String nome, int numeroRegistro) {
		super();
		this.nome = nome;
		this.numeroRegistro = numeroRegistro;
	}

	public Funcionario() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	@Override
	public float calcularSalario() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
