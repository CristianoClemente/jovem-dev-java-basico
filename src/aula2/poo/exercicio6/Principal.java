package aula2.poo.exercicio6;

import java.time.LocalDate;
import java.time.Period;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Cristiano", LocalDate.of(1992, 11, 28));
		PessoaFisica pessoaFisica = new PessoaFisica("Ana", LocalDate.of(1993, 8, 25), "084.935.989-92");

		if (pessoa1.getDataNascimento().isBefore(pessoaFisica.getDataNascimento())) {
			JOptionPane.showMessageDialog(null,
					pessoaFisica.getNome() + " com "
							+ Period.between(pessoaFisica.getDataNascimento(), LocalDate.now()).getYears()
							+ " anos è o mais Novo");
		} else {
			JOptionPane.showMessageDialog(null, pessoa1.getNome() + " com "
					+ Period.between(pessoa1.getDataNascimento(), LocalDate.now()).getYears() + " anos è o mais Novo");
		}
	}
}