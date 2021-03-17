import java.util.*

/*
Elaborar um programa que calcule e apresente o valor
do volume de uma caixa retangular, utilizando a fórmula:
Volume ← Comprimento * Largura * Altur
 */

fun main() {
    val tec = Scanner(System.`in`)

    println("Calculando o volume de uma caixa retangular.")
    println("Informe as seguintes medidas:")

    print("Comprimento:")
    val comprimento = tec.nextFloat()
    print("Largura:")
    val largura = tec.nextFloat()
    print("Altura:")
    val altura = tec.nextFloat()

    val volume = comprimento * largura * altura

    println("O volume da caixa é de:$volume")
}