/*
Elaborar um programa que leia uma matriz A
do tipo real de duas dimensões com cinco linhas e cinco colunas.
Apresentar o somatório dos elementos situados nas posições de linha
e coluna ímpares da diagonal principal da referida matriz.
 */

import java.util.Scanner;

class SomarImpares {
    public static void main(String[] args) {

        int soma = 0, lin = 0, col = 0;// soma= soma na diagonal
        final int linha = 5;//Valor constante.
        final int coluna = 5;//Valor constante.
        int matrizA[][] = new int[linha][coluna];
        int impares[][] = new int[linha][coluna];
        Scanner teclado = new Scanner(System.in);

        //matriz A
        System.out.println("==== Matriz A ====");
        for (lin = 0; lin < linha; lin++) {
            for (col = 0; col < coluna; col++) {
                System.out.print("Digite um valor: ");
                matrizA[lin][col] = teclado.nextInt();
            }
        }
        System.out.println("====[ MATRIZ A]====");
        for (lin = 0; lin < linha; lin++) {
            for (col = 0; col < coluna; col++) {
                System.out.print("[" + matrizA[lin][col] + "]");
            }
            System.out.println();
        }
        for (lin = 1; lin < linha; lin++) {
            for (col = 1; col < coluna; col++) {
                //matrizA[lin][col]%2 !=0
                if ((lin % 2) != 0 && (col % 2) != 0) {
                    impares[lin][col] = matrizA[lin][col];
                    if (lin == col) {
                        soma = soma + impares[lin][col];
                    }
                }
            }
        }
        System.out.println("====[ elementos situados nas posições de linha e coluna ímpares  ]====");
        for (lin = 0; lin < linha; lin++) {
            for (col = 0; col < coluna; col++) {
                System.out.print("[" + impares[lin][col] + "]");
            }
            System.out.println();
        }
        System.out.println("o somatório dos elementos na diagonal principal da referida matriz.");
        System.out.print(soma);
    }
}