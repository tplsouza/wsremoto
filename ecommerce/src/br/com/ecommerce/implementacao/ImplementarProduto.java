package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.beans.Cd;
import br.com.ecommerce.beans.Livro;
import br.com.ecommerce.beans.Produto;
import br.com.ecommerce.util.Magica;

public class ImplementarProduto {

	public static void main(String[] args) {
		Produto objeto=null;
		
		char opcao = Magica.s("Digite <L> ou <C>").charAt(0);
		if (opcao == 'L') {
			objeto = new Livro(
					
					Magica.s("Descrição"),
					Magica.f("Valor Venda"),
					Magica.f("Valor compra"),
					Magica.i("ID"),
					Magica.i("qtdade"),
					Magica.s("isbn"),
					Magica.s("Autor"),
					Magica.s("Editora")
					);
		} else {
			objeto = new Cd(
					
					Magica.s("Descrição"),
					Magica.f("Valor Venda"),
					Magica.f("Valor compra"),
					Magica.i("ID"),
					Magica.i("qtdade"),
					Magica.s("Artista"),
					Magica.i("Total de faixas"),
					Magica.b("É lancamento - true ou false")
					);
		}
		
		System.out.println(objeto.getAll());
		JOptionPane.showMessageDialog(null, objeto.getAll());
		JOptionPane.showMessageDialog(null, objeto.retornarImposto());
		
	 while(JOptionPane.showConfirmDialog
			(
					null,
					"Deseja continuar?",
					"Pergunta",
					JOptionPane.YES_NO_OPTION
					)==0
			);
}

}
