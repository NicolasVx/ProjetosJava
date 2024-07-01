package test;

import java.util.Scanner;

import entities.Liquidificador;

public class TesteLiquidificador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Liquidificador liqui = new Liquidificador();
		String op;
		do {
			op = "Estado: "+(liqui.isEstado()?"Ligado ":"Desligado ");
			op += "\nVelocidade: "+liqui.getVelocidade();
			op += "\n1 - Liga/Desliga\n2 - Aumetar velocidade\n3 - Reduzir velocidade\n4 - Sair\n\nQual sua opção: ";
			System.out.println(op);
			op = sc.next();
			switch(op) {
			case "1":liqui.setEstado();break;
			case "2":liqui.velocidadeMais();break;
			case "3":liqui.velocidadeMenos();break;
			}
		}while(!op.equals("4"));
		sc.close();

	}

}
