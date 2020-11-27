package br.com.BANKOFOZ.implementar;

import br.com.BANKOFOZ.beans.Cliente;
import br.com.BANKOFOZ.beans.Conta;
import br.com.BANKOFOZ.beans.Corrente;
import br.com.BANKOFOZ.beans.Endereco;
import br.com.BANKOFOZ.beans.Poupanca;
import br.com.BANKOFOZ.util.Magica;

public class ImplementarBANKOFOZ {

	public static void main(String[] args) {

		Conta objeto = new Conta();

		char opcao = Magica.s("Digite Tipo de conta P=Poupanca ou C=Corrente:").charAt(0);
		
		while (opcao != 'P' && opcao!='C') {
			opcao=Magica.s("Digite apenas P=Poupanca ou C=Corrente:").charAt(0);
		}
		if(opcao=='P') {
			objeto = new Poupanca(
					Magica.sh("Numero da conta"),
					Magica.by("Digito da conta"),
					Magica.sh("Numero da Agencia"),
					0,
					new Cliente(
							Magica.i("ID"),
							Magica.s("Nome"),
							Magica.s("CPF"),
							new Endereco()),
					Magica.f("Rendimento"));
		}
		{
			objeto=new Corrente(
					Magica.sh("Numero da conta"),
					Magica.by("Digito da conta"),
					Magica.sh("Numero da Agencia"),
					0,
					new Cliente(
							Magica.i("ID"),
							Magica.s("Nome"),
							Magica.s("CPF"),
							new Endereco()),
					1000,
					Magica.f("Taxa de manutenção"));

		} 
	}
		objeto.depositar(1000);
		System.out.println(objeto.getSaldo());

}

	

