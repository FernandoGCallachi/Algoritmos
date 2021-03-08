/*
A sequência de Fibonacci é formada pelos números: 0, 1, 2, 3, 5, 8, 13, 21, …
Sendo o primeiro número da série 0, o segundo 1, e os subsequentes a soma dos
dois anteriores. Escrever um programa que calcule e imprima o 13º número da série.
 */

fun main(){

    println("A sequência de Fibonacci é formada pelos números: 0, 1, 2, 3, 5, 8, 13, 21, … ")

    val posicao7 = 13
    val posicao8 = 21
    val posicao9 = posicao7+posicao8
    val posicao10 = posicao8+posicao9
    val posicao11 = posicao10+posicao9
    val posicao12 = posicao10+posicao11
    val posicao13 = posicao12+posicao11

    println("A 13° posição é:"+posicao13)
}