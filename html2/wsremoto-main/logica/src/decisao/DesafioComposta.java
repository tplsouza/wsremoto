package decisao;

import javax.swing.JOptionPane;

public class DesafioComposta {

	public static void main(String[] args) {
	/*
	 * Solicite o nome de um produto e a qtde em estoque
	 * se a qtde estiver entre 20 e 40 deve retornar "estoque normal"
	 * se a qtde estiver entre 41 e 60 deve retornar "estoque alto "
	 * se a qtde for maior que 60 deve retornar "estoque lotado"
	 * se a qtde for menor que 20 deve retornar "estoque baixo"
	 */
	 String produto = JOptionPane.showInputDialog("Nome do produto").toUpperCase();
	 int estoque = Integer.parseInt(JOptionPane.showInputDialog("Estoque"));
	 
	 if (estoque<20) {
  		System.out.println("Produto: " +produto + "- Estoque baixo ");
	 }else if (estoque>=20 && estoque <=40) {
	 	       System.out.println("Produto: " +produto + "- Estoque normal ");
	 }else if (estoque>=41 && estoque <=60) {
 		       System.out.println("Produto: " +produto + "- Estoque alto "); 
     }else {
	  	     System.out.println("Produto: " +produto + "- Estoque lotado ");
	 }
 }
}

