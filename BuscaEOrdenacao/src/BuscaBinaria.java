import java.util.Scanner;

public class BuscaBinaria {
    public static void main(String[] args) {
        int vetor[] = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 1;
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\nQual número vc busca?");
        Scanner tec = new Scanner(System.in);
        int buscado = tec.nextInt();

        int contador = 0;

        boolean ok = false;

        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio <= fim) {
            int meio = (int) ((inicio + fim) / 2);
            contador++;
            if (vetor[meio] == buscado) {
                ok = true;
                break;
            } else if (vetor[meio] < buscado) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        if (ok == true) {
            System.out.println("Número encontrado");
        } else {
            System.out.println("Número não encontrado");
        }
        System.out.println("Quantidade de passos: " + contador);
    }
}