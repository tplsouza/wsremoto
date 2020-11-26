package br.com.folha.beans;

import br.com.folha.util.MinhaExcecao;

public class Comissionado extends Funcionario   implements PadraoFuncionario{
	
	private float salarioBase;
	private float comissao;
	
	public Comissionado(String nome, int numeroRegistro, float salarioBase, float comissao) {
		super(nome, numeroRegistro);
		
		try {
            if(salarioBase>0)
                this.salarioBase = salarioBase;
            else throw new RuntimeException();

            if(comissao>0)
                this.comissao = comissao;
            else throw new RuntimeException();
                                   
        }
        catch(Exception e){
            System.out.println(MinhaExcecao.tratar(e));
        }
	}

	public Comissionado() {
		super();
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

	@Override
	public float calcularSalario() {
		return salarioBase + (salarioBase * comissao)/100;
	}
	
	
}
