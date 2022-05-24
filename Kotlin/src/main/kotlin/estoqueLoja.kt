/*fun main() {
    println("---- CONTROLE DE ESTOQUE ----")
    println("O que você deseja fazer?: " +
                "\n1 - Adicionar produto" +
                "\n2 - Remover produto" +
                "\n3 - Atualizar produto" +
                "\n4 - Ver estoque" +
                "\n5 - Sair")

    val opcao = readln().toInt()

    val nomeProduto = mutableListOf<String>()
    val valorProduto = mutableListOf<Double>()
    val qtdProduto = mutableListOf<Int>()

   do{
        when (opcao) {

            1 -> {
                println("--- ADICIONE NOVO PRODUTO ---")
                print("Digite o nome do produto: ")
                nomeProduto.add(readln())

                print("Digite o preço do produto: R$")
                valorProduto.add(readln().toDouble())

                print("Digite a quantidade de itens no estoque: ")
                qtdProduto.add(readln().toInt())

                println()

                println("--- ADICIONADO NO ESTOQUE --")
                println(
                    "Nome do produto: $nomeProduto " +
                            "\nValor do Produto: R$$valorProduto " +
                            "\nQTD. em estoque: $qtdProduto")

                println()

                main()
            }

            2 -> {
                println("--- REMOVER PRODUTO ---")
                println("Digite um produto para remover: ")
                val deletar = readln()

                if (nomeProduto.contains(deletar)) {

                    var aux = nomeProduto.indexOf(deletar)
                    var qtdDel = qtdProduto[aux]

                    var valorDel = valorProduto[aux]
                    valorProduto.remove(valorDel)
                    qtdProduto.remove(qtdDel)
                    nomeProduto.remove(deletar)


                } else {

                    println("Não existe produtos com o nome $deletar")

                }
                main()
            }

            3 -> {
                println("--- ATUALIZAR PRODUTO ---")
                println(
                    "O que você deseja fazer?: " +
                            "\n1 - Alterar nome do produto" +
                            "\n2 - Alterar preço" +
                            "\n3 - Atualizar quantidade"
                )

                val opcao2 = readln().toInt()

                if (opcao2 == 1) {
                    println("ATUALIZAR NOME")
                    print("Digite o nome do produto que deseja atualizar: ")
                    val edit = readln()

                    if (nomeProduto.contains(edit)) {

                        val alterar = nomeProduto.indexOf(edit)
                        println("Digite o novo nome do produto: ")
                        val nome = readln()
                        nomeProduto[alterar] = nome
                        println("O nome foi atualizado com sucesso!")

                    } else {
                        println("O nome $edit não existe na lista")
                    }

                } else if (opcao2 == 2) {
                    println("ATUALIZAR PREÇO")
                    print("Digite o nome do produto que deseja atualizar: ")
                    val edit = readln()

                    if (nomeProduto.contains(edit)) {

                        val alterar = nomeProduto.indexOf(edit)
                        println("Digite o novo preço do produto: ")
                        val valor = readln().toDouble()
                        valorProduto[alterar] = valor
                        println("O preço foi atualizado com sucesso!")

                    }else {
                        println("O nome $edit não existe na lista")

                    }

                } else if (opcao2 == 3) {
                    println("ATUALIZAR QUANTIDADE")
                    print("Digite o nome do produto que deseja atualizar: ")
                    val edit = readln()

                    if (nomeProduto.contains(edit)) {

                        val alterar = nomeProduto.indexOf(edit)
                        println("Digite o novo preço do produto: ")
                        val valor = readln().toInt()
                        qtdProduto[alterar] = valor
                        println("O preço foi atualizado com sucesso!")

                    } else {
                        println("O nome $edit não existe na lista")

                    }

                }

                main()
            }

            4 -> {
                println("--- VER ESTOQUE ---")
                println(
                    "Nome do produto: $nomeProduto " +
                            "\nValor do Produto: R$$valorProduto " +
                            "\nQTD. em estoque: $qtdProduto")

                main()
            }
        }
    }while (opcao != 5)
}
*/