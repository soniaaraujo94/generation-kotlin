fun main(){

    print("Digite um número: ")
    var num = readLine()!!.toInt()

    if (num % 2 == 0){

        print("O $num é par")

    }else{

        print("O $num é impar")

    }

}