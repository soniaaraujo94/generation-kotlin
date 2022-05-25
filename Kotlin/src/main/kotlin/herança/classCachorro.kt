package herança

class Cachorro(override var nome: String, override var idade: Int) : Animal {

    override fun emitirSom() {
        println("Au au!")
    }

    override fun correr() {
        println("Correndo atrás da moto")
    }



}