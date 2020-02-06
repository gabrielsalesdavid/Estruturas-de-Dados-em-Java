package br.com.estruturasdedadosemjava;

import java.util.HashSet;
import java.util.Set;

public class ImplementacaoConjuntoJava {

	public static void main(String[] args) {
		Set<String> nomes = new HashSet<String>();
		
		System.out.println(nomes);
		
		nomes.add("Fabiano");
		nomes.add("Juliano");
		nomes.add("Mario");
		nomes.add("Naldo");
		nomes.add("Zilu");
		nomes.add("Xena");
		System.out.println(nomes);
		
		String nome1 = "Maria";
		String nome2 = "Mariana";
		String nome3 = "Barbara";
		System.out.println(nome1.hashCode());
		System.out.println(nome2.hashCode());
		System.out.println(nome3.hashCode());
		System.out.println("Zilu".hashCode()); 
	}

}
