package br.com.colecoes.implementacao;

import java.util.HashSet;
import java.util.Set;

public class TesteLista {

	public static void main(String[] args) {
		Set<String> lista = new HashSet<String>();

		lista.add("ANALISTA");
		lista.add("DBA");
		lista.add("DESENVOLVEDOR");
		lista.add("SUPORTE");
		lista.add("ESTAGIARIO");
		lista.add("DBA");
		lista.add("DESIGNER");

		System.out.println(lista);
		
		System.out.println("existe Dba?" + lista.contains("DBA"));
		
		
	}

}
