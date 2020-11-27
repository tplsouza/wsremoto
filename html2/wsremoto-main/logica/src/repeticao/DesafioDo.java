package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		/*
		 * 1º parte
		 * Jogador 1 digita um numero inteiro
		 * Jogador 2 tem que adivinhar e enquanto nao acertar, aplicação pede um novo numero
		 * 
		 * 2 parte
		 * Implemente dicas para o jogador, informando se o numero que ele tem que adivinhar
		 * é maior ou menor do que o que ele está digitando
		 * 
		 * 3º parte
		 * Exiba no final a qtde de tentativas que foram utilizadas
		 * pelo jogador 2 ate que ele adivinhe o numero
		 * Dica: terão qye criar uma variavel para contar
		 * 
		 * Dica: contador++ ou contador+=1 ou contador=contador+1
		 * 
		 */
		int numero =0;
		int chute=0;
		int contador=0;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1: Digite um numero:"));
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2: Adivinhe o numero do Jogador 1"));
			contador = contador+1;
			
			if (numero>chute) {
				System.out.println("Chute mais alto");
			}else if (numero<chute) {
				System.out.println("Chute mais baixo");
			}
		}
		while (numero>0 && chute!=numero);	
		System.out.println("Parabens Jogador 2 acertou com " + contador + " tentativas" );
		}
		
}



		
