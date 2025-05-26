import static org.junit.Assert.*;
import org.junit.Test;

public class CirculoTest {

    @Test
    public void testArea() throws Exception {
        Circulo c = new Circulo(2);
        AreaVisitor area = new AreaVisitor();
        c.aceitar(area);
        assertEquals(Math.PI * 4, area.getArea(), 0.01);
    }

    @Test
    public void testMaximizar() throws Exception {
        Circulo c = new Circulo(2);
        MaximizarVisitor max = new MaximizarVisitor();
        c.aceitar(max);
        assertEquals(4, c.getRaio(), 0.01);
    }
}
