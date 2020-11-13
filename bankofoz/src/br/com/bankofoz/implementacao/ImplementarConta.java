package br.com.bankofoz.implementacao;

import javax.swing.JOptionPane;

import br.com.bankofoz.beans.Cliente;
import br.com.bankofoz.beans.Conta;
import br.com.bankofoz.beans.Corrente;
import br.com.bankofoz.beans.Endereco;
import br.com.bankofoz.beans.Poupanca;
import br.com.bankofoz.util.Magica;


public class ImplementarConta {

	public static void main(String[] args) {
	Conta objeto=null;
	
	char escolha = Magica.s("Digite <P> ou <C>").charAt(0);
	
	if (escolha == 'P') {
		objeto = new Poupanca(
				Magica.sh("Numero"),
				Magica.by("Digito"),
				Magica.sh("Agencia"),
				Magica.f("Saldo"),
				new Cliente(
						Magica.i("Id"),
						Magica.s("nome"),
						Magica.s("CPF"),
						new Endereco(
								Magica.s("Endereco Cliente"),
								Magica.s("Numero"),
								Magica.s("Complemento"),
								Magica.s("Bairro"),
								Magica.s("Cidade"),
								Magica.s("UF"),
								Magica.s("CEP")
								)						
						),
				Magica.f("rendimento")
				);
	} else {
		objeto = new Corrente(
				Magica.sh("Numero"),
				Magica.by("Digito"),
				Magica.sh("Agencia"),
				Magica.f("Saldo"),
				new Cliente(
						Magica.i("Id"),
						Magica.s("nome"),
						Magica.s("CPF"),
						new Endereco(
								Magica.s("Endereco Cliente"),
								Magica.s("Numero"),
								Magica.s("Complemento"),
								Magica.s("Bairro"),
								Magica.s("Cidade"),
								Magica.s("UF"),
								Magica.s("CEP")
								)),
				Magica.f("Limite"),
				Magica.f("Taxa")
				);
	}
	
	System.out.println(objeto.getAll());
	objeto.depositar(1000);
	objeto.sacar(500);
	
	JOptionPane.showMessageDialog(null, objeto.getAll());
	
	
}
	
}
