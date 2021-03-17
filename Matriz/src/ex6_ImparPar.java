/*
Elaborar um programa que leia uma matriz A
do tipo inteiro de cinco colunas e cinco linhas.
Ao final, apresentar o total de elementos pares e ímpares existentes na matriz.
Apresentar também o percentual de elementos pares e ímpares em relação ao total de elementos.
*/

import java.util.Scanner;

class ImparPar {
    public static void main(String[] args) {
        int lin = 0, col = 0;
        final int linha = 5;//Valor constante.
        final int coluna = 5;//Valor constante.
        int matriz[][] = new int[linha][coluna];
        float par = 0, impar = 0, total = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite os valors que irão entrar na matriz");
        for (lin = 0; lin < linha; lin++) {
            for (col = 0; col < coluna; col++) {
                System.out.print("Digite um valor: ");
                matriz[lin][col] = teclado.nextInt();
                if ((matriz[lin][col]) % 2 == 0) {
                    par++;
                } else if ((matriz[lin][col]) % 2 != 0) {
                    impar++;
                }
                total++;
            }
        }
        System.out.println("====[ MATRIZ ]====");
        for (lin = 0; lin < linha; lin++) {
            for (col = 0; col < coluna; col++) {
                System.out.print("[" + matriz[lin][col] + "]");
            }
            System.out.println();
        }
        float porcentPar = (par / 25) * 100;
        float porcentImpar = (impar / 25) * 100;
        System.out.println("Total de elementos:" + total);
        System.out.println("Total de elementos pares:" + par);
        System.out.println("Total de elementos ímpares:" + impar);
        System.out.println("===Porcentagem===");
        System.out.println("Par:" + porcentPar + "%");
        System.out.println("Ímpar:" + porcentImpar + "%");
    }
}