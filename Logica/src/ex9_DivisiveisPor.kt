import java.util.*

/*
Efetuar a leitura de quatro valores numéricos inteiros,
representados pelas variáveis A, B, C e D.
Apresentar apenas os valores que sejam divisíveis por e 2 e 3.
 */

fun main() {
    val tec = Scanner(System.`in`)

    println("Apresente 4 valores numericos inteiros e veja quias são divisíveis por 2 e 3")
    println()

    print("Digite o primeiro número :")
    val A = tec.nextInt()
    print("Digite o segundo número :")
    val B = tec.nextInt()
    print("Digite o terceiro número :")
    val C = tec.nextInt()
    print("Digite o quarto número :")
    val D = tec.nextInt()

    //Condição primeiro número
    if (A % 2 == 0) {
        println("O número " + A + " é divisivel por 2")
    } else if (A % 3 == 0) {
        println("O número " + A + " é divisivel por 3")
    }
    //Condição segundo número
    if (B % 2 == 0) {
        println("O número " + B + " é divisivel por 2")
    } else if (B % 3 == 0) {
        println("O número " + B + " é divisivel por 3")
    }
    //Condição terceiro número
    if (C % 2 == 0) {
        println("O número " + C + " é divisivel por 2")
    } else if (C % 3 == 0) {
        println("O número " + C + " é divisivel por 3")
    }
    //Condição quarto número
    if (D % 2 == 0) {
        println("O número " + D + " é divisivel por 2")
    } else if (D % 3 == 0) {
        println("O número " + D + " é divisivel por 3")
    }
}