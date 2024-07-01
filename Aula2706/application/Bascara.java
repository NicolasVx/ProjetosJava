package application;

import java.util.Scanner;


public class Bascara {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, delta;
		double x1, x2;
		System.out.println("Digite o valor de A:");
		a = sc.nextInt();
		System.out.println("Digite o valor de B:");
		b = sc.nextInt();
		System.out.println("Digite o valor de C:");
		c = sc.nextInt();
		//delta = (int) Math.pow(b, 2-4*c); //obs: "int" significa que o resultado vai ser um numero inteiro
		delta = b*b-4*a*c;
		if(delta >= 0) {
			x1 = (-b+Math.sqrt(delta))/(2*a);
			x2 = (-b-Math.sqrt(delta))/(2*a);
			System.out.printf("Delta:%d\n X1:%.2f\n X2:%.2f ", delta, x1, x2);
		}
		else {
			System.out.println("Delta negativo não exite nas raizaes reais!");
		}
		sc.close();

	}

}
