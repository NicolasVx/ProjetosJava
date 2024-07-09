package application;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		String[] nomes;
		int quantidade;
		Scanner sc =  new Scanner(System.in);
		System.out.print("Quantos nomes deseja digitar?: ");
		quantidade = sc.nextInt();
		nomes = new String[quantidade];
		for(int i = 0; i < quantidade; i++) {
			System.out.printf("Digite o %dº nome: ",(i+1));
			nomes[i] = sc.next();	
		}
		for(int i = 0; i < quantidade; i++) {
		System.out.println(nomes[i]);
		}
		boolean encontrou = false;
		System.out.println("Digite o nome a pesquisar: ");
		String nome = sc.next();
		for(int i = 0; i < quantidade; i++) {
			if (nomes[i].equals(nome)) {
				encontrou = true;
				System.out.println("Nome cadastrado: "+nome);
			}
		}
		if (!encontrou) {
			System.out.println("Não cadastrado.");
		}
		
		for(String x : nomes) {
			System.out.println(x);//mostra todos os itens objetos caso não soubesse quantas entidades tivessem
		}
		
		
		
		
		
		sc.close();
	}

}
