import org.junit.jupiter.api.Test;
import org.tdd.ListMultiplos;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ListMultiplosTest {
    List<String> resultado = ListMultiplos.listMultiplos();

    @Test
    public void testListMultiplos_TamanoCorrecto(){
        assertEquals(100, resultado.size(), "El arreglo debe tener 100 elementos");
    }

    @Test
    public void testListMultiplos_ValoresCorrectos(){
        assertEquals("1", resultado.get(0), "Posición 1 debe ser '1'");
        assertEquals("2", resultado.get(1), "Posición 2 debe ser '2'");
        assertEquals("fizz", resultado.get(2), "Posición 3 debe ser 'fizz'");
        assertEquals("4", resultado.get(3), "Posición 4 debe ser '4'");
        assertEquals("buzz", resultado.get(4), "Posición 5 debe ser 'buzz'");
        assertEquals("fizz", resultado.get(5), "Posición 6 debe ser 'fizz'");
    }
}
