package aula4.lambda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;

public class Exercicio3 {
	public static void main(String[] args) {
		new Exercicio3();
	}

	public Exercicio3() {

		ArrayList<Aluno> alunos = new ArrayList<Aluno>(5);

		Aluno aluno1 = new Aluno(1, "Ana", LocalDate.parse("05/02/2015", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		Aluno aluno2 = new Aluno(2, "João", LocalDate.parse("03/02/2015", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		Aluno aluno3 = new Aluno(3, "Tiago", LocalDate.parse("12/11/2014", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		Aluno aluno4 = new Aluno(4, "Zeca", LocalDate.parse("24/11/2013", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		Aluno aluno5 = new Aluno(5, "Tonho", LocalDate.parse("28/11/2013", DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
		alunos.add(aluno4);
		alunos.add(aluno5);

		alunos.sort(Comparator.comparing(Aluno::getDataNascimento));

		exibeLista(alunos, "LISTA ANTIGA\n");

		alunos.removeIf(a -> {
			String nome = a.getNome();
			if (nome != null && !nome.isEmpty()) {
				return nome.charAt(0) == 'T' && nome.charAt(nome.length() - 1) == 'o';
			}
			return false;
		});

		exibeLista(alunos, "\nLISTA ATUALIZADA\n");

	}

	public void exibeLista(ArrayList<Aluno> alunos, String msg) {
		System.out.println(msg);
		for (Aluno aluno : alunos) {
			System.out.println(aluno.getNumeroChamada() + " " + aluno.getNome() + " "
					+ aluno.getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		}
	}
}
