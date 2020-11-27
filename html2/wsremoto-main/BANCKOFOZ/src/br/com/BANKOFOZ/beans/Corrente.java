package br.com.BANKOFOZ.beans;

import br.com.BANKOFOZ.util.PadraoConta;

public class Corrente extends Conta implements PadraoConta {
	
	private float limite;
	private float taxa;
	
	public void debitarTaxa() {
		super.setSaldo(super.getSaldo() - getTaxa());
	}
	
	public void aumentarLimite(float porc) {
		limite = limite + limite * (porc/100);
	}
	
	public String getAll() {
		return 
				super.getAll() + "\n" +
				"Limites...:" +limite+ "\n"+
				"Taxa......:" +taxa;
				}
	
	public void setAll(short numero, byte digito, short agencia, float saldo, Cliente cliente, float limite, float taxa) {
		super.setAll(numero, digito, agencia, saldo, cliente);
		this.limite = limite;
		this.taxa = taxa;
	}
	
	
	public Corrente(short numero, byte digito, short agencia, float saldo, Cliente cliente, float limite, float taxa) {
		super(numero, digito, agencia, saldo, cliente);
		this.limite = limite;
		this.taxa = taxa;
	}
	public Corrente() {
		super();
	}
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	public float getTaxa() {
		return taxa;
	}
	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}
	@Override
	public boolean sacar(float param ) {
		if((super.getSaldo()+limite) < param) {
			return false;
		}
		super.setSaldo(super.getSaldo() - param);
		return true;
	}
	@Override
	public boolean depositar(float param) {
		if(param<=0) {
			return false;
		}
		super.setSaldo(super.getSaldo() + param);
		return true;
	}
	

}
