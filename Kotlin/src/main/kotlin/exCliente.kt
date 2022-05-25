fun main() {

/*
Cria uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão
e pelo menos mais duas opções de construtores conforme sua percepção,
com os atributos: nome (String), endereço (String), telefone (String), listaDeCompras
(mutableListOf<Strings>()).

A classe precisará de métodos para adicionar, remover e listar os itens do atributo
listaDeCompras. Crie um método para verificar o nome ao inicializar a classe e,
caso esteja vazio, jogue uma exceção. Ao instanciar a classe cliente na
função main(), não esquecer de colocar dentro de um bloco try catch.
 */

    try {
        val cliente = Cliente(
            "Rodrigo", "Rua Santa 324", "110000-0000"
        )

        while (true) {
            println(
                "\n1) Adicionar Item" +
                        "\n2) Remover Item" +
                        "\n3) Listar Itens" +
                        "\n4) Sair"
            )
            var compraEscolha = readln().toInt()

            when (compraEscolha) {

                1 -> cliente.addCompra()
                2 -> cliente.removeCompra()
                3 -> cliente.listCompra()
                4 -> break
            }
        }

    } catch (e: Exception) {
        println(e.message)
    }
}