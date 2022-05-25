package projetos

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    println("Digite a base: ")
    val base = scanner.nextFloat()

    println("Digite a altura: ")
    val altura = scanner.nextFloat()

    if(base > 0 && altura > 0) {

        val area = (base * altura) / 2
        println("O valor da area é: $area")

    }else{

        println("Valor não pode ser menor ou igual a 0")

    }


}