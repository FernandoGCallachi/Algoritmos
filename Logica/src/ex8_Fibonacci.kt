import java.util.*

/*
A sequência de Fibonacci é formada pelos números: 0, 1, 2, 3, 5, 8, 13, 21, …
Sendo o primeiro número da série 0, o segundo 1, e os subsequentes a soma dos
dois anteriores. Escrever um programa que calcule e imprima o 13º número da série.
 */
/* val posicao7 = 13
   val posicao8 = 21
   val posicao9 = posicao7 + posicao8
   val posicao10 = posicao8 + posicao9
   val posicao11 = posicao10 + posicao9
   val posicao12 = posicao10 + posicao11
   val posicao13 = posicao12 + posicao11*/
fun main() {
    val tec = Scanner(System.`in`)

    println("A sequência de Fibonacci é formada pelos números: 0, 1, 2, 3, 5, 8, 13, 21, … ")
    print("Digite o numeor referente a posição que deseja encontrar:")

    var posicao = tec.nextInt()
    var i = 0
    var aux =0
    var fibonacci = arrayOf(0, 1, 2, 3, 5, 8, 13, 21)
    val posicao7 = 6
    val posicao8 = 7
    var resultado = IntArray(posicao)
    resultado[0] = fibonacci[posicao7]+fibonacci[posicao8]
    resultado[1] = fibonacci[posicao8]+resultado[0]
    resultado[2] = resultado[0] + resultado[1]

    if (posicao>=9) {
        do {
            resultado[aux + 3] = resultado[aux + 0] + resultado[aux + 1]
            
            aux++
            i++

        } while (i < posicao)

    }else{
        println("O valor que está nessa posição é: ${fibonacci[posicao]}")
    }


}