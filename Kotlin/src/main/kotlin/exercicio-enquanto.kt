import java.util.Scanner

fun main() {

    val a = Scanner(System.`in`)

    println("Digite um número: ")
    var num = a.nextInt()

    while(num <= 150){

        println(num)
        num*= 3

    }

}
