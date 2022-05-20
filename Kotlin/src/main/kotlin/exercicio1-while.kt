fun main (){

    var idosos = 0
    var jovens = 0
    var idade = 0

    while (idade != -99){
        println("Digite uma idade")
        idade = readln().toInt()

        if (idade <= 21 && idade >= 0){

            jovens++

        }else if(idade >= 50 && idade >= 0){

            idosos++

        }
    }

    println("Total de pessoas com menos de 21 anos: $jovens\n" +
            "Total de pessoas com mais de 50 anos: $idosos")
}