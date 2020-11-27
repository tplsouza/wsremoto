package variaveis;

public class ManipulaString {

	public static void main(String[] args) {
		// manipula string
		String email = "xpTo@itau-uNibanco.cOm.bR";
		System.out.println("Original: " + email);
		System.out.println("Minuscula: " + email.toLowerCase());
		System.out.println("Maiuscula: " + email.toUpperCase());
		System.out.println("Qtde de Caracteres: " + email.length());
		System.out.println("Tem arroba ? " + email.contains("@"));
		System.out.println("Posi��o do arroba " + email.indexOf("@"));
		System.out.println("Do 2� ate 4� caracter " + email.substring(1,5));
		
		// Quero exibir a primeira metade do e-mail
		System.out.println("Primeira metade do email: " + email.substring(0, email.length()/2));

		// Quero que exibam o usuario do e-mail
		System.out.println("Exibir o usu�rio " + email.substring(0, email.indexOf("@")));
		
		// Quer que exibam apenas o servidor
		System.out.println("Servidor : " + email.substring(email.indexOf("@")+1).toLowerCase());
		
		// comparar e-mail COM case SENSITIVE
		System.out.println("Compara��o case sensitive : "+ email.equals("xpto@itau-unibanco.com.br"));
		
		// comparar e-mail SEM case SENSITIVE
		System.out.println("Compara��o sem case sensitive : "+ email.equalsIgnoreCase("xpto@itau-unibanco.com.br"));
		
				
	}

}
