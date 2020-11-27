package br.com.unixyz.implementacao;

import javax.swing.JOptionPane;

import br.com.unixyz.beans.Aluno;

public class ImplementarAluno {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setRm(Integer.parseInt(JOptionPane.showInputDialog("RM")));
		aluno.setNome(JOptionPane.showInputDialog("Nome"));
		aluno.setEmail(JOptionPane.showInputDialog("Email"));
		System.out.println("RM: "  + aluno.getRm());
		System.out.println("Nome: "  + aluno.getNome());
		System.out.println("Email: "  + aluno.getEmail());

	}
}
