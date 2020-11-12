package br.com.tv.modelo;

public class televisao {
	private String marca;
	private float valorVenda;
	private float valorCompra;
	private int volume;
	private int canal;
	private boolean status;
	
	public void preencherMarca(String pMarca) {
		marca = pMarca;
	}
	
    public void preencherValorCompra(float pValor) {
		valorCompra = pValor;
	}
    
    public String definirValorVenda() {
    	valorVenda = (float) (valorCompra * 0.8);
		return "Valor de Venda é:" + valorVenda;
	}
    
    public void ligar() {
		status = true;
	}

    public void desligar() {
    	status = false;
    	volume = 0;
	}
    
    public String retornaStatus() {
    	return "TV está: "+ status;
  	}
    
    public void aumentarVolume() {
		if (status == true && (volume + 1) <20 ){
			volume =+ 1;
		}
   	}
    
    public void diminuirVolume() {
    	if (status == true && (volume - 1) > 0 ){
			volume =- 1 ;
    	}
		
   	}
    public void mudarCanal(int pCanal) {
    	if (status == true && pCanal > 0 && pCanal < 999) {
    		canal = pCanal;
    	}
   	}
    
    public String retornarResumo() {

		return
				"Status..........: " + status + "\n" +
				"Canal...........: " + canal + "\n" +
				"Volume..........: " + volume + "\n" +
				"Valor de Venda..: " + valorVenda + "\n" +
				"Valor de Compra.: " + valorCompra;
				

	}
}
