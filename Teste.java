package br.com.estruturasdedadosemjava;

public class Teste {

	public static void main(String[] args) {
		
		Vetor lista = new Vetor();
		for(int i = 0; i < 300; i++) {
			Aluno a = new Aluno("Gabriel " + i);
			lista.adiciona(a);
		}
		System.out.println(lista.tamanho());
		System.out.println(lista);
	}

}
