package aula4.lambda;

import java.util.ArrayList;
import java.util.List;

public class Exemplo {
	public static void main(String[] args) {
		new Exemplo();
	}

	public Exemplo() {
		List<String> lista = new ArrayList<String>();

		lista.add("asdasd");
		lista.add("dasd");
		lista.add("sd");
		lista.add("sdasd");
		lista.add("sdasd");
		lista.add("dsd");

		String filtro = "sd";
		lista.removeIf(filtro::equals);

		// Consumer
		lista.forEach(System.out::println);

		// Thread.sleep(5000);

		// Supplier<T>

		String s1 = null;
		// String o = Optional.ofNullable(s1).orElseGet(()->pegaString());

	}

	// Predicate <T> Pega um argumento e retorna verdadeiro ou falso

	// Function<T,R>

}
