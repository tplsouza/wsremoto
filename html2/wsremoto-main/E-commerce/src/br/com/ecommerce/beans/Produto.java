package br.com.ecommerce.beans;

import br.com.ecommerce.util.PadraoProduto;

public class Produto implements PadraoProduto{
	
	private String descricao;
	private float valorVenda;
	private float valorCompra;
	private int id;
	private int qtde;
	
	public String getAll() {
		return 
				"Produto.....: " + descricao+ "\n" +
				"Valor Venda.: " + valorVenda+ "\n" +
				"Valor Compra: " + valorCompra + "\n" +
				"ID..........:"  + id+ "\n"+
				"Qtde........: " + qtde;
		}
	
	public void setAll(String descricao, float valorVenda, float valorCompra, int id, int qtde) {
		this.descricao=descricao;
		this.valorVenda=valorVenda;
		this.valorCompra=valorCompra;
		this.id=id;
		this.qtde=qtde;
	}
		
	public Produto() {
		super();
	}
	public Produto(String descricao, float valorVenda, float valorCompra, int id, int qtde) {
		super();
		this.descricao = descricao;
		this.valorVenda = valorVenda;
		this.valorCompra = valorCompra;
		this.id=id; 
		this.qtde = qtde;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}
	public float getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	public int getQid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}

	@Override
	public float retornarImposto() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float obterValorPromocao(float param) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
