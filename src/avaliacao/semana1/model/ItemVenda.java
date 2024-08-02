package avaliacao.semana1.model;

public class ItemVenda {

	private Produto produto;
	private int quantidade;

	public ItemVenda(Produto nomeProduto, int quantidade) {
		this.produto = nomeProduto;
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double valorTotal() {
		return produto.getPreco() * quantidade;

	}

}
