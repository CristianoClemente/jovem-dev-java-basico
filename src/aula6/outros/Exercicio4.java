package aula6.outros;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Exercicio4 {
	public static void main(String[] args) {
		new Exercicio4();
	}

	public Exercicio4() {

		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		Pessoa p = new Pessoa();
		for (int i = 0; i < 2; i++) {
			p.setNome(JOptionPane.showInputDialog("Informme o nome:"));
			p.setTelefone(JOptionPane.showInputDialog("Informme o telefone:"));
			p.setDataNascimento(LocalDate.parse(JOptionPane.showInputDialog("Informe a data de Nascimento:"),
					DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			pessoas.add(p);
		}

		Pessoa maisVelha = pessoas.stream().min((p1, p2) -> p1.getDataNascimento().compareTo(p2.getDataNascimento()))
				.orElse(null);

		if (maisVelha != null) {
			StringBuilder sb = new StringBuilder();

			sb.append("Pessoa mais velha é:\n").append(maisVelha.getNome()).append("\n").append(maisVelha.getTelefone())
					.append("\n")
					.append(maisVelha.getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			JOptionPane.showMessageDialog(null, sb);
		} else {
			JOptionPane.showMessageDialog(null, "Nenhuma pessoa encontrada");
		}

	}

}
