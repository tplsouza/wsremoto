package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteSet {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();

		lista.add("ANALISTA");
		lista.add("DBA");
		lista.add("DESENVOLVEDOR");
		lista.add("DBA");
		lista.add("ESTAGIARIO");

		System.out.println(lista);
		System.out.println(lista.get(1));

		int totalDba = 0;
		int totalCargo = 0;

		for (int contador=0;contador<lista.size();contador++) {
			System.out.println("Elemento " + contador + " : " + lista.get(contador));
			if (lista.get(contador).equals("DBA")) {
				totalDba++;
			}
			if (lista.get(contador).length() > 8) {
				totalCargo++;
			}

		} 
		System.out.println("Total de DBAs: " + totalDba);
		System.out.println("Total de cargos maior que 8: " + totalCargo);
		
		Collections.sort(lista);
		System.out.println("Lista ordenada: " + lista);
		
		lista.remove(2);
		System.out.println("3. elemento removido: " + lista);
	}

}
