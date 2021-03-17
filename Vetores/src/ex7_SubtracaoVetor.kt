import java.util.*

/*
Elaborar um programa que leia dois vetores (denominados A e B)
com 5 elementos reais. Construir um vetor denominado C,
onde cada elemento deverá corresponder a subtração do elemento
correspondente do vetor A com um elemento correspondente do
vetor B. Ao final, apresentar os elementos do vetor C.

 */
fun main() {
    println()
    println("Iremos calcular a subtração entre dois vetores")
    println("Apresente os cincos valores do vetor")
    println("----------------------------------------------")

    val tec = Scanner(System.`in`)
    val tamanhoVetor = 5
    var vetorA = IntArray(tamanhoVetor)
    var vetorB = IntArray(tamanhoVetor)
    var vetorC = IntArray(tamanhoVetor)

    println("Vetor A")
    for (i in vetorA.indices) {
        print("Digite um número: ")
        vetorA[i] = tec.nextInt()
    }
    println("----------------------------------------------")
    println("Vetor B")

    for (i in vetorB.indices) {
        print("Digite um número: ")
        vetorB[i] = tec.nextInt()
    }
    for (i in vetorC.indices) {
        vetorC[i] = vetorA[i] - vetorB[i]
    }

    println("Vetor A:${Arrays.toString(vetorA)}")
    println("Vetor B:${Arrays.toString(vetorB)}")
    println("Vetor C: A subtração de cada posição do vetor é:${Arrays.toString(vetorC)}")
}