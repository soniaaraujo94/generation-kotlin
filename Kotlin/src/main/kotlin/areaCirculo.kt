import kotlin.math.pow

fun main(){

    println("Calculadora de àrea do círculo")

    print("Digite o valor do diâmetro: ")
    val dia = readLine()!!.toDouble()

    val r = dia / 2
    val pi = 3.14

    val p = 2 * pi * r
    val a = pi * r.pow(2)

    println("Perimêtro do circulo: $p}")
    println("Area do circulo: $a")

}