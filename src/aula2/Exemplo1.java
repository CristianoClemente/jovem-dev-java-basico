package aula2;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.DateFormatter;

public class Exemplo1 {

	public static void main(String[] args) {

//		// CASTING
//
//		double d1 = 5;
//		// 5.0
//
//		System.out.println(d1);
//
//		int i1 = (int) d1;
//		// 5
//		System.out.println(i1);
//
//	
//	
//	
//	//BOXING
//		
//		
//		List<Integer> lista = new ArrayList<>();
//		
//
//		String s1 = "abc";
//		String s2 = new String("ABC");
//
//		System.out.println(s1.equalsIgnoreCase(s2));
//		System.out.println(s1.contains("ab"));
//		

		LocalDate id = LocalDate.now();
		LocalDate ld1 = LocalDate.of(1992, 11, 28);
		LocalDate ld2 = LocalDate.parse("1992-11-28");
		LocalDate ld3 = LocalDate.parse("28/11/1992");// erro ele so reconhece no padrão de ciima
		LocalDate ld4 = LocalDate.parse("28/11/1992", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(ld3.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println(id.plusDays(300));// adiciona dias,meses e anos a frente
		System.out.println(id.minusDays(300));// diminui dias,meses e anos

		System.out.println(id);

	}

}
