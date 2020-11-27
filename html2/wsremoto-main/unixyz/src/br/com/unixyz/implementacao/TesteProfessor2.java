package br.com.unixyz.implementacao;

import br.com.unixyz.beans.Endereco;
import br.com.unixyz.beans.Professor;

public class TesteProfessor2 {

	public static void main(String[] args) {
		Professor p = new Professor();
		Endereco  e = new Endereco();
		
		p.setAll(
				1,
				"PASCOALLI",
				"DOUTOR",
				"123-5678",
				e);
		
		e.setAll(
				"AVENIDA PAULISTA",
				"100",
				false,
				"PAULISTA",
				"SAO PAULO",
				"SP",
				"999-9999");
		System.out.println(p.getAll());
		System.out.println(p.getEndereco().getCep());

	}

}
