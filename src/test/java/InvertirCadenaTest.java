import org.junit.jupiter.api.Test;
import org.tdd.InvertirCadena;

import static org.junit.jupiter.api.Assertions.*;

public class InvertirCadenaTest {

    @Test
    void odnuMaloH(){
        var miClase = new InvertirCadena();
        String result = miClase.invertCadena("Hola Mundo");
        assertEquals("odnuM aloH", result);
    }
}
