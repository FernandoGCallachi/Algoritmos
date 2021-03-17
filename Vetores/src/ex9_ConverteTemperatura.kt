import java.util.*

/*
Elaborar um programa que leia 10 elementos (valores reais)
para temperatura em graus Celsius e armazene esses valores em um vetor A.
O programa ao final deve apresentar a menor, a maior e a média das temperaturas lidas.

 */

fun main() {

    println()
    println("Iremos realizar a medição de temperatura em graus Celsius")
    println("Apresente a temperatura dos últimos 10 dias")
    println("----------------------------------------------")

    val tec = Scanner(System.`in`)
    val tamanhoVetor = 3
    val temperatura = IntArray(tamanhoVetor)
    var maior = 0
    var menor = 0
    var soma = 0
    var posicao = 0

    for (i in temperatura.indices) {
        print("Digite um número: ")
        temperatura[i] = tec.nextInt()
        menor = temperatura[posicao]
        //menor
        if (menor > temperatura[i]) {
            menor = temperatura[i]
            posicao = posicao + 1
        }
        //maior
        if (maior < temperatura[i]) {
            maior = temperatura[i]
        }
        //media
        soma = soma + temperatura[i]
    }

    println("----------------------------------------------")
    println("Temperatura dos últimos 10 dias:${Arrays.toString(temperatura)}")
    println("A maior termperatuda foi de:$maior")
    println("A menor termperatuda foi de:$menor")
    println("A média de temperatura durante os dias foi de:${(soma / tamanhoVetor).toDouble()}")

}