package aula2.poo.exercicio7;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {

		NotaFiscal notaFiscal1 = new NotaFiscal("Emitent 1");
		NotaFiscal notaFiscal2 = new NotaFiscal("Emitent 2");

		notaFiscal1.calculaValor(100, 20);
		notaFiscal2.calculaValor(150, 50);

		JOptionPane.showMessageDialog(null, notaFiscal1.getEmitente() + " valor R$ " + notaFiscal1.getValor() + "\n"
				+ notaFiscal2.getEmitente() + " valor R$ " + notaFiscal2.getValor());
	}
}