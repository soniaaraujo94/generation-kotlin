fun main () {

    var soma = 1

    do{
        println("Informe um número: ")
        var num = readln().toInt()
        soma += num

    }while(num != 0)

    print("A soma dos números é: $soma")

}