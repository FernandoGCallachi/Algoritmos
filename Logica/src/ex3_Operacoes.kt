import java.util.*

/*
Elaborar um programa que leia dois valores números reais
representados pelas variáveis A e B. Calcular, armazenar e apresentar
os resultados das quatro operações aritméticas básicas entre eles.
 */

fun main(){
    val tec = Scanner(System.`in`)

    println("Representando as operações básicas entre dois valores")
    println("Informe dois valores")

    print("Primeiro valor:")
    val A=tec.nextInt()
    print("Segundo valor:")
    val B =tec.nextInt()

    val soma= A+B
    val subitracao= A-B
    val divisao= A/B
    val multiplicacao= A*B

    println("O valor da soma entre eles: "+soma)
    println("O valor da subitração entre eles: "+subitracao)
    println("O valor da divisãp entre eles: "+divisao)
    println("O valor da multiplicação entre eles: "+multiplicacao)
}