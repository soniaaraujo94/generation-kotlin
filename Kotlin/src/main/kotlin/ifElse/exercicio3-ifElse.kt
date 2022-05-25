fun main(){

    println("Digite sua idade: ")
    val idade = readLine()!!.toInt()

    when(idade){

        in 10 .. 14 -> print("Infantil")
        in 15 .. 17 -> print("Juvenil")
        in 18 .. 25 -> print("Adulto")

    }
}