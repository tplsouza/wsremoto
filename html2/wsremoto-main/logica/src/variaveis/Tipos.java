package variaveis;

public class Tipos {

	public static void main(String[] args) {
	// tipo do dado  <nome da variavel/objeto>
	// String, int e double
	
		String nome = "Robert Rodrigues";
		int idade = 50;
		double altura = 1.69;
		double peso = 68.100;
		
		System.out.println("Nome:... " + nome);
		System.out.println("Idade:.. " + idade + " anos.");
		System.out.println("Altura:. " + altura + " metros.");
		System.out.println("Peso:... " + peso + " kilos.");
		
		double imc = peso / (altura * altura);
		
		// no printf() usamos :
		// %s => para String
		// %f => para numero reais
		// %d => para numeros inteiros
		
		System.out.printf("IMC:.... %.2f\n" , imc);
		System.out.printf("%s seu imc �: %.2f\n ", nome, imc);
		
		/*
		 * Identificador (nome de classe, nome de variavel, nome de m�todo)
		 * Regras:
		 * 1� - N�o come�ar�s com n�meros. Exemplo errado: 1berto => h1berto
		 * 2� - N�o utilizar�s palavras reservadas da linguagem (public, class, int, double, char)
		 * 3� - N�o far�s uso de caracteres especiais (@, !,? %, $, , .)
		 * 
		 * Padr�es:
		 * 1� - Nomes significativos
		 * 2� - Utilizar o padr�o camelCase.
		 * 		Correto: variavel dataDeNascimento - Errado: datadenascimento
		 * 3� - Respeite as caixas e os padr�es dos recursos
		 * Classe: SEMPRE come�a com letra maiuscula
		 * Variavel: SEMPRE come�a com minusculo
		 * M�todo: SEMPRE come�a com minusculo e � seguido de parenteses (verbo)
		 * 
		 * xpto= variavel , ???.xpto() = m�todo , Xpto= classe.
		 */
		
	}

}
