public class BubbleSort {
    public static void main(String[] args) {
        int aux;
        boolean controle;
        //cenário de testes
        int ordenado[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int invertido[] = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int aleatorio[] = {3, 6, -2, 1, 5, -4, 8, 7, 9};
        int negativo[] = {-1, -2, -3, -4, -5, -6, -7, -8, -9};


        int vetor[] = aleatorio;

        //print do vetor antes do algoritmo aplicado
        System.out.println("====Vetor====");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        //bubbleSort
        for (int i = 0; i < vetor.length; i++) {
            controle = true;
            for (int j = 0; j < (vetor.length - 1); j++) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                    controle = false;
                }
            }
            if (controle == true) {
                break;
            }
        }

        //print do vetor depois do algoritmo aplicado
        System.out.println("\n====Pós BubbleSort====");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}