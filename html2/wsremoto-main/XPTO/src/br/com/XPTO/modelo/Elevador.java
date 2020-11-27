package br.com.XPTO.modelo;

public class Elevador {

	private int andarAtual;
	private int andarMaximo;
	private int andarMinimo;
	private int capacidadePessoas;
	private int qtdePessoas;
	private String nome;

	public int exibirPessoas() {
		return qtdePessoas;
	}
	public void prepararElevador(int pAndarMaximo, int pAndarMinimo, int pCapacidade) {
		andarMaximo=pAndarMaximo;
		andarMinimo=pAndarMinimo;
		capacidadePessoas=pCapacidade;
		
	}
	public void entrar(int pQtde) {
		if ((pQtde+qtdePessoas) > capacidadePessoas) {
			qtdePessoas+=pQtde;
		}
	}
	public void sair(int pQtde) {
		if ((qtdePessoas-pQtde)>=0) {
			qtdePessoas-=pQtde;
		}
	}
	public void subir() {
		if(andarAtual<andarMaximo) {
			andarAtual++;
		}
	}
	public void descer() {
		if(andarAtual>andarMinimo) {
			andarAtual--;
		}
	}
	public String retornarTudo() {
		return 
				"Andar Atual......: " + andarAtual+ "\n" +
				"Andar Máximo.....: " + andarMaximo+ "\n" +
				"Andar Minimo.....: " + andarMinimo+ "\n" +
				"Capacidade.......: " + capacidadePessoas+ "\n" +
				"Qtde Pessoas.....: " + qtdePessoas+ "\n" +
				"Nome.............: " + nome;
	}
}
