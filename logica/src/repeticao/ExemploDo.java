package repeticao;

import javax.swing.JOptionPane;

public class ExemploDo {

	public static void main(String[] args) {
		char resposta = 0;
		int qtde = 0;
		float valor = 0;
		do {
			qtde = Integer.parseInt(JOptionPane.showInputDialog("qtde"));
			valor = Float.parseFloat(JOptionPane.showInputDialog("Valor"));
			System.out.println("Total: " + (qtde*valor));
			resposta = JOptionPane.showInputDialog("digite S para prosseguir").toUpperCase().charAt(0);

		} while(resposta=='S');

	}

}
