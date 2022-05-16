import java.util.Scanner

fun main() {

        val a = Scanner(System.`in`)

        println("******Calculadora de IMC********")

        println("\nInforme o seu peso: ")
        val peso = a.nextFloat()

        println("\nInforme a sua altura: ")
        val altura = a.nextFloat()

        val imc = peso / (altura * altura)

        println("Seu IMC é: $imc")

        if(imc < 18.5){

                println("Você está abaixo do peso")

        }else if (imc >= 18.5 && imc < 25) {

                println("Seu peso está normal")

        }else if (imc >= 25 && imc < 30) {

                println("Você está com Sobrepeso")

        }else if (imc >= 30 && imc < 40) {

                println("Você está com Obesidade")

        }else if (imc >= 40) {

                println("Você está com Obesidade Grave")

        }


}
