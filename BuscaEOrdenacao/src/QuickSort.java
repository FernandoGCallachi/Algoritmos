public class QuickSort {
    public static void main(String[] args) {
        //cases
        int ordenado[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int invertido[] = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int aleatorio[] = {3, 6, -2, 1, 5, -4, 9, 5, 7, 8};
        int negativo[] = {-1, -2, -3, -4, -5, -6, -7, -8, -9};
        int repetido[] = {1, 1, 2, 2, 5, 5, 4, 4, 10, 6, 8, 10};

        int vetor[] = aleatorio;

        System.out.println("Desordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\n-------------------------------");

        quicksort(vetor, 0, vetor.length - 1);

        System.out.println("\n-------------------------------");

        System.out.println("Ordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    private static void quicksort(int[] vetor, int esquerdo, int direito) {
        if (esquerdo < direito) {
            int j = particion(vetor, esquerdo, direito);
            quicksort(vetor, esquerdo, j - 1);
            quicksort(vetor, j + 1, direito);
        }
    }

    private static int particion(int[] vetor, int esquerdo, int direito) {
        int i = esquerdo + 1;
        int j = direito;
        int pivo = vetor[esquerdo];

        //teste
        System.out.println("\nteste");
        for (int q = 0; q < vetor.length; q++) {
            System.out.print(vetor[q] + " ");
        }
        System.out.print("\nPIVO: ");
        System.out.print(pivo);
        System.out.print("\nI: ");
        System.out.print(vetor[i]);
        System.out.print("\nJ: ");
        System.out.print(vetor[j]);
        System.out.println();

        while (i <= j) {
            if (vetor[i] <= pivo) {
                i++;
            } else if (vetor[j] > pivo) {
                j--;
            } else if (i <= j) {
                trocar(vetor, i, j);
                i++;
                j--;
            }
        }
        trocar(vetor, esquerdo, j); // colocar o elemento que está no inicio do vetor e colocar na posição correta
        return j;
    }

    private static void trocar(int[] vetor, int i, int j) {
        int aux = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = aux;
    }
}