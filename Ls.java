package br.com.estruturasdedadosemjava;

import java.util.LinkedList;
import java.util.List;

public class Ls {

	public static void main(String[] args) {
		List<String> lista = new LinkedList<String>();
		
		System.out.println(lista.size());
		
		lista.add("Bryan");
		lista.add("Rebeca");
		lista.add("Gabriel");
		
		System.out.println(lista);
	}

}
