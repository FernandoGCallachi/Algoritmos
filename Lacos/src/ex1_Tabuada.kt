import java.util.*

/*
Elaborar um programa que mostre os resultados
da tabuada, de 0 até 10, de um número qualquer.

 */
fun main(){

    val tec = Scanner(System.`in`)
    var i =0
    print("Digite um número para ver a sua tabuada: ")
    val numero= tec.nextInt()
    while (i<11 && i >=0){
        print(""+numero+"x"+i+"="+(i*numero)+" | ")
        i= i+1
    }
}