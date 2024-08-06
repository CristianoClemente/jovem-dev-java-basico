package aula6;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Exemplo {
	public static void main(String[] args) {
		new Exemplo();
	}

	public Exemplo() {

//		for (FormaPagamentoEnum f : FormaPagamentoEnum.values()) {
//			System.out.println(f.getDescricao());
//
//		}
//
//		System.out.println(FormaPagamentoEnum.valueOf("PIX").getCodigo());
//
//		FormaPagamentoEnum f = FormaPagamentoEnum.CARTAO_CREDITO;
//		switch (f) {
//		case CARTAO_CREDITO:
//
//			break;
//
//		default:
//			System.out.println(f.getCodigo() + "Defaut");
//			break;
//		}
//
//		// Pode utilizar == porque apontam para o mesmo local na memoria
//		if (f.equals(FormaPagamentoEnum.DINHEIRO)) {
//			System.out.println("Aplica desconto");
//		}

		// STRINGBUILDER

		String nome = "João";

//		StringBuilder sb = new StringBuilder();
//		sb.append("O nome dele é ").append(nome);
//
//		System.out.println(sb);
//
//		// STRING FORMAT
//
//		System.out.println(String.format("O nome é %s", nome));
//
//		// BIG DECIMAL
//		// NÃO CONFIAR EM PONTO FLUTUANTE
//
//		double d = 0.1 + 0.2;
//		System.out.println(d);
//
//		BigDecimal b1 = BigDecimal.valueOf(0.1);
//		BigDecimal b2 = BigDecimal.valueOf(0.2);
//		System.out.println(b1.add(b2));
//
//		System.out.println(Math.pow(100, 200));
//
//		/// ATENÇÃO
//		BigDecimal b3 = BigDecimal.valueOf(2);
//		BigDecimal b4 = BigDecimal.valueOf(3);
//		//System.out.println(b3.divide(b4));
//		//// cuidado com dizima
//		System.out.println(b3.divide(b4, 2, RoundingMode.FLOOR));
//		System.out.println(b3.divide(b4, 2, RoundingMode.HALF_EVEN));// MAIS UTILIZADO
//		System.out.println(b3.divide(b4, 2, RoundingMode.CEILING));
//		System.out.println(b3.divide(b4, 2, RoundingMode.HALF_DOWN));
//		System.out.println(b3.divide(b4, 2, RoundingMode.UP));

	
	
	//OBJECTS
		
		
		String s1 = "abc";
		String s2 = "abc";
		
		//Mais eficiente
		System.out.println(Objects.equals(s1, s2));

		//isNULL
		
		
		
		//nonN
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	}

}
