/*
Elaborar um programa que apresente os resultados
das potências do valor de base 3, elevando a um
expoente que varie do valor 0 até o valor 15.
faça (apresente os resutados das potencias)
*/
fun main(){
    var expoente = 0
    val base= 3
    do {
        println("O valor da potencia de base "+base+" e expoente "+expoente+" è: "
                +Math.pow(base.toDouble(),expoente.toDouble()))
        expoente=expoente+1
    }while (expoente>=0 && expoente<=15)
}