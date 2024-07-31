package aula2.poo.exercicio7;

public class NotaFiscal {
	private String emitente;
	private double valor;

	public NotaFiscal(String emitente) {
		this.emitente = emitente;
	}

	public String getEmitente() {
		return emitente;
	}

	public void setEmitente(String emitente) {
		this.emitente = emitente;
	}

	public double getValor() {
		return valor;
	}

	public double calculaValor(double valorBruto, double desconto) {
		return this.valor = valorBruto - desconto;

	}
}