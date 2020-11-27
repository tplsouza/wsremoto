package br.com.formula1.implementacao;

import javax.swing.JOptionPane;

import br.com.formula1.modelo.Carro;

public class TesteCarro {

	public static void main(String[] args) {
		// instanciar um objeto =>  criando repartições do objeto

		Carro objeto = new Carro();
		objeto.preencherEscuderia(JOptionPane.showInputDialog("Digite a Escuderia "));
		objeto.preencherNumero(Short.parseShort(JOptionPane.showInputDialog("Digite numero ")));
		objeto.preencherValor(Float.parseFloat(JOptionPane.showInputDialog("Digite valor ")));

		System.out.println("Escuderia: " + objeto.retornarEscuderia());
		System.out.println("Numero...: " + objeto.retornarNumero());
		System.out.println("Desconto.: " + objeto.retornarPromocao());
		
		objeto.preencherBasico((short)10, "MAC LAREN", 500000);
		System.out.println("Exibir todas as variaveis: " + objeto.exibirTudo());
		
		objeto.ligar();
		System.out.println("Status do carro..: " + objeto.exibirStatus());				
		objeto.acelerar(20);
		System.out.println("Exibir velocidade: " + objeto.exibirVelocidadeAtual());
		objeto.acelerar(30);
		System.out.println("Exibir velocidade: " + objeto.exibirVelocidadeAtual());
		objeto.desacelerar(10);
		System.out.println("Exibir velocidade: " + objeto.exibirVelocidadeAtual());
		objeto.brecar();
		System.out.println("Exibir velocidade: " + objeto.exibirVelocidadeAtual());

	}

}
