import java.util.*

/*
Escrever um programa que leia o nome de um aluno e as notas
de três provas, P1, P2 e P3. O aluno é aprovado se possuir
média aritmética (MD) acima de 7, estará em recuperação entre 5 e 7,
e será reprovado abaixo de 5. Imprimir todos os dados capturados, e a situação do aluno.
 */

fun main(){
    val tec = Scanner(System.`in`)
    val numeroProvas=3
    println("CALCULANDO A MÉDIA")
    println("--------------------------")

    print("Para começar digite o nome do aluno:")
    val nome=tec.nextLine()

    print("Digite nota prova P1:")
    val nota1=tec.nextFloat()
    print("Digite nota prova P2:")
    val nota2=tec.nextFloat()
    print("Digite nota prova P3:")
    val nota3=tec.nextFloat()

    val mediaAluno= ((nota1+nota2+nota3)/numeroProvas)

    println("A média do aluno é:"+mediaAluno)

    if (mediaAluno>=7){
        println("Status do aluno "+nome+ ": Aprovado")
    }else if (mediaAluno<7 && mediaAluno>5){
        println("Status do aluno "+nome+ ": Recuperação")
    }else{
        println("Status do aluno "+nome+ ": Reprovado")
    }
}