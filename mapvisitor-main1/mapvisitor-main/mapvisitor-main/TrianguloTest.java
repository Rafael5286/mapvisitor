import static org.junit.Assert.*;
import org.junit.Test;

public class TrianguloTest {

    @Test
    public void testArea() {
        Triangulo t = new Triangulo(4, 3, 5, 5);
        AreaVisitor area = new AreaVisitor();
        t.aceitar(area);
        double areaEsperada = (4 * 3) / 2.0;
        assertEquals(areaEsperada, (t.base * t.altura) / 2, 0.01);
    }

    @Test
    public void testMaximizar() {
        Triangulo t = new Triangulo(4, 3, 5, 5);
        MaximizarVisitor max = new MaximizarVisitor();
        t.aceitar(max);
        assertEquals(8, t.base, 0.01);
        assertEquals(6, t.altura, 0.01);
        assertEquals(10, t.lado1, 0.01);
        assertEquals(10, t.lado2, 0.01);
    }
}
