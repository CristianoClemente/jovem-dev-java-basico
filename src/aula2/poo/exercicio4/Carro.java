package aula2.poo.exercicio4;

public class Carro {

	public String modelo, ano, cor;

	public Carro(String modelo, String ano, String cor) {
		super();
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
