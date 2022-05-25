package herança

class Preguica(override var nome: String, override var idade: Int) : Animal {

    override fun correr() {
        println("Erro: preguiça não corre!")
    }

    override fun emitirSom() {

        println("Preguiça comendo folhas:" +
                "Nhecnhecnhec!")

    }

}