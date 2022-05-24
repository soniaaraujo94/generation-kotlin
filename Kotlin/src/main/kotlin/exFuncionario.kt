fun main(){

    val func = Funcionario (
        "Rodolfredo",
        27,
        "TEKMOB",
        "Desenvolvedor Mobile",
        5700.0,
        8.0
    )

    println("${func.nome} é um ${func.cargo} na ${func.empresa} e trabalha cerca de  " +
            "\n${func.horas}hrs/dia recebendo um valor de R$${func.salario} por mês")

    println()

    func.perguntar()
    func.trabalhar()
    func.receber()
}