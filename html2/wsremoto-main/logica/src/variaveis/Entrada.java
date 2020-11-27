package variaveis;

import javax.swing.JOptionPane;

public class Entrada {

	public static void main(String[] args) {
	    // tipo de referência : quando o tipo se refere a uma classe
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		
		// tipo primitivo: quando o tipo ja pertence a linguagem (começa com letra minusculas)
		// tipo primitivo precisa de um apoio. Esse apoio vem das classes "Wrappers".
		// int = Integer
		// double = Double
		// boolean = Boolean
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite altura"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso"));
		
		System.out.println("Nome:... " + nome);
		System.out.println("Idade:.. " + idade + " anos.");
		System.out.println("Altura:. " + altura + " metros.");
		System.out.println("Peso:... " + peso + " kilos.");
		
		double imc = peso/(altura * altura);
		
		// no printf() usamos :
		// %s => para String
		// %f => para numero reais
		// %d => para numeros inteiros
		
		System.out.printf("IMC:.... %.2f\n" , imc);
		System.out.printf("%s seu imc é: %.2f\n ", nome, imc);
		
	}

}
