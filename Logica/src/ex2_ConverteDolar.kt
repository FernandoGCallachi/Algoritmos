import java.util.*

/*
Elaborar um programa que apresente o valor da conversão em dólar (US$)
de um valor lido em real (R$). O programa deve solicitar o valor da cotação do dólar
e também a quantidade de de reais disponível com o usuário e
armazenar em variáveis o valor da conversão antes da apresentação.
 */

fun main(){
    val tec = Scanner(System.`in`)

    println()
    println("CONVERSOR (US$) PARA (R$)")
    println("--------------------------")

    print("Digite o valor da cotação atual:")
    val cotacao=tec.nextFloat()

    print("Digite a quantidade de reias:")
    val reais=tec.nextFloat()

    val valorAtual= reais/cotacao
    println("você possui "+valorAtual+" dólares.")
}