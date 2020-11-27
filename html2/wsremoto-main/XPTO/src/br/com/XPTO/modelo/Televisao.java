package br.com.XPTO.modelo;

public class Televisao {
	private String marca;
	private float valorVenda;
	private float valorCompra;
	private int volume;
	private int canal;
	private boolean status;

	public void preencherMarca (String pMarca) {
		marca=pMarca;
	}
	public void preencherValorCompra (float pValor) {
		valorCompra=pValor;
	}	
	public float definirValorVenda() {
		return valorVenda = (valorCompra*20)/100; 
	}
	public boolean ligar() {
		return status;
	}
	public boolean desligar() {
		return status;
	}
	public String retornarStatus() {
		String variavel;
		if(status==true) {
			variavel="Ligado";
		}else { variavel="Desligado";}
		return variavel;
	}

}

