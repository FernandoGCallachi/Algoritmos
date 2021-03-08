import java.util.*

/*
Elaborar um programa que leia 3 valores inteiros, armazene-os em um vetor,
e percorra o vetor calculando o fatorial de cada valor lido. No final,
deverá apresentar o somatórios dos valores calculados.
 */

fun main(){

    println("Digite três numeros inteiros")

    val tec = Scanner(System.`in`)

    print("Digite o primeiro número inteiro:")
    var primeiroNumero = tec.nextInt()
    print("Digite o segundo número inteiro:")
    var segundoNumero = tec.nextInt()
    print("Digite o terceiro numero inteiro:")
    var terceiroNumero = tec.nextInt()

    val vetor = arrayOf(primeiroNumero,segundoNumero,terceiroNumero)

    //calculo do fatorial da três posições do vetor

    var index0= vetor.get(0)// index posição 0
    var index1= vetor.get(1)// index posição 1
    var index2= vetor.get(2)// index posição 2

    while (primeiroNumero>1){
        index0= index0 * (primeiroNumero-1)
        primeiroNumero=primeiroNumero-1
    }
    while (segundoNumero>1){
        index1= index1 * (segundoNumero-1)
        segundoNumero=segundoNumero-1
    }
    while (terceiroNumero>1){
        index2= index2 * (terceiroNumero-1)
        terceiroNumero=terceiroNumero-1
    }

    //Resultado das operações
    println("A fatoração do primeiro número é:"+index0)
    println("A fatoração do segundo número é:"+index1)
    println("A fatoração do terceiro número é:"+index2)

    println("---------------------------------------")
    print("A somatoria dos valores da fatoração é:"+(index0+index1+index2))
}