import java.util.*

/*
Elaborar um programa que leia 3 valores inteiros, armazene-os em um vetor,
e percorra o vetor calculando o fatorial de cada valor lido. No final,
deverá apresentar o somatórios dos valores calculados.
 */

fun main() {
    val tec = Scanner(System.`in`)
    val tamanhoVetor = 3
    var vetor = IntArray(tamanhoVetor)
    var index = IntArray(vetor.size)
    var soma = 0
    var numero = 1

    println("Digite três numeros inteiros")

    for (i in vetor.indices) {
        print("Digite o $numero° número:")
        vetor[i] = tec.nextInt()
        numero++
        index[i] = vetor[i]
    }
    for (i in vetor.indices) {
        while (vetor[i] > 1) {
            index[i] = index[i] * ((vetor[i]) - 1)
            vetor[i] = (vetor[i]) - 1
        }
    }
    for (i in index.indices) {
        soma += index[i]
    }

    println("---------------------------------------")
    println("A fatoração dos números em ordem é: ${index.contentToString()}")
    print("A somatoria dos valores da fatoração é: $soma")
}
