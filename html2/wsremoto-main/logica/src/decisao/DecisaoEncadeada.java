package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Aluno").toUpperCase();
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Faltas:"));
		if (faltas<=20) {

			float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1"));
			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2"));
			float media = (nota1+nota2)/2;

			if (media>=6) {
				System.out.println("Parabens " + nome + " você está aprovado! ");		
			}else if (media<4) {
				System.out.println("Infelizmente " + nome + " você foi reprovado!" );

			}else if (media >= 4 && media <6 ) {
				System.out.println(nome + " você ainda tem uma chance no exame! ");
			}
			System.out.println("Sua media foi: "+ media);	

		}else {
			System.out.println("Infelizmente " + nome + " você reprovou por falta!" );
		}

	} // Fecha metodo

} // Fecha a classe