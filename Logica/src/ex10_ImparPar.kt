import java.util.*
/*
Ler um valor numérico inteiro e apresente uma
mensagem informando se o valor fornecido é par ou ímpar.
 */
fun main() {
    val tec = Scanner(System.`in`)

    println()
    println("informe um valor numericos inteiros e veja se é par ou impar")
    println()

    print("Digite o número :")
    val numero = tec.nextInt()

    //Condição do número
    if (numero%2 == 0){
        println("O número "+numero+" é par")
    }else if (numero%2 != 0){
        println("O número "+numero+" é impar")
    }
}