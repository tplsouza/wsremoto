package br.com.unixyz.implementacao;

import br.com.unixyz.beans.Endereco;
import br.com.unixyz.beans.Professor;

public class TesteProfessor {

	public static void main(String[] args) {
		Professor p = new Professor();
		Endereco  e = new Endereco();
		
		p.setId(1);
		p.setNome("PASCOALLI");
		p.setTitulacao("DOUTOR");
		p.setFone("1234-1234");
		p.setEndereco(e);
		e.setLogradouro("Avenida Paulista");
		e.setNumero("3500");
		e.setBairro("Paulista");
		e.setCidade("São Paulo");
		e.setCep("9990-999");
		e.setUf("SP");
		e.setComplemento(false);
		
		System.out.println("Nome : " + p.getNome());
		System.out.println("Endereco : " + p.getEndereco().getAll());		
		
	}

}
