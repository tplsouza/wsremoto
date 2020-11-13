package br.com.bankofoz.beans;

import br.com.bankofoz.util.PadraoConta;

public class Corrente extends Conta implements PadraoConta{
	private float limite;
	private float taxa;
	
	public Corrente(short numero, byte digito, short agencia, float saldo, Cliente cliente, float limite, float taxa) {
		super(numero, digito, agencia, saldo, cliente);
		this.limite = limite;
		this.taxa = taxa;
	}

	public Corrente() {
		super();
	}
	
	public void setAll(short numero, byte digito, short agencia, float saldo, Cliente cliente, float limite, float taxa) {
		setAll(numero, digito, agencia, saldo, cliente);
		this.limite = limite;
		this.taxa = taxa;
	}

	public String getAll () {
		return
				super.getAll() + "\n" +
				"Limite: "+ limite + "\n" +
				"Taxa: "+ taxa + "\n" ; 
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
	
	public boolean sacar(float valor1) {
		if ((getSaldo() + getLimite()) >= valor1) {
			setSaldo(getSaldo() - valor1);
			if (getSaldo()<0) {
				setLimite(getLimite()+getSaldo());
			}
			return true;
			} else {
		return false; 
			}
	}

	public boolean depositar(float valor2) {
		setSaldo(getSaldo() + valor2);
		return false;
	}
	
	public void debitarTaxa() {
		if (getSaldo()+getLimite() >= taxa) {
		setSaldo(super.getSaldo()- taxa);
	}}
	
	public void aumentarLimite(float taxa1) {
		setLimite(getLimite() * (1+(taxa1/100)));
	}
}
