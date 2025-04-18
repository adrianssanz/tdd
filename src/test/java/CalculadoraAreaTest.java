import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.tdd.areaPoligonos.*;

public class CalculadoraAreaTest {
    CalculadoraArea calculadoraArea = new CalculadoraArea();

    @Test
    public void testCalcularAreaCuadrado(){
        Poligono cuadrado = new Cuadrado(4);
        double area = calculadoraArea.calcularArea(cuadrado);
        assertEquals(16, area);
    }

    @Test
    public void testCalcularAreaRectangulo(){
        Poligono rectangulo = new Rectangulo(4, 5);
        double area = calculadoraArea.calcularArea(rectangulo);
        assertEquals(20, area);
    }

    @Test
    public void testCalcularAreaTriangulo(){
        Poligono triangulo = new Triangulo(4, 5);
        double area = calculadoraArea.calcularArea(triangulo);
        assertEquals(10, area);
    }
}
