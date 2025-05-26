import static org.junit.Assert.*;
import org.junit.Test;

public class RetanguloTest {

    @Test
    public void testAreaRetangulo() throws Exception {
        Retangulo r = new Retangulo(5, 3);
        AreaVisitor areaVisitor = new AreaVisitor();
        r.aceitar(areaVisitor);
        assertEquals(15.0, areaVisitor.getArea(), 0.01);
    }

    @Test
    public void testPerimetroRetangulo() throws Exception {
        Retangulo r = new Retangulo(5, 3);
        double perimetroEsperado = 2 * (r.getAltura() + r.getLargura());
        PerimetroVisitor perimetroVisitor = new PerimetroVisitor();
        r.aceitar(perimetroVisitor);
        assertEquals(16.0, perimetroEsperado, 0.01);
    }

    @Test
    public void testMaximizarRetangulo() throws Exception {
        Retangulo r = new Retangulo(2, 4);
        MaximizarVisitor maxVisitor = new MaximizarVisitor();
        r.aceitar(maxVisitor);
        assertEquals(4.0, r.getLargura(), 0.01);
        assertEquals(8.0, r.getAltura(), 0.01);
    }
}
