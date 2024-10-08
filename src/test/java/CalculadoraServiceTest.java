import org.example.Calculadora;
import org.example.services.CalculadoraService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CalculadoraServiceTest {
    @Mock
    private Calculadora calculadoraMock;

    @InjectMocks
    private CalculadoraService calculadoraService;

    public CalculadoraServiceTest(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSumarNumeros(){
        // Simular el comportamiento del mock
        when(calculadoraMock.sumar(4,5)).thenReturn(9);

        // Ejecutar el metodo que queremos probar
        int resultado = calculadoraService.sumarNumeros(4,5);

        // Verificamos el resultado
        assertEquals(9, resultado, "La suma deberia dar 9");

        // Verificar que el mock fue llamado correctamente
        verify(calculadoraMock).sumar(4,5);
    }
}
