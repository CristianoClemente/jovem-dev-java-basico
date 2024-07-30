package aula2.poo.exercicio5;

import java.time.LocalDate;
import java.time.Period;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Cristiano", LocalDate.of(1992, 11, 28));
		Pessoa p2 = new Pessoa("Ana", LocalDate.of(1993, 8, 25));

		if (p1.getDataNascimento().isAfter(p2.getDataNascimento())) {
			JOptionPane.showMessageDialog(null, p2.getNome() + " com "
					+ Period.between(p2.getDataNascimento(), LocalDate.now()).getYears() + " anos è o mais velho");
		} else {
			JOptionPane.showMessageDialog(null, p1.getNome() + " com "
					+ Period.between(p1.getDataNascimento(), LocalDate.now()).getYears() + " anos è o mais velho");
		}

	}
}
