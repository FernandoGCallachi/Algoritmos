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
    var aux = 0

    var vetorB = IntArray(tamanhoVetor)
    var aux2 = 0

    println("Vetor A")
    for (i in 1..tamanhoVetor) {
        print("Digite um número: ")
        vetorA[aux] = tec.nextInt()

        aux=aux+1
    }
    println("----------------------------------------------")
    println("Vetor B")
    for (i in 1..tamanhoVetor) {
        print("Digite um número: ")
        vetorB[aux2] = tec.nextInt()

        aux2=aux2+1
    }

    val vetorC = arrayOf((vetorA[0]-vetorB[0]),
                        (vetorA[1]-vetorB[1]),
                        (vetorA[2]-vetorB[2]),
                        (vetorA[3]-vetorB[3]),
                        (vetorA[4]-vetorB[4]))

    println("Vetor A:"+Arrays.toString(vetorA))
    println("Vetor B:"+Arrays.toString(vetorB))
    println("Vetor C: A subtração de cada posição do vetor é:"+Arrays.toString(vetorC))
}