package br.com.excecoes.implementacao;

import br.com.excecoes.tratamento.MinhaExcecao;

public class TesteExcecoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int numero = Integer.parseInt("7");
			System.out.println(numero);

			String nome = "";
			System.out.println("Qtdade de Letras: " + nome.length());
			
			double vetor[] = new double[2];
			vetor[0] = 5.54;
			vetor[1] = 6.12;
			vetor[2] = 15.8;

		} catch (Exception e) {
			System.out.println(MinhaExcecao.tratar(e));
		} 
		
		finally {
			System.out.println("Até logo!!");
		}
	}
}
