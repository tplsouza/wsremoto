package br.com.liveup.implementacao;

import br.com.liveup.modelo.Elevador;

public class TesteElevador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Elevador objeto = new Elevador();
		//objeto.preencherEscuderia(JOptionPane.showInputDialog("Escuderia:"));
		//objeto.preencherNumero(Short.parseShort(JOptionPane.showInputDialog("Número:")));
		
		objeto.prepararElevador(10,0,26,"TTTT") ;
		
		System.out.println(objeto.retornarTudo());
		
		
		objeto.entrar(5);
		objeto.entrar(5);
		objeto.sair(2);
		objeto.subir();
		objeto.subir();
		objeto.subir();
		objeto.descer();
		
		System.out.println(objeto.retornarTudo());
		
		}

}
