package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {

	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog("Digite um email:").toLowerCase();
		while (email.contains("@")==false) {
			email= JOptionPane.showInputDialog("Digite email com @").toLowerCase();
		}
		
		String nome = JOptionPane.showInputDialog("Digite um nome:");
		while (nome.length() < 5 || nome.length() >10) {
			nome = JOptionPane.showInputDialog("Digite nome maior que 5 e menor que 10").toLowerCase();
		}

	}

}
