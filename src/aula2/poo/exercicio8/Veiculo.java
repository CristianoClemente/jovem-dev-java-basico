package aula2.poo.exercicio8;

public abstract class Veiculo {
	private String nome;
	private String cor;
	private int velocidade;

	public Veiculo(String nome, String cor, int velocidade) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.velocidade = velocidade;
	}

	public abstract void acelerar();
}