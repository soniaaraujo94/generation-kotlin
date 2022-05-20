/*fun main(){

    println(
        "O que você deseja fazer?: " +
                "\n1 - Adicionar produto" +
                "\n2 - Remover produto" +
                "\n3 - Atualizar produto" +
                "\n4 - Ver estoque" +
                "\n5 - Sair"
    )
    val opcao = readln().toInt()

    val produtos = mutableMapOf<String, Int>()

    for (i in 1..5){

        when (opcao) {

            1 -> {
                println("--- ADICIONE NOVO PRODUTO ---")
                print("Digite o nome do produto: ")
                val nome = readln()

                print("Digite a quantidade de itens no estoque: ")
                val qtd = readln().toInt()

                produtos[nome] = qtd

                println()

                println("--- ADICIONADO NO ESTOQUE --")
                println(
                    "Nome do produto: $nome" +
                            "\nQTD. em estoque: $qtd"
                )
            }

            2 -> {
                    println("--- REMOVER PRODUTO ---")
                    println("Digite um produto para remover: ")
                    val deletar = readln()

                    if (produtos.contains(deletar)){

                        produtos.remove(deletar)

                    }else {

                        println("Não existe produtos com o nome $deletar")

                    }

            }
        }
    }
}*/