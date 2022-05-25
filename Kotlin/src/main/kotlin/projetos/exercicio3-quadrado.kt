package projetos

import java.util.Scanner

fun main() {

    val a = Scanner(System.`in`)

    println("Digite o 1º número: ")
    var num1 = a.nextInt()

    println("Digite o 2º número: ")
    var num2 = a.nextInt()

    println("Digite o 3º número: ")
    var num3 = a.nextInt()

    println("Digite o 4º número: ")
    var num4 = a.nextInt()

    num1 *= num1
    num2 *= num2
    num3 *= num3
    num4 *= num4

    if(num3 >= 1000){

        println("Valor do 3º número ao quadrado é: $num3")

    }else{

        println("Resultado: $num1")
        println("Resultado: $num2")
        println("Resultado: $num3")
        println("Resultado: $num4")

    }
}