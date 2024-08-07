package aula6.outros;

import java.text.Format;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

public class Exercicio4 {
	public static void main(String[] args) {
		new Exercicio4();
	}

	public Exercicio4() {

		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		do {
			Pessoa p = new Pessoa();
			for (int i = 0; i < 2; i++) {
				p.setNome(JOptionPane.showInputDialog("Informme o nome:"));
				p.setTelefone(JOptionPane.showInputDialog("Informme o telefone:"));
				p.setDataNascimento(LocalDate.parse(JOptionPane.showInputDialog("Informme o telefone:"),
						DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			}

		} while (pessoas.size() < 3);

	}

}
