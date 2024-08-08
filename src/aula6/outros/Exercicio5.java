package aula6.outros;

import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JOptionPane;

public class Exercicio5 {
	public static void main(String[] args) {
		new Exercicio5();
	}

	public Exercicio5() {

		BigDecimal circuferencia = new BigDecimal(JOptionPane.showInputDialog("Insira um valor inteiro:"));
		BigDecimal dois = new BigDecimal("2");
		BigDecimal pi = new BigDecimal(Math.PI);

		BigDecimal raio = circuferencia.divide(dois.multiply(pi), 4, RoundingMode.HALF_EVEN);

		JOptionPane.showMessageDialog(null, "O raio do circulo é " + raio);

	}

}
