import java.util.Scanner;

public class BuscaBinaria {
    public static void main(String[] args) {
        int vetor[] = new int[10];

        //incremtando o vetor com valores com on numeros do indice +1 (para testes)
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 1;
        }
        //pegando o valor que será procurado
        System.out.println("Qual número vc busca?");
        Scanner tec = new Scanner(System.in);
        int buscado = tec.nextInt();

        //contador para saber quantas vezes foi feito o processo até chegar no resultado
        int contador = 0;

        //varial eue mostra se o numero foi encontrado ou não
        boolean ok = false;

        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;

        while (inicio <= fim) {
            meio = (int) ((inicio + fim) / 2);
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
        System.out.println("Quantidade de testes: " + contador);
    }
}
