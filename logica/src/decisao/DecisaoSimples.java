package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	public static void main(String[] args) {
		String nome =  JOptionPane.showInputDialog("Aluno").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite nota1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite nota2"));
		float media = (nota1 + nota2) / 2;
		if (media >= 6) {
			System.out.println("Parabens " +nome+ " voce esta aprovado!");
		}
		if (media <4 ) {
			System.out.println("Infelizmente, " +nome+ " voce esta reprovado!");
		}
		if (media >=4 && media<6 ) {
			System.out.println("Persevere, " +nome+ " voce esta de exame!");
		}
		System.out.println("Sua m�dia foi: " +media);
	}

}
