package br.com.estruturasdedadosemjava;

import java.util.LinkedList;
import java.util.List;

public class Fila {
	private List<String> nomes = new LinkedList<String>();
	
	public void adiciona(String nome) {
		this.nomes.add(nome);
	}
	
	public String remove() {
		try {
			return nomes.remove(0);
		} catch(IndexOutOfBoundsException e) {
			System.out.println("Est� vazia!");
			return "Vazia";
		}
		
	}
	
	public boolean vazia() {
	return this.nomes.size() == 0;	
	}
	
	@Override
	public String toString() {
		return this.nomes.toString();
	}
}
