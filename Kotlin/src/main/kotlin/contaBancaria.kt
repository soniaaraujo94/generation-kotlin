class ContaBancaria(
    var titular: String,
    var agencia: Double,
    var conta: Int,
    var saldo: Double
) {

    var contaCorrente = true

    fun tipo(){

        println("Tipo da conta:" +
                "\n1) Conta Corrente 2) Conta Poupança")
        val resposta = readln().toInt()

        when(resposta){
            1-> println("\n--- CONTA CORRENTE ---\n")
            2-> {contaCorrente = false
                println("\n--- CONTA POUPANÇA ---\n")}
        }

    }

    fun saldo(){
        println("--- SALDO DA CONTA ---")
        print("R$$saldo")
    }

    fun saque(valor: Double) {
        if (valor > 0.0 && valor <= saldo){
            saldo -=valor
            println("Saque relizado no valor de: R$$valor\n")
        }else {
            println("Saque não pode ser realiazado\n")
        }
    }

    fun deposito(valor: Double) {
        if (valor > 0.0) {
            saldo += valor
            println("Deposito relizado no valor de R$$valor\n")
        }else {
            println("Depósito não pode ser realizado\n")
        }

    }


}