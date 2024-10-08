import org.example.Circulo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CirculoTest {
    @Test
    public void testCalcularAreaConRadioPositivo(){
        Circulo circulo = new Circulo();
        double resultado = circulo.calcularArea(2);
        assertEquals(12.5664, resultado, 0.0001 ,"El area del circulo debería ser 12,5664");
    }
    @Test
    public void testCalcularAreaConRadioNegativo(){
        Circulo circulo = new Circulo();
         assertThrows(IllegalArgumentException.class, () -> circulo.calcularArea(-1), "Debería lanzar un IllegalArgumentException si el radio es negativo");
    }
}
