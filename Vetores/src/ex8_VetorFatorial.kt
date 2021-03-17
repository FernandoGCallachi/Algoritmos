import java.util.*

/*
Elaborar um programa que leia um vetor A de 5 elementos inteiros.
Construir um vetor B do mesmo tipo, e cada elemento do vetor B
deve ser o resultado da fatorial correspondente de cada elemento do vetor A.
Apresentar os vetores A e B.
 */

fun main() {

    println()
    println("Iremos calcular a fatoração dos valores de um vetor")
    println("Apresente os cincos valores do vetor")
    println("----------------------------------------------")

    val tec = Scanner(System.`in`)
    val tamanhoVetor = 5
    var vetorA = IntArray(tamanhoVetor)
    var vetorB = IntArray(tamanhoVetor)

    for (i in vetorA.indices) {
        print("Digite um número: ")
        vetorA[i] = tec.nextInt()
    }

    println("---------------------------------------")
    println("Vetor A:${Arrays.toString(vetorA)}")

    for (i in vetorA.indices) {
        vetorB[i] = vetorA[i]
        while (vetorA[i] > 1) {
            vetorB[i] = vetorB[i] * (vetorA[i] - 1)
            vetorA[i] = vetorA[i] - 1
        }
    }
    println("O vetor B representa as posições do vetor A fatoradas")
    println("Vetor B:${Arrays.toString(vetorB)}")
}