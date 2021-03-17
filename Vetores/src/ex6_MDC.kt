import java.util.*

/*
Elaborar um programa para calcular o máximo divisor comum
de dois números inteiros positivos, MDC(x, y),
usando o algoritmo de Euclides.
Este algoritmo é baseado no fato de que se o resto da divisão de x por y
representado por r, //r=x/y for igual a zero, y é o MDC.
Se o resto r for diferente de zero, o MDC de x e y é igual ao MDC de y e r.
O processo se repete até que o valor do resto da divisão seja zero.
 */

fun main() {
    val tec = Scanner(System.`in`)
    val tamanhoVetor = 2
    var vetorA = IntArray(tamanhoVetor)
    var numero = 1
    var n1 = 0
    var n2 = 0
    println("Iremos calcular o MDC de dois números inteiros")

    for (i in vetorA.indices) {
        print("Digite o $numero° número inteiro:")//x
        vetorA[i] = tec.nextInt()
        numero++
        n1 = vetorA[0]
        n2 = vetorA[1]
        while (vetorA[1] != 0) {
            val resto = vetorA[0] % vetorA[1]
            vetorA[0] = vetorA[1]
            vetorA[1] = resto
        }
    }
    println("[$n1][$n2] MDC = ${vetorA[0]}")
}