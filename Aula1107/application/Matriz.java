package application;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] matriz = new String[3][3];

        for (int lin = 0; lin < 3; lin++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("Digite o elemento da linha %d coluna %d: ", (lin + 1), (col + 1));
                matriz[lin][col] = sc.next();
            }
        }

        System.out.println("Matriz informada:");
        for (int lin = 0; lin < 3; lin++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(matriz[lin][col] + " ");
            }
            System.out.println();
        }

        System.out.print("Digite o nome a ser pesquisado: ");
        String nomeBuscado = sc.next();
        boolean encontrado = false;
        for (int lin = 0; lin < 3; lin++) {
            for (int col = 0; col < 3; col++) {
                if (matriz[lin][col].equals(nomeBuscado)) {
                    System.out.println("Nome cadastrado: " + nomeBuscado);
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("Nome não cadastrado.");
        }

        sc.close();
    }
}
