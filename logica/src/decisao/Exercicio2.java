package decisao;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("insira nro 1"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("insira nro 2"));
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("insira nro 3"));
		
		if (numero1 > numero2 && numero1 > numero3) {
			if (numero2 > numero3) {
				System.out.println(numero1);
				System.out.println(numero2);
				System.out.println(numero3);}
		} else {
			System.out.println(numero1);
			System.out.println(numero3);
			System.out.println(numero2);
			}
		

		}
			
	}


