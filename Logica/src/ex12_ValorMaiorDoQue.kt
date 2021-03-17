import java.util.*

/*
Efetuar a leitura de três valores inteiros desconhecidos
representados pelas variáveis A, B e C. Somar os valores
fornecidos e apresentar o resultado somente se for maior ou igual a 100.
 */
fun main() {
    val tec = Scanner(System.`in`)

    println()
    println("Apresente 3 valores numericos inteiros e veja se a soma deles é maior do que 100")

    print("Digite o primeiro número :")
    val primeiroNumero = tec.nextInt()
    print("Digite o segundo número :")
    val segundoNumero = tec.nextInt()
    print("Digite o terceiro número :")
    val terceiroNumero = tec.nextInt()

    val soma = primeiroNumero + segundoNumero + terceiroNumero

    println("A soma dos númeors informados é:" + soma)

    if (soma <= 100) {
        println("O valor não é maior que 100")
    } else {
        println("O valor é maior que 100")
    }
}