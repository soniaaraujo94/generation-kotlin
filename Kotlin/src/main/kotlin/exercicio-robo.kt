import java.util.Scanner

fun main() {

    println("Data - Olá, qual o seu nome? ")
    val nome = readLine()

    println("Data - E qual a cidade que você mora? ")
    val cidade = readLine()

            val scanner = Scanner(System.`in`)

            println("Data - E quantos anos você tem? ")
            val idade = scanner.nextInt()

            println("Então você se chama $nome tem $idade anos e mora na cidade de $cidade\n" + "Estãos certas essas informações?")

}
