package avaliacao.semana1.model;

public class Produto {

	private String nome;
	private double preco;

	public Produto(String produto, double preco) {
		this.nome = produto;
		this.preco = preco;
	}

	public String getProduto() {
		return nome;
	}

	public void setProduto(String produto) {
		this.nome = produto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
