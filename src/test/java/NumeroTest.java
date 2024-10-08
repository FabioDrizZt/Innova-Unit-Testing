import org.example.Numero;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumeroTest {
    @ParameterizedTest
    @ValueSource(ints = {2,4,6,8,26,36,48,110})
    public void testSumar(int numero){
        Numero num = new Numero();
        assertTrue(num.esPar(numero), "El numero debe ser par");
    }
}
