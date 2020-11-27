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
		System.out.printf("%s seu imc é: %.2f\n ", nome, imc);
		
		/*
		 * Identificador (nome de classe, nome de variavel, nome de método)
		 * Regras:
		 * 1º - Não começarás com números. Exemplo errado: 1berto => h1berto
		 * 2º - Não utilizarás palavras reservadas da linguagem (public, class, int, double, char)
		 * 3º - Não farás uso de caracteres especiais (@, !,? %, $, , .)
		 * 
		 * Padrões:
		 * 1º - Nomes significativos
		 * 2º - Utilizar o padrão camelCase.
		 * 		Correto: variavel dataDeNascimento - Errado: datadenascimento
		 * 3º - Respeite as caixas e os padrões dos recursos
		 * Classe: SEMPRE começa com letra maiuscula
		 * Variavel: SEMPRE começa com minusculo
		 * Método: SEMPRE começa com minusculo e é seguido de parenteses (verbo)
		 * 
		 * xpto= variavel , ???.xpto() = método , Xpto= classe.
		 */
		
	}

}
