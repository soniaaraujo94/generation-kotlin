fun main() {

    /*Uma empresa desenvolveu uma pesquisa para saber as características
    psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
    era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
    (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
    agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
    pessoas, calcule e mostre: (WHILE)
    o número de pessoas calmas;
    o número de mulheres nervosas;
    o número de homens agressivos;
    o número de outros calmos;
    o número de pessoas nervosas com mais de 40 anos;
    o número de pessoas calmas com menos de 18 anos. */

    var idade = 0
    var pessoas = 0
    var sexo = 1; 2; 3
    var psico = 1; 2; 3
    var pessoasCalmas = 0
    var mulheresNervosas = 0
    var homensAgressivos = 0
    var outresCalmes = 0
    var pessoasNervosas40 = 0
    var pessoasCalmas18 = 0

    while (pessoas <= 2) {

        println("------ ${pessoas + 1}º PESSOA  --------")

        println("Qual a sua idade? ")
        idade = readln().toInt()

        println(
            "Qual gênero que se identifica?\n" +
                    "(1)Masculino\n" +
                    "(2)Femenino\n" +
                    "(3)Outros\n"
        )
        sexo = readln().toInt()

        println(
            "Assinale a alternativa que você mais se considera:\n" +
                    "(1) Você é uma pessoa calma?\n" +
                    "(2) Você é uma pessoa nervosa?\n" +
                    "(3) Você é uma pessoa agressiva?\n"
        )
        psico = readln().toInt()

        if (psico == 1) {

            pessoasCalmas++

        }

        if (sexo == 2 && psico == 2) {

            mulheresNervosas++

        }

        if (sexo == 3 && psico == 1) {

            outresCalmes++

        }

        if (sexo == 1 && psico == 3) {

            homensAgressivos++

        }

        if (idade >= 40 && psico == 2) {

            pessoasNervosas40++

        }

        if (idade <= 18 && psico == 1) {

            pessoasCalmas18++

        }

        pessoas++
    }

    println("Número de pessoas calmas: $pessoasCalmas")
    println("Número de mulheres nervosas: $mulheresNervosas")
    println("Número de homens  agressivos: $homensAgressivos ")
    println("Número de outres calmes: $outresCalmes")
    println("Número de pessoas nervosas com mais de 40 anos: $pessoasNervosas40 ")
    println("Número de pessoas nervosas com menos de 18 anos: $pessoasCalmas18")

}