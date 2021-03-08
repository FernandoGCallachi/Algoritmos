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

fun main(){


    var tec = Scanner(System.`in`)
    println("Iremos calcular o MDC de dois números inteiros")

    print("Digite o primeiro número inteiro:")//x
    var primeiroNumero = tec.nextInt()
    print("Digite o segundo número inteiro:")//y
    var segundoNumero = tec.nextInt()

    var MDCXY = arrayOf(primeiroNumero,segundoNumero)//MDC XY

    while (segundoNumero!= 0){
        val resto = primeiroNumero%segundoNumero
        primeiroNumero=segundoNumero
        segundoNumero=resto
    }
    println("["+MDCXY.get(0)+"]["+MDCXY.get(1)+"] MDC = " + primeiroNumero)
}