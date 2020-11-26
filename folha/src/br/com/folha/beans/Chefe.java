package br.com.folha.beans;

import br.com.folha.util.MinhaExcecao;

public class Chefe extends Funcionario implements PadraoFuncionario {
	
	private float salarioBase;
	private float adicionalFuncao;
	private float beneficioTerno;
	
	public Chefe(String nome, int numeroRegistro, float salarioBase, float adicionalFuncao, float beneficioTerno) {
		super(nome, numeroRegistro);
		
		try {
            if(salarioBase>0)
                this.salarioBase = salarioBase;
            else throw new RuntimeException();

            if(adicionalFuncao>0)
                this.adicionalFuncao = adicionalFuncao;
            else throw new RuntimeException();
            
            if(beneficioTerno>0)
                this.beneficioTerno = beneficioTerno;
            else throw new RuntimeException();
            
        }
        catch(Exception e){
            System.out.println(MinhaExcecao.tratar(e));
        }

	}

	public Chefe() {
		super();
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getAdicionalFuncao() {
		return adicionalFuncao;
	}

	public void setAdicionalFuncao(float adicionalFuncao) {
		this.adicionalFuncao = adicionalFuncao;
	}

	public float getBeneficioTerno() {
		return beneficioTerno;
	}

	public void setBeneficioTerno(float beneficioTerno) {
		this.beneficioTerno = beneficioTerno;
	}

	@Override
	public float calcularSalario() {
		return salarioBase + ((salarioBase * adicionalFuncao)/100) + beneficioTerno;
	}
	
	
}
