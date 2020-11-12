package variaveis;

public class ManipulaString {

	public static void main(String[] args) {
		String email = "xpTo@itau-Unibanco.Com.bR";
		System.out.println("Original: " + email);
		System.out.println("minuscula: " + email.toLowerCase());
		System.out.println("maiuscula: " + email.toUpperCase());
		System.out.println("qtdade caracteres: " + email.length());
		System.out.println("Tem @: " + email.contains("@"));
		System.out.println("Posi��o @: " + email.indexOf("@"));
		System.out.println("2 ao 4 caract: " + email.substring(1,5));
		System.out.println("1 metade: " + email.substring(0,email.length()/2));
		System.out.println("user: " + email.substring(0,email.indexOf("@")));
		System.out.println("server: " + email.substring(email.indexOf("@")+1,email.indexOf(".")).toLowerCase());
		System.out.println("Compara��o: " + email.equals("XPTo@itau-Unibanco.Com.bR"));
		System.out.println("Compara��o sem case sensitive: " + email.equalsIgnoreCase("xpTo@itau-Unibanco.Com.bR"));
	}

}
