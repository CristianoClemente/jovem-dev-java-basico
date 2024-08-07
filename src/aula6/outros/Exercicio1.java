package aula6.outros;

public class Exercicio1 {
	public static void main(String[] args) {
		new Exercicio1();
	}

	public Exercicio1() {
		for (DiaSemanaEnum dia : DiaSemanaEnum.values()) {
			System.out.println(dia.getNome() + " é fim de semana? " + dia.isFimDeSemana());
		}
	}
}
