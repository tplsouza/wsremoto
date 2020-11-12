package br.com.ecommerce.beans;

public class Venda {

	private float total;
	private String data;
	private Cliente cliente;
	private Produto produto;
	
	public Venda(float total, String data, Cliente cliente, Produto produto) {
		super();
		this.total = total;
		this.data = data;
		this.cliente = cliente;
		this.produto = produto;
	}
	
	
	
	public Venda() {
		super();
	}
	
	


	public float getTotal() {
		return total;
	}



	public void setTotal(float total) {
		this.total = total;
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



	public void setAll(float total, String data, Cliente cliente, Produto produto) {
		
		this.total = total;
		this.data = data;
		this.cliente = cliente;
		this.produto = produto;
	}
	public String getAll () {
		return
				"Total: "+ total + "\n" +
				"Data: : "+ data + "\n" +
				"Cliente: "+ cliente.getAll() + "\n" +
				"Produto: "+ produto.getAll() + "\n" ; 
	}
	
}
