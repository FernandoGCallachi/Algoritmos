import java.awt.desktop.PrintFilesEvent
import java.util.*

/*
A sequência de Fibonacci é formada pelos números: 0, 1, 2, 3, 5, 8, 13, 21, …
Sendo o primeiro número da série 0, o segundo 1, e os subsequentes a soma dos
dois anteriores. Escrever um programa que calcule e imprima o 13º número da série.

   val posicao7 = 13
   val posicao8 = 21
   val posicao9 = posicao7 + posicao8
   val posicao10 = posicao8 + posicao9
   val posicao11 = posicao10 + posicao9
   val posicao12 = posicao10 + posicao11
   val posicao13 = posicao12 + posicao11

   */


fun main() {


}



/*
    var tec = Scanner(System.`in`)

    var tamanhoVetor = 8
    var vetorA = IntArray(tamanhoVetor)
    var posicao=0


    println("Coloque a sequencia fibonacci")
    for (i in vetorA.indices) {

        vetorA[i] =
    }
    println("---------------------------------------")
    println("Sequencia fibonacci:${vetorA.contentToString()}")

    print("Digite qual posição deseja encontrar: ")
    posicao = tec.nextInt()
    var fibonacci = IntArray(posicao)
    fibonacci = ( 3, 8, 5, 13, 21)


    var resultado = IntArray(posicao)
    resultado[0] = fibonacci[6] + fibonacci[7] //34
    resultado[1] = fibonacci[7] + resultado[0]//55
    var aux =0


    for(i in fibonacci.indices){

        fibona
    }

}

  //  println("A sequência de Fibonacci é formada pelos números: ${fibonacci.contentToString()}")
   // print("Digite o numeor referente a posição que deseja encontrar:")
    //var posicao = tec.nextInt()







/*
//0, 1, 2,
var fibonacci = IntArray(posicao)
fibonacci = ( 3, 8, 5, 13, 21)


var resultado = IntArray(posicao)
resultado[0] = fibonacci[6] + fibonacci[7] //34
resultado[1] = fibonacci[7] + resultado[0]//55
var aux =0


for(i in fibonacci.indices){

    fibona
}





/*
if (posicao == 9) {
    println("O valor correspondente a posição é: ${resultado[0]}")
} else if (posicao == 10) {
    println("O valor correspondente a posição é: ${resultado[1]}")
}else if (posicao <= 8) {
    println(fibonacci[posicao])
}else if (posicao > 10){

    while (resultado[aux] < posicao) {
        resultado[aux] = resultado[aux + 1 ] + resultado[aux -1]
        aux+=1
        println("resultado - ${resultado[aux]}")
    }
}
*/
}



/*
var posicao = tec.nextInt()
posicao--
var resultado = IntArray(posicao)//9
var i = 0
var aux = 2
var aux1 = 1
var aux2 = 0
resultado[0] = fibonacci[6] + fibonacci[7] //34
resultado[1] = fibonacci[7] + resultado[0]//55


if (posicao < 9) {
    println(fibonacci[posicao])
} else if (posicao >= 9) {

    //resultado[aux] = resultado[aux1] + resultado[aux2]//89

    while (i<posicao) {
        resultado[aux] = resultado[aux1] + resultado[aux2]
        aux+=1
        aux1+=1
        aux2+=1

        println("resultado - ${resultado[aux]}")
    }
*/