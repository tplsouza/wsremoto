package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
	
		// Sintaxe do comando FOR convencional
		//*
		// 1� - valor que come�a o la�o e variavel que vai contar
		// 2� - condi��o (at� quando contar?)
		// 3� - como ele vai contar? de 1 em 1.. 2 em 2
		// num X 1 = res
		
		byte tabuada = Byte.parseByte(JOptionPane.showInputDialog("Digite um numero"));
		
		for (int cont=0;cont<11;cont++) {
			System.out.println(tabuada + " x " + cont+ " = " + (tabuada*cont));
		}

	}

}
