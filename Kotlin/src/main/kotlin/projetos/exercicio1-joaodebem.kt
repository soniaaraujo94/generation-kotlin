package projetos

import java.util.Scanner

fun main(){

    val a = Scanner(System.`in`)

    println("Digite o peso dos tomates: ")
    val peso = a.nextFloat()

    if(peso > 50){

        val excesso = peso - 50.0

        val multa = excesso * 4.0

        println("Peso do KG: $peso \n" +
                "Excesso: $excesso \n" +
                "Multa: $multa \n")

    }else{

        println("Peso do KG: $peso")

    }

}