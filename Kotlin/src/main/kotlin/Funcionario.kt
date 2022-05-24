class Funcionario (
    var nome: String,
    var idade: Int,
    var empresa: String,
    var cargo: String,
    var salario: Double,
    var horas: Double
) {

    var trabalhando = false
    var pagamento = false

    fun perguntar(){
        println("$nome está trabalhando hoje?" +
                "\n1)SIM 2)NÃO")
        var resposta = readln().toInt()
        when (resposta){

            1 -> trabalhando = true

            2 -> trabalhando = false
        }
    }

    fun trabalhar() {
        if (trabalhando) {
            trabalhando = true
            println("$nome está trabalhando")
        }else{
            println("$nome está descansando")
        }
    }

    fun receber(){
        if (pagamento){
            pagamento = true
            println("Dia de pagamento. $nome irá receber seu salário :)")
        }else{
            println("$nome ainda não vai ser pago :(")
        }
    }





}