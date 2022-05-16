import java.util.Scanner

fun main () {

    val a = Scanner(System.`in`)

    println("Digite um número: ")
    val num = a.nextInt()

    if (num >= 100) {

        println(num)

    }else{

        println(0)

    }
}