package decisao;

import javax.swing.JOptionPane;

public class DesafioEncadeada {

	public static void main(String[] args) {

		/*
		 * Acrescente uma captura de dado, perguntando ao usu�rio
		 * se alfabetizado (1) ou n�o (0)
		 * se ele n�o for alfabetizado n�o vota
		 * Altere o c�digo abaixo para a melhor estrutura de decis�o.
		 */
		byte alfa = Byte.parseByte(JOptionPane.showInputDialog("Digite 1:Alfabetizado ou 0:N�o alfabetizado"));
		String nome = JOptionPane.showInputDialog("Digite Nome").toUpperCase();
		
		if (alfa==1 ) {
			short idade = Short.parseShort(JOptionPane.showInputDialog("Digite Idade"));
			
			if (idade < 16) {
				System.out.println( nome +" Voto proibido ");
			}else if (idade >= 18 && idade <= 70) {
				System.out.println( nome + " Voto � obrigat�rio ");
			}else {
				System.out.println(nome + " Voto facultativo " );
			}
			System.out.println(" Sua idade � : " + idade);

		}else {
			System.out.println(nome + " N�o vota");
		}
	}
}

