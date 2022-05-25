package lacosRepeticao

import java.util.Scanner

fun main(){

    val a = Scanner(System.`in`)
    var cont: Int = 228

    do{

        if(cont >= 300 && cont <= 400){

            cont+=2

        }else{

            cont +=5

            println(cont)

        }

    }while (cont < 456)
}