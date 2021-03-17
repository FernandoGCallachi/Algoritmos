/*
Elaborar um programa que leia dois vetores A e B, para 5 elementos reais.
Construir uma matriz C de duas dimensões,
sendo a primeira coluna da matriz C formada pelos elementos do vetor A multiplicados por 2
e a segunda coluna formada pelos elementos do vetor B subtraídos por 5. Apresentar a matriz C.
 */

import java.util.Scanner;

class MatrizComposta {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        final int elementos = 5;
        final int linha = elementos;//Valor constante.
        final int coluna = 2;//Valor constante.
        int vertorA[] = new int[elementos];
        int vertorB[] = new int[elementos];
        int matrizC[][] = new int[linha][coluna];

        int lin = 0, col = 0;//variavel auxiliar

        //MATRIZ A
        System.out.println("=== VETOR A ===");
        for (lin = 0; lin < elementos; lin++) {
            System.out.print("Digite um valor: ");
            vertorA[lin] = tec.nextInt();

        }
        //MATRIZ B
        System.out.println("=== VETOR B ===");
        for (lin = 0; lin < elementos; lin++) {
            System.out.print("Digite um valor: ");
            vertorB[lin] = tec.nextInt();
        }
        //MATRIZ C
        for (lin = 0; lin < linha; lin++) {
            for (col = 0; col < coluna; col++) {
                if (col == 0) {
                    matrizC[lin][col] = (vertorA[lin]) * 2;
                } else if (col == 1) {
                    matrizC[lin][col] = (vertorB[lin]) - 5;
                }
            }
        }

        //MOSTRANDO OS AS MATRIZES
        System.out.println("===[ VETOR A ]===");
        for (lin = 0; lin < elementos; lin++) {
            System.out.print("[" + vertorA[lin] + "]");
        }
        System.out.println("");
        System.out.println("===[ VETOR B ]===");
        for (lin = 0; lin < elementos; lin++) {
            System.out.print("[" + vertorB[lin] + "]");
        }
        System.out.println("");
        System.out.println("===[ MATRIZ C ]===");
        System.out.println("===[ (Vetor A *2) (Vetor B -5 ]===");
        for (lin = 0; lin < linha; lin++) {
            for (col = 0; col < coluna; col++) {
                System.out.print("[" + matrizC[lin][col] + "]");
            }
            System.out.println("");
        }
    }
}