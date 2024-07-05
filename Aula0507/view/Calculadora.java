package view;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
	double n1, n2, resultado;
	Scanner sc = new Scanner(System.in);
	n1 = sc.nextDouble();
	n2 = sc.nextDouble();
	resultado = n1 + n2;
	sc.close();
	
	}
}
