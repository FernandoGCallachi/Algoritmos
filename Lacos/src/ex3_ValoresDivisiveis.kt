/*
Construir um programa que apresente todos os
valores numéricos divisíveis por 4 e menores que 200.
 */

fun main() {
    var numero = 1
    do {
        if ((numero % 4 == 0)) {
            println(numero)
            numero += 1
        }
        numero++
    } while (numero <= 200)

}