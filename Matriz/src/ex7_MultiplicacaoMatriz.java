/*Elaborar um programa que leia uma matriz A e B
do tipo inteiro de cinco colunas e cinco linhas.
A matriz A deve ser formada por valores divisíveis por 3 e 4,
enquanto a matriz B deve ser formada por valores divisíveis por 5 e 6.
As entradas do usuário deverão ser validadas pelo programa.
Construir e apresentar uma matriz C de mesma dimensão
que contenha o valor da multiplicação dos elementos da matriz A com os elementos correspondentes da matriz B.
Apresentar as três matrizes.
 */

import java.util.Scanner;

class MultiplicacaoMatriz {
    public static void main(String[] args) {
        int lin = 0, col = 0;
        final int linha = 2;//Valor constante.
        final int coluna = 2;//Valor constante.
        int matrizA[][] = new int[linha][coluna];
        int matrizB[][] = new int[linha][coluna];
        Scanner tec = new Scanner(System.in);

        System.out.println();
        System.out.println("====[ VALORES MATRIZ A]====");
        System.out.println("APENAS VALORES DIVISIVEIS POR 3 E 4");

        for (lin = 0; lin < linha; lin++) {
            for (col = 0; col < coluna; col++) {
                System.out.print("Digite um valor: ");
                int numero = tec.nextInt();
                if ((numero % 4) == 0 && (numero % 3) == 0) {
                    matrizA[lin][col] = numero;
                } else {
                    System.out.println("Digite APENAS VALORES DIVISIVEIS POR 3 E 4");
                }
            }
        }
        System.out.println();
        System.out.println("====[ VALORES MATRIZ B]====");
        System.out.println();
        System.out.println("APENAS VALORES DIVISIVEIS POR 5 E 6");
        for (lin = 0; lin < linha; lin++) {
            for (col = 0; col < coluna; col++) {
                System.out.print("Digite um valor: ");
                int numero = tec.nextInt();
                if ((numero % 5) == 0 && (numero % 6) == 0) {
                    matrizB[lin][col] = numero;
                } else {
                    System.out.println("Digite APENAS VALORES DIVISIVEIS POR 5 E 6");
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