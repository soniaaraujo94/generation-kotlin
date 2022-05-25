package projetos

import java.util.Scanner

fun main() {

    val a = Scanner(System.`in`)

    println("Digite um número e descubra se ele é par ou impar: ")
    val num = a.nextInt()

    if (num % 2 == 0){

        println("O número $num é par")

    }else{

        print("O número $num é impar")

    }

    if(num >= 0){

        println(" e positivo")

    }else{

        print(" e negativo")

    }
}