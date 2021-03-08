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

    print("Digite o primeiro número:")
    var numero1A = tec.nextInt()
    print("Digite o segundo número inteiro:")
    var numero2A = tec.nextInt()
    print("Digite o terceiro numero inteiro:")
    var numero3A = tec.nextInt()
    print("Digite o quarto numero inteiro:")
    var numero4A = tec.nextInt()
    print("Digite o quinto numero inteiro:")
    var numero5A = tec.nextInt()

    val vetorA = arrayOf(numero1A, numero2A, numero3A, numero4A, numero5A)

    //calculo do fatorial das posições do vetor
    var index0= vetorA.get(0)// index posição 0
    var index1= vetorA.get(1)// index posição 1
    var index2= vetorA.get(2)// index posição 2
    var index3= vetorA.get(3)// index posição 3
    var index4= vetorA.get(4)// index posição 4

    while (numero1A>1){
        index0= index0 * (numero1A-1)
        numero1A=numero1A-1
    }
    while (numero2A>1){
        index1= index1 * (numero2A-1)
        numero2A=numero2A-1
    }
    while (numero3A>1){
        index2= index2 * (numero3A-1)
        numero3A=numero3A-1
    }
    while (numero4A>1){
        index3= index3 * (numero4A-1)
        numero4A=numero4A-1
    }
    while (numero5A>1){
        index4= index4 * (numero5A-1)
        numero5A=numero5A-1
    }

    //Alocando os resultados no vetor B
    val vetorB = arrayOf(index0,index1,index2,index3,index4)
    println("---------------------------------------")

    println("Vetor A:"+Arrays.toString(vetorA))
    println("O vetor B representa as posições do vetor A fatoradas")
    println("Vetor B:"+Arrays.toString(vetorB))


}