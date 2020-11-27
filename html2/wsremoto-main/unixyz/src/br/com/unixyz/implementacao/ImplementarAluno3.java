package br.com.unixyz.implementacao;

import javax.swing.JOptionPane;

import br.com.unixyz.beans.Aluno;

public class ImplementarAluno3 {

	public static void main(String[] args) {
		Aluno abc = new Aluno(
				Integer.parseInt(JOptionPane.showInputDialog("RM")),
				JOptionPane.showInputDialog("Nome"),
				JOptionPane.showInputDialog("Email")
				);
		System.out.println(abc.getAll());
	}

}
