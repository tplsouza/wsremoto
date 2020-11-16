package br.com.excecoes.tratamento;

import java.sql.SQLException;

public class MinhaExcecao {

	public static String tratar(Exception e) {
		if (e instanceof NullPointerException) {
			return "Objeto nulo";
		} else if(e instanceof NumberFormatException) {
			return "N�mero Inv�lido";
		} else if(e instanceof SQLException) {
			return "Erro no banco de dados";
		} else if(e instanceof ArrayIndexOutOfBoundsException) {
			return "estourou Vetor";
		}else {
			e.printStackTrace();
			return "Excecao n�o tratada";
			// throw new RuntimeException();
		}
	}
}
