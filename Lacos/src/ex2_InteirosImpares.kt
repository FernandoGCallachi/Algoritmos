import java.util.*

/*
Elaborar um programa que apresente todos os valores numéricos
inteiros ímpares situados na faixa de 0 a 20.
 */

fun main() {

    for (i in 0..20) {
        if (i % 2 != 0) {
            println("valores impares encontrados entre 0 e 20:$i")
        }
    }
}