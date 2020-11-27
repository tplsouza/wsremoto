package br.com.formula1.modelo;

public class Carro {

	private String escuderia;
	private short numero;
	private String cor;
	private float velocidadeAtual;
	private float valor;
	private boolean status;

	//Sintaxe de metodo no JAVA
	//<modificador> <tipo do retorno> <nome do metodo> (<tipo paramentro> <nome do parametro>)

	public void acelerar(float param) {
		if(status==true) {
		velocidadeAtual+=param;
		}
	}
	public void desacelerar(float param) {
		if(status==true && velocidadeAtual>param) {
		   velocidadeAtual-=param;
		}
	}
	public void brecar() {
		if(status==true) {
			velocidadeAtual=0;
		}
	}
	public float exibirVelocidadeAtual() {
		return velocidadeAtual;
	}
	public String exibirStatus() {
		String variavel = "Ligado";
		if (status==false) {
			variavel = "Desligadoo";
		};
		return variavel;
	}	
	
	public void preencherBasico(short param1, String param2, float param3) {
		numero=param1;
		escuderia=param2.toUpperCase();
		valor=param3;
	}
	public String exibirTudo() {
		String variavel = "Ligado";
		if (status==false) {
			variavel = "Desligadoo";
		}			
		return 
				"Escuderia.......: " + escuderia+ "\n" +
				"Numero..........: " + numero+ "\n" +
				"Cor.............: " + cor+ "\n" +
				"Velocidade Atual: " + velocidadeAtual+ "\n" +
				"Valor...........: " + valor+ "\n" +
				"Status..........: " + variavel;
	}
	public void preencherValor(float param) {
		valor=param;
	}
	public float retornarPromocao() {
		return valor * (float) 0.9;
	}

	public void preencherEscuderia(String param) {
		escuderia=param;		
	}
	public String retornarEscuderia() {
		return escuderia.toUpperCase();
	}

	public void preencherNumero(short param) {
		if (param>0) {
			numero=param;
		}
	}
	public short retornarNumero() {
		return numero;
	}
	public String ligar() {
		status=true;
		return "Ligado";
	}
	public String desligar() {
		status=false;
		velocidadeAtual=0;
		return "desligado";
	}
} // Fecha classe
