import java.util.*

/*
Elaborar um programa que leia dois valores numéricos inteiros,
os quais devem representar a base e o expoente de uma potência.
Calcular a potência, e exibir a operação calculada, e o resultado obtido.
Math.pow(x, y);
 */

fun main() {
    val tec = Scanner(System.`in`)

    println("CALCULANDO UMA POTENCIA")
    println("Informe dois valores")

    print("Valor da base:")
    val base = tec.nextDouble()
    print("Valor do expoente:")
    val expoente = tec.nextDouble()

    println("O valor da potencia è: ${Math.pow(base, expoente)}")
}