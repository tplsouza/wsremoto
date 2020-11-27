package br.com.unixyz.implementacao;

import br.com.unixyz.beans.Endereco;
import br.com.unixyz.beans.Professor;

public class TesteProfessor3 {

	public static void main(String[] args) {
		Professor prof = new Professor(
				1,
				"PASCOALLI",
				"DOUTOR",
				"1234-6789",
				
				new Endereco (
						"AVENIDA PAULISTA",
						"123",
						true,
						"PAULISTA",
						"SÃO PAULO",
						"SP",
						"9999-900"
						)
				);
		System.out.println(prof.getAll());
	
		
		
		

	}

}
