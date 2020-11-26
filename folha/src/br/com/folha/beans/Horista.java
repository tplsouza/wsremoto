package br.com.folha.beans;

import br.com.folha.util.MinhaExcecao;

public class Horista extends Funcionario  implements PadraoFuncionario{

	private float valorHora;
	private int numeroHoras;
	
	public Horista(String nome, int numeroRegistro, float valorHora, int numeroHoras) {
		super(nome, numeroRegistro);
			try {
            if(valorHora>0)
                this.valorHora = valorHora;
            else throw new RuntimeException();

            if(numeroHoras>0)
                this.numeroHoras = numeroHoras;
            else throw new RuntimeException();
                       
        }
        catch(Exception e){
            System.out.println(MinhaExcecao.tratar(e));
        }
	}

	public Horista() {
		super();
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}

	public int getNumeroHoras() {
		return numeroHoras;
	}

	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}
	
	@Override
	public float calcularSalario() {
		return valorHora * numeroHoras;
	}
	
}
