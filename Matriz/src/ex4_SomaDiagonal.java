/*
Elaborar um programa que leia uma matriz A do tipo real
de duas dimensões com cinco linhas e cinco colunas.
Apresentar o somatório dos elementos situados na diagonal principal.
*/

import java.util.Scanner;

class SomaDiagonal {
    public static void main(String[] args) {
        int soma = 0, lin = 0, col = 0;// soma= soma na diagonal
        final int linha = 5;//Valor constante.
        final int coluna = 5;//Valor constante.
        int matriz[][] = new int[linha][coluna];
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite os valors que irão entrar na matriz");
        for (lin = 0; lin < linha; lin++) {
            for (col = 0; col < coluna; col++) {
                System.out.print("Digite um valor: ");
                matriz[lin][col] = teclado.nextInt();
                if (lin == col) {
                    soma += matriz[lin][col];
                }
            }
        }
        System.out.println("====[ MATRIZ ]====");
        for (lin = 0; lin < linha; lin++) {
            for (col = 0; col < coluna; col++) {
                System.out.print("[" + matriz[lin][col] + "]");
            }
            System.out.println();
        }
        System.out.println("O valor da soma na diagonal principal é: " + soma);
    }
}