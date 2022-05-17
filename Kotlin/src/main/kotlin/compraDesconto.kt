fun main (){

    println("Informe o valor da compra: ")
    print("R$")
    val compra = readln().toDouble()

    var desc = 0.0

    if(compra < 50){

        desc = 0.0

    }else if(compra >= 50 && compra <= 100){

        desc = 0.1

    }else if(compra >= 101 && compra <= 200) {

        desc = 0.2

    }else{

        desc = 0.3

    }

    val compraDesc = compra * desc

    print("A sua compra, com ${desc * 100}% de desconto fica em torno de" +
            "R$ ${compra - compraDesc}")

}
