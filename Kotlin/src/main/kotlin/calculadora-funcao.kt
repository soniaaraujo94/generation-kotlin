fun main() {

    println("Insira um valor: ")
    val num1 = readln().toInt()

    println("Insira um valor: ")
    val num2 = readln().toInt()

    println(
        "Calcular:" +
                "(+) adição " +
                "(-) multiplicação " +
                "(/) divisão " +
                "(*) multiplicação "
    )
    var conta = readln()

    if (conta == "+") {

        println("$num1 + $num2 = ${adi(num1, num2)} ")

    }else if (conta == "-") {

        println("$num1 - $num2 = ${sub(num1, num2)}")

    }else if (conta == "*") {

        println("$num1 * $num2 = ${mult(num1, num2)}")

    }else if (conta == "/") {

        println("$num1 / $num2 = ${divi(num1, num2)}")

    }else{

        println("Carácter inválido - Tente novamente")

    }
}

fun adi (n1: Int, n2: Int): Int{
    return n1 + n2
}

fun sub (n1: Int, n2: Int): Int{
    return n1 - n2
}

fun mult (n1: Int, n2: Int): Int{
    return n1 * n2
}

fun divi (n1: Int, n2: Int): Int{
    return n1 / n2
}