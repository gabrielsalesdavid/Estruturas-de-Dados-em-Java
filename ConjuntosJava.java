package br.com.estruturasdedadosemjava;

import java.util.LinkedList;

public class ConjuntosJava {

	public static void main(String[] args) {
//		LinkedList<String> conjunto = new LinkedList<String>();
//		String nome = "Rebeca";
//		int num = 100;
//		System.out.println(nome.toLowerCase());
//		
//		for(int i = 94; i < 123; i++) {
//			System.out.println((char)i);
//		}
//		
//		if(!conjunto.contains("Rebeca")) {
//			conjunto.add("Rebeca");
//		} if(!conjunto.contains("Gabriel")) {
//			conjunto.add("Gabriel");
//		} if(!conjunto.add("Bryan")) {
//			conjunto.add("Bryan");
//		}
//		
//		System.out.println(conjunto);
//		
//		System.out.println(nome.toLowerCase().charAt(0));
//		
//		System.out.println(num * 0.30);
		
		Conjunto conjunto = new Conjunto();
		System.out.println(conjunto);
		
		conjunto.adiciona("Ana");
		conjunto.adiciona("Ana");
		conjunto.adiciona("Andre");
		conjunto.adiciona("Anderson");
		conjunto.adiciona("Antonio");
		conjunto.adiciona("Amaral");
		conjunto.adiciona("Gabriel");
		conjunto.adiciona("Guilherme");
		conjunto.adiciona("Gustavo");
		conjunto.adiciona("Giovanni");
		conjunto.adiciona("Giovanna");
		conjunto.adiciona("Grayce");
		
		conjunto.remove("Fabiana");
		System.out.println(conjunto);
	}

}
