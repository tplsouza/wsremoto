package br.com.ecommerce.beans;

public class Venda {
	
	private float totalVenda;
	private String data;
	private Cliente cliente;
	private Produto produto;
	
	public String getAll() {
		return 
				"Venda......: " + totalVenda+ "\n" +
				"Data.......: " + data+ "\n" +
				"Cliente....: " + cliente.getAll() + "\n" +
				produto.getAll();
		}
	
	public void setAll(float totalVenda, String data, Cliente cliente, Produto produto) {
		this.totalVenda=totalVenda;
		this.data=data;
		this.cliente=cliente;
		this.produto=produto;
	}
	
	public Venda() {
		super();
	}
	public Venda(float totalVenda, String data, Cliente cliente, Produto produto) {
		super();
		this.totalVenda = totalVenda;
		this.data = data;
		this.cliente = cliente;
		this.produto = produto;
	}
	public float gettotalVenda() {
		return totalVenda;
	}
	public void settotalVenda(float totalVenda) {
		this.totalVenda = totalVenda;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	

}
