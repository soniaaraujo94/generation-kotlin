import java.util.Scanner

fun main(){

    val a = Scanner(System.`in`)

    println("Digite o código de operário: ")
    val codigo = a.nextInt()

    println("Digite o total de horas trabalhadas: ")
    val horas = a.nextInt()

    if(horas <= 50){

        val salario = 20.0 * horas

        println("Operador: $codigo \n" +
                "Horas trabalhadas: $horas \n" +
                "Salário Total: R$ $salario")

    }else{

        var salario = 20.0 * 50.0
        var excesso = horas - 50.0
        var salExc = excesso * 20
        var salarioTotal = salExc + salario

        salario += excesso


        println("Operador: $codigo \n" +
                "Horas trabalhadas: $horas \n" +
                "Salário Excedente: R$ $salExc \n" +
                "Salário Total: R$ $salarioTotal")

    }



}