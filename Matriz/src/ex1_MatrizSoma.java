/*
Elaborar um programa que leia duas matrizes A e B,
cada uma de duas dimensões com três linhas e três colunas para valores inteiros.
Construir uma matriz C de mesma dimensão,
que seja formada da soma dos elementos da matriz A com os elementos da matriz B.
Apresentar os elementos da matriz C.
*/

import java.util.Scanner;

class MatrizSoma {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        final int linha = 3;
        final int coluna = 3;
        int matrizA[][] = new int[linha][coluna];
        int matrizB[][] = new int[linha][coluna];
        int matrizC[][] = new int[linha][coluna];

        int lin = 0, col = 0;//variavel auxiliar

        //MATRIZ A
        System.out.println("===MATRIZ A ===");
        for (lin = 0; lin < linha; lin++) {
            for (col = 0; col < coluna; col++) {
                System.out.print("Digite um valor: ");
                matrizA[lin][col] = tec.nextInt();
            }
        }
        //MATRIZ B
        System.out.println("===MATRIZ B ===");
        for (lin = 0; lin < linha; lin++) {
            for (col = 0; col < coluna; col++) {
                System.out.print("Digite um valor: ");
                matrizB[lin][col] = tec.nextInt();
            }
        }
        //MATRIZ C
        for (lin = 0; lin < linha; lin++) {
            for (col = 0; col < coluna; col++) {
                matrizC[lin][col] = matrizA[lin][col] + matrizB[lin][col];
            }
        }

        //MOSTRANDO OS AS MATRIZES
        System.out.println("===[ MATRIZ A ]===");
        for (lin = 0; lin < linha; lin++) {
            for (col = 0; col < coluna; col++) {
                System.out.print("[" + matrizA[lin][col] + "]");
            }
            System.out.println("");
        }
        System.out.println("===[ MATRIZ B ]===");
        for (lin = 0; lin < linha; lin++) {
            for (col = 0; col < coluna; col++) {
                System.out.print("[" + matrizB[lin][col] + "]");
            }
            System.out.println("");
        }
        System.out.println("===[ SOMA DAS DUAS MATRIZES ]===");
        for (lin = 0; lin < linha; lin++) {
            for (col = 0; col < coluna; col++) {
                System.out.print("[" + matrizC[lin][col] + "]");
            }
            System.out.println("");
        }
    }
}