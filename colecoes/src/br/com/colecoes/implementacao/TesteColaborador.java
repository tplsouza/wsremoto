package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.colecoes.beans.Colaborador;
import br.com.colecoes.util.Magica;

public class TesteColaborador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colaborador colaborador = new Colaborador();
		colaborador.setCpf(Magica.s("digite o cpf:"));
		colaborador.setNome(Magica.s("digite o nome:"));
		
		List<String> lista = new ArrayList<String>();
		colaborador.setFone(lista);
		do {
			lista.add(Magica.s("digite telefone"));
		} while (JOptionPane.showConfirmDialog
				(null,"Cadastrar Telefone", "Pergunta",JOptionPane.YES_NO_OPTION)==0);
		
	System.out.println(colaborador.getAll());	
		
	}

}
