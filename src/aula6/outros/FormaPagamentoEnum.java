package aula6.outros;

import java.util.function.Function;

public enum FormaPagamentoEnum {

	CARTAO_DEBITO(1, "Cartão de Débito", vb -> vb), 
	CARTAO_CREDITO(2, "Cartão de Crédito", vb -> vb),
	DINHEIRO(3, "Dinheiro", vb -> vb), 
	PIX(4, "PIX", vb -> vb);

	private final int codigo;
	private final String descricao;
	private final Function<Double, Double> desconto;

	private FormaPagamentoEnum(int codigo, String descricao, Function<Double, Double> desconto) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.desconto = desconto;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public Function<Double, Double> getDesconto() {
		return desconto;
	}

}
