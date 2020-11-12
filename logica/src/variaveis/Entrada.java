package variaveis;

import javax.swing.JOptionPane;

public class Entrada {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite idade"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite altura"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite peso"));
		
		System.out.println("Nome...: " + nome);
		System.out.println("Idade..: " +idade+ " anos");
		System.out.println("Altura.: " +altura+ " metros");
		System.out.println("Peso...: " +peso+ " kg");
		
		double imc = peso / (altura*altura);
		System.out.printf("IMC....: %.2f\n", imc);
		System.out.printf("%s seu IMC é: %.2f\n",nome, imc);
		
	}

}
