import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CirculoTest {
    @Test
    public void testArea() {
        Circulo c = new Circulo(2);
        AreaVisitor area = new AreaVisitor();
        c.aceitar(area);
        assertEquals(Math.PI * 4, Math.PI * c.raio * c.raio, 0.01);
    }

    @Test
    public void testMaximizar() {
        Circulo c = new Circulo(2);
        MaximizarVisitor max = new MaximizarVisitor();
        c.aceitar(max);
        assertEquals(4, c.raio, 0.01);
    }
}