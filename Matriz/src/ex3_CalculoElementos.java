/*
Elaborar um programa que leia uma matriz A 5x5.
Construir uma matriz B 5x5 em que cada elemento seja o dobro correspondente à matriz A,
com exceção dos elementos da diagonal principal,
os quais devem ser o triplo de cada elemento correspondente da matriz A.
Apresentar a matriz B.
 */

import java.util.Scanner;

class CalculoElementos {
    public static void main(String[] args) {
        int lin = 0, col = 0;// soma= soma na diagonal
        final int linha = 3;//Valor constante.
        final int coluna = 3;//Valor constante.
        int matrizA[][] = new int[linha][coluna];
        int matrizB[][] = new int[linha][coluna];
        Scanner teclado = new Scanner(System.in);

        //matriz A
        System.out.println("==== Matriz A ====");
        for (lin = 0; lin < linha; lin++) {
            for (col = 0; col < coluna; col++) {
                System.out.print("Digite um valor: ");
                matrizA[lin][col] = teclado.nextInt();
            }
        }
        //matriz B
        for (lin = 0; lin < linha; lin++) {
            for (col = 0; col < coluna; col++) {
                if (lin == col) {
                    matrizB[lin][col] = (matrizA[lin][col]) * 3;
                } else {
                    matrizB[lin][col] = (matrizA[lin][col]) * 2;
                }
            }
        }
        System.out.println("====[ MATRIZ A]====");
        for (lin = 0; lin < linha; lin++) {
            for (col = 0; col < coluna; col++) {
                System.out.print("[" + matrizA[lin][col] + "]");
            }
            System.out.println();
        }
        System.out.println("====[ MATRIZ B]====");
        for (lin = 0; lin < linha; lin++) {
            for (col = 0; col < coluna; col++) {
                System.out.print("[" + matrizB[lin][col] + "]");
            }
            System.out.println();
        }
    }
}