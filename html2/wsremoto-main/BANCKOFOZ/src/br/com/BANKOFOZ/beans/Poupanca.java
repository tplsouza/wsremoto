package br.com.BANKOFOZ.beans;

import br.com.BANKOFOZ.util.PadraoConta;

public class Poupanca extends Conta implements PadraoConta {

		private float rendimento;
		
		public void creditarRendimento() {
			setSaldo(getSaldo()+ getSaldo()*(rendimento/100));
		}
		
		public String getAll() {
			return 
					super.getAll() + "\n" +
					"Rendimentos...:" + rendimento;
		}
		
		public void setAll(short numero, byte digito, short agencia, float saldo, Cliente cliente, float rendimento) {
			super.setAll(numero, digito, agencia, saldo, cliente);
			this.rendimento = rendimento;
		}		

		public Poupanca(short numero, byte digito, short agencia, float saldo, Cliente cliente, float rendimento) {
			super(numero, digito, agencia, saldo, cliente);
			this.rendimento = rendimento;
		}

		public Poupanca() {
			super();
		}

		public float getRendimento() {
			return rendimento;
		}

		public void setRendimento(float rendimento) {
			this.rendimento = rendimento;
		}
		@Override
		public boolean sacar(float param ) {
			if(param> super.getSaldo()) {
				return false;
			}
			super.setSaldo(super.getSaldo()-param);
			return true;
		}
		@Override
		public boolean depositar(float param) {
			if(param<=0) {
				return true;
			}
			super.setSaldo(super.getSaldo() + param);
			return false;
		}
		
		
		
}
