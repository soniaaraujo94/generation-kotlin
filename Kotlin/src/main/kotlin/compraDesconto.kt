fun main () {
/*
    println("Informe o valor da compra: ")
    print("R$")
    val compra = readln().toDouble()

    var desc = 0.0

    if(compra < 50){

        desc = 0.0

    }else if(compra in 50.0..100.0){

        desc = 0.1

    }else if(compra in 101.0..200.0) {

        desc = 0.2

    }else{

        desc = 0.3

    }

    val compraDesc = compra * desc

    print("A sua compra, com ${desc * 100}% de desconto fica em torno de" +
            "R$ ${compra - compraDesc}")

}
*/

    var soma = 0.0
    var num = 1.0

    while (num != 0.0){

        print("Digite um número diferente de 0:")
        num = readln().toDouble()
        soma += num

    }

}