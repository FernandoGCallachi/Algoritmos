import java.util.*
import kotlin.collections.ArrayList

/*
Elaborar um programa que leia dois vetores A e B com 5 elementos.
O vetor A deve aceitar apenas a entrada de valores divisíveis por 2 ou 3,
enquanto o vetor B deve aceitar apenas a entrada de valores que não sejam múltiplos de 5.
A entrada dos vetores deve ser validada pelo programa, e não pelo usuário.
Construir um vetor C que seja o resultado da junção dos vetores A e B,
de forma que contenha 10 elementos. Apresentar os elementos do vetor C.
 */

fun main() {

    println()
    println("O programa concatenará dois arrays")
    println("insira os números do array")
    println("---------------------------------")

    val tec = Scanner(System.`in`)

    //Variaveis A
    var tamanhoVetorA = 2
    var vetorA = IntArray(tamanhoVetorA)
    var condicaoA = 0
    var aux =0


    //Variaveis B
    var tamanhoVetorB = 2
    var vetorB = IntArray(tamanhoVetorB)
    var condicaoB = 0
    var auxB =0


    //VETOR A (suas condições)
    println("Insira o valor do primeiro array")
    println("Aceita apenas a entrada de valores divisíveis por 2 ou 3")
    for (i in aux..tamanhoVetorA) {
        while (tamanhoVetorA > 0) {
            print("Digite o número: ")
            condicaoA = tec.nextInt()

            if (condicaoA % 2 == 0 || condicaoA % 3 == 0) {
                vetorA[aux] = condicaoA
                tamanhoVetorA -= 1
                aux++
            } else {
                println("Informe apenas valores divisíveis por 2 ou 3...")
            }
        }
    }

    println("--------------------------------")

    //VETOR B (suas condições)
    println("Insira o valor do segundo array")
    println("Aceita apenas a entrada de valores que não sejam múltiplos de 5")
    for (i in auxB..tamanhoVetorA) {
        while (tamanhoVetorB > 0) {
            print("Digite o número: ")
            condicaoB = tec.nextInt()

            if ((condicaoB * 5) % 2 == 0) {
                vetorB[auxB] = condicaoB
                tamanhoVetorB -= 1
                auxB++
            } else {
                println("Informe apenas valores multiplos de 5...")
            }
        }
    }

    //Vetor C == vetor A + vetor B
    var conteudoC = (Arrays.toString(vetorA + vetorB))
    var vetorC = arrayListOf(conteudoC)

    println("Vetor A:${Arrays.toString(vetorA)}")
    println("Vetor B:${Arrays.toString(vetorB)}")
    println("Vetor C:$vetorC")
}





