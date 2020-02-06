package br.com.estruturasdedadosemjava;

public class ListaDuplamenteLigada {

	public static void main(String[] args) {
Lista lista = new Lista();
		
		System.out.println(lista);
		lista.adiciona("Rebeca");
		System.out.println(lista);
		
		lista.remove(0);
		System.out.println(lista.contem("Rebeca"));
	}

}
