package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		
		int nro1 = Integer.parseInt(JOptionPane.showInputDialog("digite numero"));
		int nro2 = 0;
		int tentativa = 0;
		do {
			nro2 = Integer.parseInt(JOptionPane.showInputDialog("adivinhe"));
			tentativa = tentativa + 1;
		if (nro1 > nro2) {
			System.out.println("Errou - num�ro � maior");
		} else {
			System.out.println("Errou - num�ro � menor");
		}

		} while(nro1 != nro2);
			
		
		System.out.println("Acertou - numero:"+nro1+" "+nro2);
		System.out.println("Tentativas:"+tentativa);
	}

}
