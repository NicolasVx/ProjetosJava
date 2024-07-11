package application;

import java.util.Scanner;

import entities.Produto;

public class TesteProduto {
	private static Produto[] produtos = new Produto[1000];
	private static int i = 0;
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		String op;
		do {
			System.out.println("Menu Principal \n\n1 - Cadastrar Produto\n2 - Listar\n3 - Buscar\n4 - Sair \n\nQual a sua opção? ");
			op = sc.next();
			if(op.equals("1")) cadastrar();
			if(op.equals("2")) listar();
			
		}while(!op.equals("4"));
	}
	private static void cadastrar() {
		Produto p = new Produto();
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o código do produto: ");
		p.setId(sc.nextInt());
		System.out.println("Digite o nome do produto: ");
		sc.nextLine();
		p.setNome(sc.nextLine());
		System.out.println("Digite a quantidade do produto: ");
		p.setQuantidade(sc.nextInt());
		System.out.println("Digite o preço do produto: ");
		p.setPreco(sc.nextDouble());
		produtos[i] = new Produto();
		produtos[i] = p;
		i++;
	}
	public static void listar() {
		for (int x = 0; x < i; x++) {
			System.out.println(produtos[x].toString());
		}
	}
}
