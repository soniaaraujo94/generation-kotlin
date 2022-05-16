import java.util.Scanner

fun main () {

    val a = Scanner(System.`in`)

    println("Digite o indice de poluição: ")
    val indice = a.nextFloat()

    if (indice < 0.3) {

        println("Indice Aceitável")

    } else if (indice >= 0.3 && indice < 0.4) {

        println("Grupo 1: Suspenda as atividades!")

    } else if (indice >= 0.4 && indice < 0.5) {

        println("Grupo 1 e 2: Suspendam as atividades!")

    } else {

        println("Todos os grupos suspendam as atividades!")

    }

}