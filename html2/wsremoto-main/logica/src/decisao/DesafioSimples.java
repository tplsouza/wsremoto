package decisao;

import javax.swing.JOptionPane;

public class DesafioSimples {

	public static void main(String[] args) {
	
		String nome = JOptionPane.showInputDialog("Digite Nome").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog("Digite Idade"));
		
		if (idade < 16) {
			System.out.println( nome +" Voto proibido ");
		}
		
		if (idade >= 18 && idade <= 70) {
			System.out.println( nome + " Voto é obrigatório ");
		}

		if (idade > 70 || idade ==16 || idade == 17) {
			System.out.println(nome + " Voto facultativo " );
		}
		System.out.println(" Sua idade é : " + idade);
	}

}
