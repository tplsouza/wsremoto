package br.com.unixyz.implementacao;

import br.com.unixyz.beans.Endereco;
import br.com.unixyz.beans.Professor;

public class ImplementarProfessor2 {

	public static void main(String[] args) {
		Professor professor = new Professor();
		Endereco endereco = new Endereco();
		
		professor.setAll(1, "PASCOALLI", "DOUTOR", "9999-8888", endereco);
		endereco.setAll("Rua das couves",
				"3500", 
				false,
				"Zelina",
				"Holambra",
				"SP",
				"05100-999");

		System.out.println(professor.getAll());
	}

}
