package br.com.ecommerce.implementacao;

import br.com.ecommerce.beans.Cliente;
import br.com.ecommerce.beans.Endereco;
import br.com.ecommerce.beans.Produto;
import br.com.ecommerce.beans.Venda;
import br.com.ecommerce.util.Magica;

public class ImplementarEcommerce {
	

	public static void main(String[] args) {
		
		Venda vende = new Venda(
				Magica.f("Total Venda "),
				Magica.s("Data "),
				new Cliente (
						Magica.i("ID Cliente"),
						Magica.s("Nome"),
						Magica.s("CPF"),
						new Endereco()),
				new Produto (
						Magica.s("Descrição"),
						Magica.f("Valor Venda"),
						Magica.f("Valor Compra"),
						Magica.i("ID"),
						Magica.i("Qtde")
						)
				);
		System.out.println(vende.getAll());

	}

}
