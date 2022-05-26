import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CalculadoraTest{

    //Asserts - vão verificar o que o método precisa retornar para o teste ser validado
    //@Test - indicar que a função vai executar um teste unitário

    @Test
    fun somaTest(){
        //assertEquals(valor esperado, método que será executado)
        assertEquals(11, Calculadora.soma(5, 6))
    }

    @Test
    fun subTest(){
        assertEquals(3, Calculadora.sub(6, 3))
    }

    @Test
    fun multTest(){
        assertEquals(10, Calculadora.mult(5, 2))
    }

    @Test
    fun diviTest(){
        assertEquals(2, Calculadora.divi(6, 3))
    }
    @Test
    fun potenciaTest(){
        assertEquals(4.0,Calculadora.potencia(2.0,2.0))
    }

    @Test
    fun raizTest(){
        assertEquals(2.0,Calculadora.raiz(4.0))
    }
}