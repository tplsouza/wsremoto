package decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("insira nro 1"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("insira nro 2"));
		String operacao =  JOptionPane.showInputDialog("opera��o");

		if (operacao == "/" && numero2 == 0) {
			System.out.println("erro");
		}

		switch (operacao) {
		case "*":
			System.out.println("Resultado: "+(numero1*numero2));
			break;
		case "/":
			System.out.println("Resultado: "+(numero1/numero2));
			break;
		case "+":
			System.out.println("Resultado: "+(numero1+numero2));
			break;
		case "-":
			System.out.println("Resultado: "+(numero1-numero2));
			break;



		default:
			System.out.println("Operando invalido ");
			break;
		}
	}

}


