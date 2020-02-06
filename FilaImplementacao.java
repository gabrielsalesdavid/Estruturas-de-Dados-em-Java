package br.com.estruturasdedadosemjava;

import java.util.LinkedList;
import java.util.Queue;

public class FilaImplementacao {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		System.out.println(fila);
		
		fila.add("Gabriel");
		fila.add("Bryan");
		fila.add("Rebeca");
		
		System.out.println(fila);
		
		String ret = fila.poll();
		System.out.println(ret);
		System.out.println(fila);
	}

}
