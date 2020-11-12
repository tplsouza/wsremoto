package br.com.unixyz.implementacao;

import javax.swing.JOptionPane;

import br.com.unixyz.beans.Aluno;

public class ImplementarAluno {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setRm(Integer.parseInt(JOptionPane.showInputDialog("RM")));
		aluno.setNome(JOptionPane.showInputDialog("nome"));
		aluno.setEmail(JOptionPane.showInputDialog("email"));
		
		System.out.println(aluno.getRm());
		System.out.println(aluno.getNome());
		System.out.println(aluno.getEmail());
	}

}
