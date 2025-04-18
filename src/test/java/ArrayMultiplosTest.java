import org.junit.jupiter.api.Test;
import org.tdd.ArrayMultiplos;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayMultiplosTest {
    String[] resultado = ArrayMultiplos.arrayMultiplos();

    @Test
    public void testArrayMultiplos_TamanoCorrecto() {
        assertEquals(100, resultado.length, "El arreglo debe tener 100 elementos");
    }

    @Test
    public void testArrayMultiplos_ValoresCorrectos() {
        assertEquals("1", resultado[0], "Posición 1 debe ser '1'");
        assertEquals("2", resultado[1], "Posición 2 debe ser '2'");
        assertEquals("fizz", resultado[2], "Posición 3 debe ser 'fizz'");
        assertEquals("4", resultado[3], "Posición 4 debe ser '4'");
        assertEquals("buzz", resultado[4], "Posición 5 debe ser 'buzz'");
        assertEquals("fizz", resultado[5], "Posición 6 debe ser 'fizz'");
        assertEquals("fizzbuzz", resultado[14], "Posición 15 debe ser 'fizzbuzz'");
        assertEquals("buzz", resultado[99], "Posición 100 debe ser 'buzz'");
    }
}
