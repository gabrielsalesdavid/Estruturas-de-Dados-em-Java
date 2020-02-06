package br.com.estruturasdedadosemjava;

public class ArmazenamentoSequencial {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Rebeca Vitoria");
		Aluno a2 = new Aluno("Bryan Gabriel");
		
		Vetor lista = new Vetor();
		
		System.out.println("Total de alunos: " + lista.tamanho());
		
		lista.adiciona(a1);
		System.out.println("Total de alunos: " + lista.tamanho());
		lista.adiciona(a2);
		System.out.println("Total de alunos: " + lista.tamanho());
		
		System.out.println(lista);
		
		System.out.println(lista.contem(a1));
		
		try {
			System.out.println(lista.pega(110));
		} catch(IllegalArgumentException e) {
			System.out.println("O aluno da posição 110 não existe! ");
			
			System.out.println(e.getMessage());
		}
		
		Aluno a3 = new Aluno("Gabriel Sales");
		try {
			lista.adiciona(110, a3);
		} catch(IllegalArgumentException e) {
			System.out.println("A posição 110 invalida! ");
		}
		lista.remove(0);
		System.out.println(lista);
		
	}

}
