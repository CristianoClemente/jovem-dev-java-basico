package aula3.tratamentoerros.exceptions;

import java.util.ArrayList;
import java.util.List;

public class Venda {
	private String nomeCliente;
	private List<Item> itens;

	public Venda(String nomeCliente) {
		this.nomeCliente = nomeCliente;
		this.itens = new ArrayList<>();
	}

	public void adicionarItem(Item item) {
		itens.add(item);
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public List<Item> getItens() {
		return itens;
	}
}
