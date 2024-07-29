package aula1.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Exercicio2 {
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		String msg = "";

		for (int i = 0; i < 50; i++) {
			Random num = new Random();
			lista.add(num.nextInt(100));
		}
		Collections.sort(lista);

		for (int i : lista) {
			msg = i + " " + msg;
		}
		System.out.println(msg);
	}
}
