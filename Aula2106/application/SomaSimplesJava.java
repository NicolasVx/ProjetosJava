package application;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class SomaSimplesJava {

	public static void main(String[] args) {
		/*double n1, n2, resultado;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		n1 = sc.nextDouble();
		System.out.println("Digite outro número: ");
		n2 = sc.nextDouble();
		resultado = n1 + n2;
		System.out.println("O resultado é: " + resultado);
		sc.close();
		*/
		double n1, n2, resultado;
		n1 = Double.parseDouble(
				JOptionPane.showInputDialog("Digite um número: "));
		n2 = Double.parseDouble(
				JOptionPane.showInputDialog("Digite outro número: "));
		resultado = n1 + n2;
		JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
		
				

	}

}
