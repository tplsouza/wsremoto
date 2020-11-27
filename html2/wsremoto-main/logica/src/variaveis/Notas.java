package variaveis;

import javax.swing.JOptionPane;

public class Notas {
	/*
	 * Solicitar um nome de aluno e duas notas, calcular a media
	 * e exibir uma mensagem para o aluno da seguinte forma:
	 * "Aluno xxxxxxx, sua m�dia obtida foi: xxxxx para 10
	 */

	public static void main(String[] args) {
    
		String aluno = JOptionPane.showInputDialog("Digite o Nome do Aluno");
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite Nota 01"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite Nota 02"));
		
		double media = (nota1+nota2) /2;
			
	//*	System.out.printf("%s sua m�dia obtida foi: %.2f %s", aluno, media, "para 10");
		
		System.out.println("Aluno " + aluno + ", sua m�dia obtida foi: " 
		+ media + " para 10 faltaram " + (10-media) + " pontos");
	
    /* Tipos primitivos
     * boolean = Boolean => True e False
     * char = Character  => 1 caracter ('a')
     * 
     * S�o os inteiros
     * byte = Byte  => (-127/+128)
     * short = Short => ( -32... / +32.000) 
     * int = Integer => (-2bi / +2bi)
     * logn = Long => (n�mero cient�fico)
     * 
     * s�o para os reais
     * float = Float => (usar para poucas casas decimais at� 5 casas)
     * double = Double => (usar para muitas casas decimais)
     */
	}

}
