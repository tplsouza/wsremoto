package decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1� numero: "));
		String operacao = JOptionPane.showInputDialog("Digite Opera��o: ").toUpperCase();
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2� numero: "));

		if (numero1>0) {
			if (numero2>0)  {
				if (operacao.equals("+")) {
					System.out.println("Resultado da opera��o: " + (numero1+numero2));
				}else if (operacao.equals("-")) {
					System.out.println("Resultado da opera��o: " + (numero1-numero2));
				}else if (operacao.equals("*")) {
					System.out.println("Resultado da opera��o: " + (numero1*numero2));
				}else if (operacao.equals("/")) { 
					if (numero2 !=0) {
						System.out.println("Resultado da opera��o: " + (numero1/numero2));
					}else { System.out.println("Digite um numero valido " );
					}
				}else { System.out.println("Digite um operador valido " );
				}
			}
		}

	}
	}





