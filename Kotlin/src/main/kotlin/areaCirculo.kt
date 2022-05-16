fun main(){

    println("Calculadora de area do círculo")

    print("Digite valor o diâmetro: ")
    var dia = readLine()!!.toDouble()

    var r = dia / 2

    var p = 2 * 3.14 * r
    var a = 3.14 * (r * r)

    println("Perimêtro do circulo: $p")
    println("Area do circulo: $a")

}