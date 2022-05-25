import java.lang.Math.sqrt
import kotlin.math.pow

fun main(){

    print("Digite um número: ")
    val num = readln().toDouble()

    if (num % 2 == 0.0){

        print("O $num é par e sua raiz quadrada é ${
            "%.2f".format(sqrt(num))}")

    }else{

        print("O $num é ímpar e seu número elevado ao quadrado é ${
            num.pow(2)}")

    }

}