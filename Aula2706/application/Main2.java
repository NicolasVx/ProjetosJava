package application;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		int idade;
		double peso;
		String endereco;
		
		System.out.println("Digite o nome:");
		nome = sc.nextLine();
		System.out.println("Digite a idade:");
		idade = sc.nextInt();
		System.out.println("Digite o peso:");
		peso = sc.nextDouble();
		sc.nextLine();
		System.out.print("Informe o endereço:");
		endereco = sc.next();
		System.out.printf("Nome:%s \nIdade:%d \nPeso:%.2f\n Endereço:%s ", nome, idade, peso, endereco);
		sc.close();
		

	}

}
