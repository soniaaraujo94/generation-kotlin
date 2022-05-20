fun main (){

    // Escrever um programa que receba vários números inteiros no teclado. E no
    //final imprimir a média dos números múltiplos de 3. Para sair digitar
    //0(zero).(DO...WHILE)

    println("Obs. para sair digite: 0")

    var soma = 0
    var cont = 0

    do{
        println("Digite um número:")
        val num = readln().toInt()

        if(num % 3 == 0 && num != 0){

            soma += num
            cont ++

        }

    }while(num != 0)

    val media = soma / cont

    println("A soma de todos os números inteiros mútiplos de 3: $soma" +
            "e a média dos é: $media")

}