import java.util.*

/*
Escrever um programa que receba três números inteiros como
entrada e imprima, como saída, os números em ordem crescente.
*/

fun main(){
    val tec = Scanner(System.`in`)

    println("Colocando em ordem crescente os números indicados")
    //condições possíveis (123, 132, 213, 231. 312. 321)

    print("Digite o primeiro número:")//n1
    val primeiroNumero=tec.nextInt()
    print("Digite o segundo número:")//n2
    val segundoNumero=tec.nextInt()
    print("Digite o terceiro número:")//n3
    val terceiroNumero=tec.nextInt()

    if (((primeiroNumero<=segundoNumero)&&(segundoNumero<=terceiroNumero))&&((terceiroNumero>=primeiroNumero)&&(terceiroNumero>=segundoNumero))){ //menor, medio, maior 1
        println("Os números em ordem crescente é:" +primeiroNumero+"-"+segundoNumero+"-"+terceiroNumero)

    }else if(((primeiroNumero<=segundoNumero)&&(primeiroNumero<=terceiroNumero))&&((segundoNumero>=primeiroNumero)&&(segundoNumero>=terceiroNumero))){//menor, maior, medio 2
        println("Os números em ordem crescente é:" +primeiroNumero+"-"+terceiroNumero+"-"+segundoNumero)

    }else if(((segundoNumero<=primeiroNumero)&&(segundoNumero<=terceiroNumero))&&((terceiroNumero>=primeiroNumero)&&(terceiroNumero>=segundoNumero))){//medio, menor, maior 3
        println("Os números em ordem crescente é:" +segundoNumero+"-"+primeiroNumero+"-"+terceiroNumero)

    }else if(((terceiroNumero<=segundoNumero)&&(terceiroNumero<=primeiroNumero))&&((segundoNumero>=terceiroNumero)&&(segundoNumero>=primeiroNumero))){//medio, maior, menor 4
        println("Os números em ordem crescente é:" +terceiroNumero+"-"+primeiroNumero+"-"+segundoNumero)

    }else if(((segundoNumero<=primeiroNumero)&&(segundoNumero<=terceiroNumero))&&((primeiroNumero>=terceiroNumero)&&(primeiroNumero>=segundoNumero))){//maior, menor, medio 5
        println("Os números em ordem crescente é:" +segundoNumero+"-"+terceiroNumero+"-"+primeiroNumero)

    }else if(((terceiroNumero<=segundoNumero)&&(terceiroNumero<=terceiroNumero))&&((primeiroNumero>=terceiroNumero)&&(primeiroNumero>=segundoNumero))){//maior, medio, menor 6
        println("Os números em ordem crescente é:" +terceiroNumero+"-"+segundoNumero+"-"+primeiroNumero)
    }
}