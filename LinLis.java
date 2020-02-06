package br.com.estruturasdedadosemjava;

//import br.com.modificadoresdeacesso.Cliente;

public class LinLis {
	public static void main(String [] args) {
		Lista lista = new Lista();
		
		System.out.println(lista);
		lista.adiciona("Rebeca");
		System.out.println(lista);
		lista.adiciona("Bryan");
		System.out.println(lista);
		lista.adiciona("Gabriel");
		System.out.println(lista);
		lista.removeDoComeco();
		System.out.println(lista);
	}
}
