package variaveis;

public class Tipos {

	public static void main(String[] args) {
		
		String nome = "Tiago Pelicer Lopes de Souza";
		int idade = 32;
		double altura = 1.84;
		double peso = 70.5;
		
		System.out.println("Nome...: " + nome);
		System.out.println("Idade..: " +idade+ " anos");
		System.out.println("Altura.: " +altura+ " metros");
		System.out.println("Peso...: " +peso+ " kg");
		
		double imc = peso / (altura*altura);
		System.out.printf("IMC....: %.2f\n", imc);
		System.out.printf("%s seu IMC �: %.2f\n",nome, imc);
		
	}

}
