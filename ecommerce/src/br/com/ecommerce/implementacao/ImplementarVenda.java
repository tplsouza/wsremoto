package br.com.ecommerce.implementacao;

import br.com.ecommerce.beans.Cliente;
import br.com.ecommerce.beans.Endereco;
import br.com.ecommerce.beans.Produto;
import br.com.ecommerce.beans.Venda;
import br.com.ecommerce.util.Magica;

public class ImplementarVenda {


	
	public static void main(String[] args) {
		
		Venda venda = new Venda(
				Magica.f("total"),
				Magica.s("Data"),
				new Cliente(
						Magica.i("ID Cliente"),
						Magica.s("Nome do Cliente"),
						Magica.s("CPF cliente"),
						new Endereco(
								Magica.s("Endereco Cliente"),
								Magica.s("Numero"),
								Magica.b("Complemento"),
								Magica.s("Bairro"),
								Magica.s("Cidade"),
								Magica.s("UF"),
								Magica.s("CEP")
								)
						),
				new Produto(
						Magica.s("Descrição Produto"),
						Magica.f("Valor de Venda"),
						Magica.f("Valor de Compra"),
						Magica.i("ID Produto"),
						Magica.i("Qunatidade")
						)
				
				);
		
		System.out.println(venda.getAll());
		
	
	
		

	}

}
