import java.util.*

/*
Elaborar um programa que leia um vetor A com dez elementos numéricos inteiros.
Apresentar o total de elementos ímpares existente no vetor e também o percentual
do valor total de números ímpares em relação à quantidade total de elementos armazenados.
 */

fun main() {

    println()
    println("O programa concatenara dos arrays")
    println("insira os números do array")
    println("----------------------------------------------")

    val tec = Scanner(System.`in`)
    val tamanhoVetor = 5
    var vetorA = IntArray(tamanhoVetor)
    var aux = 0
    var impar =0

    println("Insira o valor do primeiro array")
    for (i in 1..tamanhoVetor) {
        print("Digite o número: ")
        vetorA[aux] = tec.nextInt()
        if (vetorA[aux]%2!=0){
            impar = impar+1
        }
        aux=aux+1
    }

    val porcentagem= ((impar/tamanhoVetor.toDouble())*100)

    println("Vetor A:"+ Arrays.toString(vetorA))
    println("Quantidade de números impares do array:"+ impar)
    println("A porcentagem de numeros impares é de: $porcentagem%")
}