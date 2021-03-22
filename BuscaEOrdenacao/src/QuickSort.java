import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args) {

        //cenário de testes
        int ordenado[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int invertido[] = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int aleatorio[] = {3, 6, -2, 1, 5, -4, 8, 7, 9};
        int negativo[] = {-1, -2, -3, -4, -5, -6, -7, -8, -9};
        int repetido[] = {1,1,2,2,5,5,4,4,6,8,10};

        int vetor[] = aleatorio;

        //prnt do vetor antes dele ser ordenado
        System.out.println("Desordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        quicksort(vetor, 0, vetor.length - 1);

        System.out.println("\nOrdenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    public static void quicksort(int[] vetor, int esquerda, int direita) {
        if (esquerda < direita) {// se o elemento menor estiver a esquerda
            int pivo = particao(vetor, esquerda, direita);// achei o pivo, menores para esquerda, maiores para direita
            quicksort(vetor, esquerda, pivo - 1);//ordenar da esquerda até o pivo
            quicksort(vetor, pivo + 1, direita);//ordenar do pivo até a direita
        }
    }

    public static int particao(int[] vetor, int esquerda, int direita) {
        int meio = (int) (esquerda + direita) / 2;
        int pivo = vetor[meio];
        int i = esquerda - 1;
        int j = direita + 1;

        while (true) {
            do {
                i++;
            } while (vetor[i] < pivo);
            do {
                j--;
            } while (vetor[j] > pivo);
            if (i >= j) {
                return j;
            }
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }
    }
}