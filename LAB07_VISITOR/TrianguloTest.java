import static org.junit.Assert.*;
import org.junit.Test;

public class TrianguloTest {

    @Test
    public void testAreaTriangulo() throws Exception {
        Triangulo t = new Triangulo(6, 4, 5, 5);
        AreaVisitor areaVisitor = new AreaVisitor();
        t.aceitar(areaVisitor);
        assertEquals(12.0, areaVisitor.getArea(), 0.01);
    }

    @Test
    public void testPerimetroTriangulo() throws Exception {
        Triangulo t = new Triangulo(6, 4, 5, 5);
        double perimetroEsperado = t.getBase() + t.getLado1() + t.getLado2();
        PerimetroVisitor perimetroVisitor = new PerimetroVisitor();
        t.aceitar(perimetroVisitor);
        assertEquals(16.0, perimetroEsperado, 0.01);
    }

    @Test
    public void testMaximizarTriangulo() throws Exception {
        Triangulo t = new Triangulo(3, 4, 5, 5);
        MaximizarVisitor maxVisitor = new MaximizarVisitor();
        t.aceitar(maxVisitor);
        assertEquals(6.0, t.getBase(), 0.01);
        assertEquals(8.0, t.getAltura(), 0.01);
        assertEquals(10.0, t.getLado1(), 0.01);
        assertEquals(10.0, t.getLado2(), 0.01);
    }
}
