package decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º numero: "));
		String operacao = JOptionPane.showInputDialog("Digite Operação: ").toUpperCase();
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º numero: "));

		if (numero1>0) {
			if (numero2>0)  {
				if (operacao.equals("+")) {
					System.out.println("Resultado da operação: " + (numero1+numero2));
				}else if (operacao.equals("-")) {
					System.out.println("Resultado da operação: " + (numero1-numero2));
				}else if (operacao.equals("*")) {
					System.out.println("Resultado da operação: " + (numero1*numero2));
				}else if (operacao.equals("/")) { 
					if (numero2 !=0) {
						System.out.println("Resultado da operação: " + (numero1/numero2));
					}else { System.out.println("Digite um numero valido " );
					}
				}else { System.out.println("Digite um operador valido " );
				}
			}
		}

	}
	}





