import java.util.*

/*
Efetuar a leitura de um valor numérico inteiro que esteja na faixa de 1 até 9.
O programa deverá apresentar uma mensagem "O valor está na faixa permitida",
caso o valor informado esteja na faixa. Se o valor estiver fora da faixa permitida,
deverá apresentar a mensagem "O valor está fora da faixa permitida".
 */

fun main() {
    val tec = Scanner(System.`in`)

    print("informe um valor numericos inteiros que esteja entre 1 e 9: ")
    val numero= tec.nextInt()

    //Condição do número
    if (numero<=9 && numero>=1){
        println("O número informado está dentro da faixa permitida")
    }else {
        println("O valor está fora da faixa permitida")
    }
}