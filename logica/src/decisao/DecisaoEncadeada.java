package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {
		String nome =  JOptionPane.showInputDialog("Aluno").toUpperCase();
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Faltas"));

		if (faltas <20) {
			float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite nota1"));
			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite nota2"));

			float media = (nota1 + nota2) / 2;
			if (media >= 6 ) {
				System.out.println("Parabens " +nome+ " voce esta aprovado!");
			} else 	if (media <4 ) {
				System.out.println("Infelizmente, " +nome+ " voce esta reprovado!");
			} else	{
				System.out.println("Persevere, " +nome+ " voce esta de exame!");
			}
			System.out.println("Sua média foi: " +media);
		} else {
			System.out.println("Você reprovou por faltas");
		}


	}

}
