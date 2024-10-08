import org.example.Calculadora;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {
    Calculadora calculadora = new Calculadora();

    @Test
    public void testSumar(){
        int resultado = calculadora.sumar(2,3);
        assertEquals(5, resultado, "La suma de 2+3 debería ser 5");
    }
    @ParameterizedTest
    @CsvSource({
            "2, 3, 6",
            "4, 5, 20",
            "6, 7, 42",
            "7, 8, 56"
    })
    public void testMultiplicar(int a, int b, int resultadoEsperado){
        int resultado = calculadora.multiplicar(a, b);
        assertEquals(resultadoEsperado, resultado, "La multiplicacion falló");
    }
    @ParameterizedTest
    @CsvSource({
            "6, 0, Infinity",
            "0, 0, NaN",
            "6, 3, 2",
            "5, 2, 2.5"
    })
    public void testDividir(int a, int b, double resultadoEsperado){
        double resultado = calculadora.dividir(a, b);
        assertEquals(resultadoEsperado, resultado, "La división falló");
    }
}
