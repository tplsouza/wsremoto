package br.com.folha.userinterface;

import java.util.ArrayList;
import java.util.List;

import br.com.ecommerce.util.Magica;


public class Principal {

	public static void main(String[] args) {
		
		List<Funcionario> lista = new ArrayList<Funcionario>();
		
		char opcao = Magica.s("Digite <1> Chefe, <2>Comissionado, <3>Empreiteiro ou <4> Horista").charAt(0);
		
		
		lista.add(new Funcionario(
				Magica.s("NOME DO CARGO"),
				Magica.s("nivel"),
				Magica.f("salario")
										));
	}

}
