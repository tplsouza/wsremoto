package br.com.folha.beans;

import br.com.folha.util.MinhaExcecao;

public class Empreiteiro extends Funcionario  implements PadraoFuncionario{
	private float valorEmpreita;

	public Empreiteiro(String nome, int numeroRegistro, float valorEmpreita) {
		super(nome, numeroRegistro);
			
		try {
            if(valorEmpreita>0)
                this.valorEmpreita = valorEmpreita;
            else throw new RuntimeException();
            
        }
        catch(Exception e){
            System.out.println(MinhaExcecao.tratar(e));
        }
	}

	public Empreiteiro() {
		super();
	}

	public float getValorEmpreita() {
		return valorEmpreita;
	}

	public void setValorEmpreita(float valorEmpreita) {
		this.valorEmpreita = valorEmpreita;
	}

	@Override
	public float calcularSalario() {
		// TODO Auto-generated method stub
		return valorEmpreita;
	}
	
	
	

}
