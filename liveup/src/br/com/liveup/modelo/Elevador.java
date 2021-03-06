package br.com.liveup.modelo;

public class Elevador {

	private int andarAtual;
	private int andarMaximo;
	private int andarMinimo;
	private int capacidadePessoas;
	private int qtdadePessoas;
	private String nome;

	public void prepararElevador(int pAndMax, int pAndMin, int pCapac, String pNome) {
		andarMaximo = pAndMax;
		andarMinimo = pAndMin;
		capacidadePessoas = pCapac;
		nome = pNome;
		qtdadePessoas = 0;
		andarAtual = 0;
	}

	public void entrar(int pQtd) {
		if ((qtdadePessoas + pQtd) <= capacidadePessoas) {

			qtdadePessoas = qtdadePessoas + pQtd;

		} 

	}

	public void sair(int pQtd) {
		if (qtdadePessoas > pQtd) {
		qtdadePessoas = qtdadePessoas - pQtd;
		}
	}

	public void subir() {
		if((andarAtual ) < andarMaximo) {
			andarAtual ++;
		} 
	}

	public void descer() {
		if((andarAtual ) > andarMinimo) {
			andarAtual = andarAtual - 1;
		} 

	}

	public String retornarTudo() {

		return
				"AndarAtual.........: " + andarAtual + "\n" +
				"Andar M�ximo.......: " + andarMaximo + "\n" +
				"Andar M�nimo.......: " + andarMinimo + "\n" +
				"Capacidade.........: " + capacidadePessoas + "\n" +
				"Qtdade de Pessoas..: " + qtdadePessoas + "\n" +
				"Nome...............: " + nome;

	}
}
