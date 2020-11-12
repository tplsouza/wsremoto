package br.com.unixyz.implementacao;

import br.com.unixyz.beans.Endereco;
import br.com.unixyz.beans.Professor;

public class ImplementarProfessor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor professor = new Professor(
				1,
				"Pascoalli",
				"Doutor",
				"11994455555",
				new Endereco(
						"Av Paulista",
						"1500",
						true,
						"Jardins",
						"São Paulo",
						"SP",
						"01212-354"
					));
				
			System.out.println(professor.getAll());
	}

}
