package br.com.bankofoz.beans;

import br.com.bankofoz.util.PadraoConta;

public class Poupanca extends Conta implements PadraoConta {
	private float rendimento;

	public Poupanca(short numero, byte digito, short agencia, float saldo, Cliente cliente, float rendimento) {
		super(numero, digito, agencia, saldo, cliente);
		this.rendimento = rendimento;
	}

	public Poupanca() {
		super();
	}
	
	public void setAll(short numero, byte digito, short agencia, float saldo, Cliente cliente, float rendimento) {
		setAll(numero, digito, agencia, saldo, cliente);
		this.rendimento = rendimento;
	}
	
	public String getAll () {
		return
				super.getAll() + "\n" +
				"Rendimento: "+ rendimento + "\n" ; 
	}

	public float getRendimento() {
		return rendimento;
	}

	public void setRendimento(float rendimento) {
		this.rendimento = rendimento;
	}
	
	public void creditarRendimento() {
		setSaldo(getSaldo() + getSaldo() * (getRendimento() / 100));
	}

	@Override
	public boolean sacar(float valor1) {
		if (getSaldo() >= valor1) {
			setSaldo(getSaldo() - valor1);
			return true;
			} else {
		return false; 
			}
	}

	@Override
	public boolean depositar(float valor2) {
		setSaldo(getSaldo() + valor2);
		return false;
	}
}
