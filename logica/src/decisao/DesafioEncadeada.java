package decisao;

import javax.swing.JOptionPane;

public class DesafioEncadeada {

	public static void main(String[] args) {
		String nome =  JOptionPane.showInputDialog("nome").toUpperCase();
		Byte alfabetizado =  Byte.parseByte(JOptionPane.showInputDialog("Alfabetizado digite 1; não digite 0"));
		
		if (alfabetizado ==1) {
			
		short idade = Short.parseShort(JOptionPane.showInputDialog("idade"));
		
		if (idade <16 ) {
			System.out.println(nome+ " voce nao pode votar!");
			
		} else 	if (idade > 70 || idade == 16 || idade ==17) {
			System.out.println(nome+ " voto facultativo!");
			
		} else	if (idade >=18 && idade <=70 ) {
			System.out.println(nome+ " voto obrigatorio!");
		}
	
		} else {
			System.out.println(nome+ " voce nao pode votar!");
		}
	}

}
