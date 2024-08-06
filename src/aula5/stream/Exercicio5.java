package aula5.stream;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Exercicio5 {
	public static void main(String[] args) {

		new Exercicio5();
	}

	public Exercicio5() {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		Pessoa p1 = new Pessoa("Alan", "48998651548",
				LocalDate.parse("28/11/1992", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		Pessoa p2 = new Pessoa("João", "Telefone2",
				LocalDate.parse("28/09/1992", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		Pessoa p3 = new Pessoa("Ana", "Telefone3",
				LocalDate.parse("28/05/1992", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		Pessoa p4 = new Pessoa("Maria", "Telefone4",
				LocalDate.parse("28/11/1992", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		Pessoa p5 = new Pessoa("Juca", "Telefone5",
				LocalDate.parse("28/12/1992", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		Pessoa p6 = new Pessoa("Julia", "Telefone6",
				LocalDate.parse("28/08/1992", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		Pessoa p7 = new Pessoa("Criss", "Telefone7",
				LocalDate.parse("28/05/1992", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		Pessoa p8 = new Pessoa("Carol", "Telefone8",
				LocalDate.parse("28/06/1992", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		Pessoa p9 = new Pessoa("Alberto", "Telefone9",
				LocalDate.parse("28/01/1992", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		Pessoa p10 = new Pessoa("Taty", "Telefone10",
				LocalDate.parse("28/10/1992", DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p4);
		pessoas.add(p5);
		pessoas.add(p6);
		pessoas.add(p7);
		pessoas.add(p8);
		pessoas.add(p9);
		pessoas.add(p10);

		System.out.println(pessoas.stream().map(t -> t).filter(t -> t.getNome().endsWith("berto")).findFirst()
				.orElseThrow(() -> new ZeroBertoException()).getNome());
	}

}
