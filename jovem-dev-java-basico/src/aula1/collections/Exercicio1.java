package aula1.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Exercicio1 {
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			Random num = new Random();
			lista.add(num.nextInt(100));
		}
		Collections.sort(lista);
		for (int i : lista) {
			System.out.print(i + " ");

		}

	}

}
