package br.com.estruturasdedadosemjava;

public class P {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		System.out.println(pilha);
		
		pilha.insere("Rebeca");
		pilha.insere("Bryan");
		pilha.insere("Gabriel");
		System.out.println(pilha);
		
		String ret = pilha.pegaTopo();
		System.out.println(ret);
		
		String r1 = pilha.remove();
		System.out.println(r1);
		System.out.println(pilha);
		
		System.out.println(pilha.vazia());
	}

}
