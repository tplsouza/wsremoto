package variaveis;

import javax.swing.JOptionPane;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite nota1"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite nota2"));
		
		double media = (nota1 + nota2) / 2;
		double dez = 10 - media;
		System.out.printf("Aluno %s, sua m�dia obtida foi: %.1f para 10 faltaram: %.1f pontos\n", nome,media,dez);
	}

}
