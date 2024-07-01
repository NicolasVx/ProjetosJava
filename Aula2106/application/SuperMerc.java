package application;

import java.util.Scanner;

public class SuperMerc {

	public static void main(String[] args) {
		double precoUnitario, troco, dinheiro;
		int quantidade;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o preço unitário: ");
		precoUnitario = sc.nextDouble();
		System.out.println("Digite a qantidade comprada: ");
		quantidade = sc.nextInt();
		System.out.println("Digite o dinheiro recebido: ");
		dinheiro = sc.nextDouble();
		troco = dinheiro - (precoUnitario*quantidade);
		System.out.println("Troco =" + troco);
		
		
	}

}
