import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.tdd.TraductorMorse;

public class TraductorMorseTest {


    @Test
    void morseATexto(){
        var miClase = new TraductorMorse();
        String result = miClase.traducir(".... --- .-.. .-");
        assertEquals("HOLA", result);
    }

    @Test
    void textoAMorse(){
        var miClase = new TraductorMorse();
        String result = miClase.traducir("HOLA");
        assertEquals(".... --- .-.. .-", result);
    }

    @Test
    void textoVacio(){
        var miClase = new TraductorMorse();
        String result = miClase.traducir("");
        assertEquals("", result);
    }
}
