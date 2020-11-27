package decisao;

import javax.swing.JOptionPane;

public class DesafioEncadeada {

	public static void main(String[] args) {

		/*
		 * Acrescente uma captura de dado, perguntando ao usuário
		 * se alfabetizado (1) ou não (0)
		 * se ele não for alfabetizado não vota
		 * Altere o código abaixo para a melhor estrutura de decisão.
		 */
		byte alfa = Byte.parseByte(JOptionPane.showInputDialog("Digite 1:Alfabetizado ou 0:Não alfabetizado"));
		String nome = JOptionPane.showInputDialog("Digite Nome").toUpperCase();
		
		if (alfa==1 ) {
			short idade = Short.parseShort(JOptionPane.showInputDialog("Digite Idade"));
			
			if (idade < 16) {
				System.out.println( nome +" Voto proibido ");
			}else if (idade >= 18 && idade <= 70) {
				System.out.println( nome + " Voto é obrigatório ");
			}else {
				System.out.println(nome + " Voto facultativo " );
			}
			System.out.println(" Sua idade é : " + idade);

		}else {
			System.out.println(nome + " Não vota");
		}
	}
}

