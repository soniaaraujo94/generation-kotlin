package herança

class Cavalo(override var nome: String, override var idade: Int) : Animal{

    override fun correr() {
        println("Correndo com a crina ao vento" +
                "Pocotó, pocotó!")
    }

    override fun emitirSom() {
        println("lihhhhhh!")
    }

}