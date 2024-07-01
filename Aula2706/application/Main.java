package application;

public class Main {

	public static void main(String[] args) {
		double salario = 0.0;
		String nome = "Paulo";
		int idade = 7;
		double altura = 1.5;
		double peso = 35.0;
		
		salario = 5000.00;
		System.out.println("Salário: "+salario);
		System.out.println("Nicolas");
		System.out.println("Gomes");
		System.out.print("da");
		System.out.print("Silva/n");
		System.out.println("Nome:"+nome+" "+"Idade:"+idade+" "+"Altura:"+altura+" "+"Peso:"+peso);
		System.out.printf("Nome: %s Idade: %d Altura: %.2f Peso: %.2f",nome, idade, altura, peso);
	}
}
