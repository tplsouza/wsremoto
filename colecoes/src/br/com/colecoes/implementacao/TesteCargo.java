package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.List;

import br.com.colecoes.beans.Cargo;
import br.com.colecoes.util.Magica;

public class TesteCargo {

	public static void main(String[] args) {
		
		// alternativa 1
		List<Cargo> lista = new ArrayList<Cargo>();
		lista.add(new Cargo(
				Magica.s("NOME DO CARGO"),
				Magica.s("nivel"),
				Magica.f("salario")
										));
		
		// alternativa 2
		Cargo objeto = new Cargo();
		objeto.setNome(Magica.s("NOME DO CARGO"));
		objeto.setNivel(Magica.s("nivel"));
		objeto.setSalario(Magica.f("salario"));
		lista.add(objeto);

		
		//System.out.println(lista);
		
		int jr = 0;
		float salarioTotal = 0;
		
		for (int cont=0;cont<lista.size();cont++) {
			salarioTotal += lista.get(cont).getSalario();
			if (lista.get(cont).getNivel().equals("JR")) {
				jr ++;
			}
			System.out.println("Cargo numero...: " + (cont + 1));
			System.out.println("Nome do Cargo..: " + lista.get(cont).getNome());
			System.out.println("Nivel..........: " + lista.get(cont).getNivel());
			System.out.println("Salario........: " + lista.get(cont).getSalario());
		}
		
		System.out.println("Salario Medio: " + salarioTotal / lista.size());
		System.out.println("Jr: " + jr);
	}

}
