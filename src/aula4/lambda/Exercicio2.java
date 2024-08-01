package aula4.lambda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;

public class Exercicio2 {
	public static void main(String[] args) {
		new Exercicio2();
	}
	

	public Exercicio2() {

		ArrayList<Aluno> alunos = new ArrayList<Aluno>(5);

		Aluno a = new Aluno(1, "Ana", LocalDate.parse("05/02/2015", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		Aluno b = new Aluno(2, "João", LocalDate.parse("03/02/2015", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		Aluno c = new Aluno(3, "Maria", LocalDate.parse("12/11/2014", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		Aluno d = new Aluno(4, "Zeca", LocalDate.parse("24/11/2013", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		Aluno e = new Aluno(5, "Paulo", LocalDate.parse("28/11/2013", DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		alunos.add(a);
		alunos.add(b);
		alunos.add(c);
		alunos.add(d);
		alunos.add(e);

		alunos.sort(Comparator.comparing(Aluno::getDataNascimento));

		for (Aluno aluno : alunos) {
			System.out.println(aluno.getNumeroChamada() + " " + aluno.getNome() + " "
					+ aluno.getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		}

	}
}