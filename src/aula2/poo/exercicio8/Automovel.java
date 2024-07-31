package aula2.poo.exercicio8;

public class Automovel extends Veiculo {

	public Automovel(String nome, String cor, int velocidade) {
		super(nome, cor, velocidade);
	}

	@Override
	public void acelerar() {
		System.out.println("Vrum");
	}

}