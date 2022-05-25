fun main(){

    print("Digite o primeiro número: ")
    var num1 = readln().toInt()

    print("Digite o segundo número: ")
    var num2 = readln().toInt()

    print("Digite o terceiro número: ")
    var num3 = readln().toInt()

    if(num1 > num2 && num1 > num3){

        print("O $num1 é maior que $num2 e $num3")

    }else if(num2 > num1 && num2 > num3){

        print("O $num2 é maior que $num1 e $num3")

    }else{

        print("O $num3 é maior que $num1 e $num2")

    }
}