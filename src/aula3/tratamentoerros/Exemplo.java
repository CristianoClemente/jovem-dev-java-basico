package aula3.tratamentoerros;

import javax.swing.JOptionPane;

import aula2.poo.desafio.Principal;

public class Exemplo {

	public static void main(String[] args) {
		new Exemplo();
	}

	public Exemplo() {

//		
//		try {
//			Double d = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
//			System.out.println(d);
//		} catch (NumberFormatException e) {
//			System.out.println("Valor digitado esta errado");
//			e.printStackTrace();// 
//		}catch(NullPointerException e) {
//			System.out.println("Terminando o Programa");
//		}
//		
//		System.out.println("Terminando o Programa");

//		try {
//			Double d = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
//			System.out.println(d);
//		} catch (NumberFormatException) {
//			System.out.println("Valor digitado esta errado");
//			e.printStackTrace();// 
//		
//		
//		System.out.println("Terminando o Programa");

//		try {
//			Double d = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
//			System.out.println(d);
//		} catch (RuntimeException e) {
//			System.out.println("Valor digitado esta errado");
//			e.printStackTrace();// 
//		
//		
//		System.out.println("Terminando o Programa");
//		
//		try {
//			Double d = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
//			System.out.println(d);
//		} catch (Exception e) {
//			System.out.println("Valor digitado esta errado");
//			e.printStackTrace();// 
//		
//		
//		System.out.println("Terminando o Programa");
//		
//	
//
//		try {
//			Double d = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
//			System.out.println(d);
//		} catch (RuntimeException e) {
//			System.out.println("Valor digitado esta errado");
//			e.printStackTrace();//
//
//		} finally {
//			System.out.println("Terminando o Programa");
//		}
		
		
		
		try {
			Double d = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota"));
			if (d<0) {
				throw new IllegalArgumentException("Nota menor que zero");
			}
			
			System.out.println(d);
		} catch (NotaMaiorQue10Exception e) {
			throw  new NotaMaiorQue10Exception("Não pode ser maior que 10");
		
			

		}
		System.out.println("Continuando o programa");
		
		
		
		
		
		

	}
}
