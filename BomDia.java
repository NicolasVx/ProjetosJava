package application;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class BomDia {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		String nome;
		System.out.println("Digite seu nome: ");
		nome = sc.next();
		System.out.println("Bom dia, " + nome);
		sc.close();*/
		String nome;
		nome = JOptionPane.showInputDialog(null, "Digite seu nome" );
		JOptionPane.showMessageDialog(null, "Bom dia, " + nome + "!");

	}

}
