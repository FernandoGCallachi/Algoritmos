import java.util.*

/*
Construir um programa que leia um valor numérico inteiro
e apresente como resultado armazenado os seus valores sucessor e antecessor.
 */

fun main(){
    val tec = Scanner(System.`in`)

    println("MOSTRANDO O SUCESSOR E O ANTECESSOR DO NÚMERO DIGITADO")
    println("------------------------------------------------------")

    print("Digite um número:")
    val numero=tec.nextInt()

    val antecessor= numero+1
    val sucessor= numero-1
    println("O antecessor é:"+antecessor)
    println("O sucessor é:"+sucessor)
}