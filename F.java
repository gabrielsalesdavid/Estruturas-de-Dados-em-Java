package br.com.estruturasdedadosemjava;

public class F {

	public static void main(String[] args) {
		Fila fila = new Fila();
		
		System.out.println(fila);
		
		fila.adiciona("Gabriel");
		fila.adiciona("Bryan");
		fila.adiciona("Rebeca");
		
		System.out.println(fila);
		
		String ret = fila.remove();
		System.out.println(ret);
		System.out.println(fila);
		
		fila.remove();
		fila.remove();
		fila.remove();
		
		System.out.println(fila.vazia());
	}

}
