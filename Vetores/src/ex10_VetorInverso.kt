/*
Elaborar um programa que leia 10 elementos inteiros e armazene em um vetor A.
Apresentar os valores do vetor lido de maneira inversa, e identificar qual é o menor valor armazenado
*/
import java.util.*

fun main() {

    println()
    println("Irei apresentar o valor do vetor em ordem inversa e seu menor valor")
    println("insira os números do array")
    println("-------------------------------------------------------------------")

    val tec = Scanner(System.`in`)
    val tamanhoVetor = 3
    var vetorA = IntArray(tamanhoVetor)
    var menor = 0
    var posicao = 0
    var contador =0

    for (i in vetorA.indices) {
        print("Digite um número: ")
        vetorA[i] = tec.nextInt()
        contador++
        menor = vetorA[posicao]
        //menor
        if (menor > vetorA[i]) {
            menor = vetorA[i]
            posicao++
        }
    }
    println("Vetor A:" + Arrays.toString(vetorA))
    print("O vator invertido é: ")
    var aux2 = contador -1
    print("[")
    while (aux2>=0) {
        print(vetorA[aux2])
        aux2=aux2-1
    }
    println("]")
    println("O menor valor alocado foi:$menor")




}