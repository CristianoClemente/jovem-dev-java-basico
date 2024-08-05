package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio3 {
	public static void main(String[] args) {
		new Exercicio3();
	}

	public Exercicio3() {
		List<Integer> numLista = new ArrayList<>();
		Random random = new Random();

		for (int i = 0; i < 50; i++) {
			int numAleatorio = random.nextInt(100);
			numLista.add(numAleatorio);

		}

		System.out.println(numLista);
		System.out.println(numLista.stream().filter(i -> i.equals(25)).mapToInt(i -> i).count());

	}

}
