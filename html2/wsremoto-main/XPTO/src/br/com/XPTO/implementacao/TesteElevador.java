package br.com.XPTO.implementacao;

import javax.swing.JOptionPane;

import br.com.XPTO.modelo.Elevador;

public class TesteElevador {

	public static void main(String[] args) {

		Elevador objeto = new Elevador();
		objeto.prepararElevador(10, 0, 5);
		
		objeto.subir();
		System.out.println(objeto.retornarTudo());
		objeto.subir();
		objeto.entrar(12);
		System.out.println(objeto.retornarTudo());
		objeto.subir();
		objeto.subir();
		objeto.entrar(10);
		System.out.println(objeto.retornarTudo());
		

		
	}

}


