import java.util.*

/*
Elaborar um programa que leia 10 elementos inteiros e armazene em um vetor A.
Apresentar os valores do vetor lido de maneira inversa, e identificar qual é o menor valor armazenado
*/

fun main() {

    println()
    println("Irei apresentar o valor do vetor em ordem inversa e seu menor valor")
    println("insira os números do array")
    println("-------------------------------------------------------------------")

    val tec = Scanner(System.`in`)
    val tamanhoVetor = 3
    var vetorA = IntArray(tamanhoVetor)
    var aux = 0
    var menor = 0
    var posicao =0

    for (i in 1..tamanhoVetor) {
        print("Digite um número: ")
        vetorA[aux] = tec.nextInt()
        menor = vetorA[posicao]
        //menor
        if (menor > vetorA[aux]) {
            menor = vetorA[aux]
            println("entrou no if")
            posicao = posicao +1
        }

      aux=aux+1
    }

    println("--------------------------------")
    println("Vetor A:"+Arrays.toString(vetorA))
    print("Vetor A invertido :")

    //invertendo o array
    print("[")
    var aux2 = aux -1
    while (aux2>=0) {
        print(" "+vetorA[aux2]+" ")
        aux2=aux2-1
    }
    println("]")

    //menor valor
    println("O menor valor alocado foi:$menor")

}