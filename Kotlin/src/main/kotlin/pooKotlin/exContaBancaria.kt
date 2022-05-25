fun main(){

    val contaBancaria = ContaBancaria(
        "Sonia Araujo",
        101.1,
        10377541,
        50000.00
    )

    contaBancaria.tipo()

    contaBancaria.saldo()

    println("\n\nQuanto você deseja sacar: ")
    val dinSaque = readln().toDouble()

    contaBancaria.saque(dinSaque)

    contaBancaria.saldo()

    println("\n\nQuanto você deseja depositar: ")
    val dinDepo = readln().toDouble()

    contaBancaria.deposito(dinDepo)

    contaBancaria.saldo()
}