package decisao;

import javax.swing.JOptionPane;

public class DesafioSimples {

	public static void main(String[] args) {
		String nome =  JOptionPane.showInputDialog("nome").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog("idade"));
		
		if (idade > 70 || idade == 16 || idade ==17) {
			System.out.println(nome+ " voto facultativo!");
		}
		if (idade >=18 && idade <=70 ) {
			System.out.println(nome+ " voto obrigatorio!");
		}
		if (idade <16 ) {
			System.out.println(nome+ " voce nao pode votar!");
		}
		
	}

}
