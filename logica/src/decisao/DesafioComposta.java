package decisao;

import javax.swing.JOptionPane;

public class DesafioComposta {

	public static void main(String[] args) {
		String produto =  JOptionPane.showInputDialog("produto").toUpperCase();
		int estoque = Integer.parseInt(JOptionPane.showInputDialog("Quantidade estoque"));
		
		System.out.println("Produto: "+produto+" - Estoque: "+estoque);
		
		if (estoque < 20) {
			System.out.println("Estoque Baixo");
		} else 	if (estoque >=20 && estoque <=40 ) {
			System.out.println("Estoque normal!");
		} else	if (estoque > 40 && estoque <= 60 ){
			System.out.println("Estoque alto!");
		} else  {
			System.out.println("Estoque lotado!");
		}
		
		
	}

}
