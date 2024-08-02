package avaliacao.semana1.model;

import java.util.ArrayList;

public class Venda {

	private Cliente cliente;
	private ArrayList<ItemVenda> itens;
	private String metodoPagamento;

	public Venda(Cliente cliente, ArrayList<ItemVenda> itens, String metodoPagamento) {
		this.cliente = cliente;
		this.itens = itens;
		this.metodoPagamento = metodoPagamento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<ItemVenda> getItens() {
		return itens;
	}

	public void setItens(ArrayList<ItemVenda> itens) {
		this.itens = itens;
	}

	public String getMetodoPagamento() {
		return metodoPagamento;
	}

	public void setMetodoPagamento(String metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}

	public double totalItensVendar() {

		double valorTotal = 0;

		for (ItemVenda item : itens) {
			valorTotal += item.valorTotal();
		}

		return valorTotal;

	}

	public String listItens() {
		String msg = "******** CUPOM ********\n\n";

		for (ItemVenda item : itens) {
			msg += item.getProduto().getProduto() + "\n" + item.getQuantidade() + "x " + item.getProduto().getPreco()
					+ ".............." + item.valorTotal();

		}

		msg += "SubTotal ............" + totalItensVendar();

		return msg;

	}

}
