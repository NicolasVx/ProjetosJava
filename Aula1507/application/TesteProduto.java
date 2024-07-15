//Atualização da Aula1107
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
			System.out.println(
					"Menu Principal \n\n1 - Cadastrar Produto\n2 - Listar\n3 - Buscar\n4 - Alterar\n5 - Sair \n\nQual a sua opção?");
			op = sc.next();
			if (op.equals("1"))
				cadastrar();
			if (op.equals("2"))
				listar();
			if (op.equals("3"))
				buscar();
			if (op.equals("4"))
				alterar();
		} while (!op.equals("5"));
	}

	private static void alterar() {
		Scanner sc = new Scanner(System.in);
		String nomeAlterar;
		String novoNome;
		int novaQuantidade;
		double novoPreco;
		int opcao;
		boolean encontrado = false;
		System.out.print("Digite o nome do produto a alterar: ");
		nomeAlterar = sc.nextLine();

		for (int i = 0; i < produtos.length; i++) {
			if (!(produtos[i] == null))
				if (produtos[i].getNome().equals(nomeAlterar)) {
					encontrado = true;
					System.out.println("Produto encontrado: ");
					System.out.println(produtos[i]);
					System.out.println("\nQual dado você quer alterar? \n\n1 - Nome\n2 - Quantidade\n3 - Preço\n\nEscolha uma opção: ");
					opcao = sc.nextInt();

					if (opcao == 1) {
						System.out.print("Digite o novo nome do produto: ");
						sc.nextLine();
						produtos[i].setNome(sc.nextLine());
					} else if (opcao == 2) {
						System.out.print("Digite a nova quantidade do produto: ");
						produtos[i].setQuantidade(sc.nextInt());
					} else if (opcao == 3) {
						System.out.print("Digite o novo preco do produto: ");
						produtos[i].setPreco(sc.nextDouble());
					}
				}
		}
		if (!encontrado) {
			System.out.println("Produto não encontrado para alteração.");
		}

	}

	private static void buscar() {
		boolean achou = false;
		String nomePesquisar;

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o nome do produto a pesquisar: ");
		nomePesquisar = sc.nextLine();

		for (Produto p : produtos) {
			if (!(p == null))
				if (p.getNome().equalsIgnoreCase(nomePesquisar)) {
					achou = true;
					System.out.printf("Código: %d\nNome: %s\nQuantidade: %d\nPreço: %.2f\n\n", p.getId(), p.getNome(),
							p.getQuantidade(), p.getPreco());
				}
		}

		if (!achou) {
			System.out.println("Produto não cadastrado.");
		}
	}

	private static void cadastrar() {
		Produto p = new Produto();
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o código do produto:");
		p.setId(sc.nextInt());
		System.out.print("Digite o nome do produto:");
		sc.nextLine();
		p.setNome(sc.nextLine());
		System.out.print("Digite a quantidade do produto:");
		p.setQuantidade(sc.nextInt());
		System.out.print("Digite o preco do produto:");
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
