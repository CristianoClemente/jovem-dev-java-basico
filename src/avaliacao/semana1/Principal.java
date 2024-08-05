package avaliacao.semana1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import avaliacao.semana1.model.Venda;
import avaliacao.semana1.model.Cliente;
import avaliacao.semana1.model.ClientePremium;
import avaliacao.semana1.model.ItemVenda;
import avaliacao.semana1.model.Produto;




//Ficou Faltando muitas coisas da Lista, tive dificuldades em quebrar os processos e iniciar.
//Faltando fazer o Item 10
//faltando item 11;
//Faltando item 12
//
//E principalmente ficou faltando toda a parte Principal
// Desculpa!!






public class Principal {
	public static void main(String[] args) {

		new Principal();

	}

	public Principal() {

		ArrayList<ItemVenda> itensVenda = new ArrayList<ItemVenda>();

		String nome = JOptionPane.showInputDialog("Nome do Cliente:");
		LocalDate dataNascimento = LocalDate.parse(
				JOptionPane.showInputDialog("Insira da data de Nascimento  (dd/mm/aaaa):"),
				DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		if (nome.equalsIgnoreCase("thiago")) {

			ClientePremium cliente = new ClientePremium(nome, dataNascimento);
			Venda venda = new Venda(cliente, itensVenda, "");

		} else {
			Cliente cliente = new Cliente(nome, dataNascimento);
			Venda venda = new Venda(cliente, itensVenda, "");
		}

		while (true) {

			String nomeProduto = JOptionPane.showInputDialog("Nome do Produto:\n\nPara finalizar digite (Sair):");
			if (nomeProduto.equalsIgnoreCase("sair")) {
				break;
			} else {
				double precoUnitario = Double.parseDouble(JOptionPane.showInputDialog("Preço unitário:"));
				Produto produto = new Produto(nomeProduto, precoUnitario);
				int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade:"));
				ItemVenda itemVenda = new ItemVenda(produto, quantidade);
				itensVenda.add(itemVenda);
			}

		}

		int numPagamento = Integer.parseInt(JOptionPane
				.showInputDialog("FORMA DE PAGAMENTO\n1 - Cartão de Crédito\n2 - Cartão de Débito\n3 - Dinheiro"));

	}

	public double Desconto(Cliente cliente) {

		if (LocalDate.now().isEqual(cliente.getDataNascimento())) {
			return 0.7;
		} else if (LocalDate.now().getYear() - cliente.getDataNascimento().getYear() <= 60) {
			return 0.9;
		} else if (cliente.getNome().equalsIgnoreCase("thiago")) {
			return 0.8;
		} else {
			return 0;

		}

	}

}
