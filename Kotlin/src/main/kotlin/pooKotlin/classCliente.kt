class classCliente(private var nome: String) {

    var endereco = ""
    var telefone = ""
    var listaDeCompras = mutableListOf<String>()

    constructor(nome: String, endereco: String, telefone: String)
    :this(nome){
        this.endereco = endereco
        this.telefone = telefone
    }

    fun addCompra () {
        println("\n--- Adicionar produto ---")
        println("Qual produto você quer comprar?")
        val produto = readln()

        if (produto != ""){

            listaDeCompras.add(produto)

        }else{
            println("Produto Inválido")
        }

    }

    fun removeCompra () {
        println("\n--- Remover produto ---")
        println("Qual produto você quer remover da sua lista de compras?")
        val produto = readln()

        if (produto != "" && listaDeCompras.contains(produto)){

            listaDeCompras.remove(produto)

        }else {
            println("Produto Inválido")
        }
    }

    fun listCompra () {

        println()

        listaDeCompras.forEach {
            println(it)
        }
    }
}