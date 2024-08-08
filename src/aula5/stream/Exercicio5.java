package aula5.stream;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Exercicio5 {
	public static void main(String[] args) {

		new Exercicio5();
	}

	public Exercicio5() {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		pessoas.add(new Pessoa("Alan", "48998651548",
				LocalDate.parse("28/11/1992", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
		pessoas.add(new Pessoa("João", "Telefone2",
				LocalDate.parse("28/09/1992", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
		pessoas.add(new Pessoa("Ana", "Telefone3",
				LocalDate.parse("28/05/1992", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
		pessoas.add(new Pessoa("Maria", "Telefone4",
				LocalDate.parse("28/11/1992", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
		pessoas.add(new Pessoa("Julia", "Telefone6",
				LocalDate.parse("28/08/1992", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
		pessoas.add(new Pessoa("Criss", "Telefone7",
				LocalDate.parse("28/05/1992", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
		pessoas.add(new Pessoa("Carol", "Telefone8",
				LocalDate.parse("28/06/1992", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
		pessoas.add(new Pessoa("Alberto", "Telefone9",
				LocalDate.parse("28/01/1992", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
		pessoas.add(new Pessoa("Taty", "Telefone10",
				LocalDate.parse("28/10/1992", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
		pessoas.add(new Pessoa("Taty", "Telefone10",
				LocalDate.parse("28/10/1992", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));

		System.out.println(buscaNome(pessoas));
	}

	public String buscaNome(List<Pessoa> pessoas) {

		String nome = pessoas.stream().map(t -> t).filter(Objects::nonNull).filter(t -> t.getNome().endsWith("berto"))
				.findFirst().orElseThrow(() -> new ZeroBertoException()).getNome();

		return nome;

	}
	
}
