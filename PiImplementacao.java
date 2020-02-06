package br.com.estruturasdedadosemjava;

import java.util.Stack;

public class PiImplementacao {

	public static void main(String[] args) {
		Stack<String> nomes = new Stack<String>();
		
		nomes.push("Bryan");
		nomes.push("Rebeca");
		
		System.out.println(nomes);
		
		String ret = nomes.peek();
		System.out.println(ret);
		System.out.println(nomes);
		
		String  r1= nomes.pop();
		System.out.println(r1);
		System.out.println(nomes);
		
	}

}
