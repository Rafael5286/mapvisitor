import static org.junit.Assert.*;
import org.junit.Test;

public class TrapezioTest {

    @Test
    public void testAreaTrapezio() throws Exception {
        Trapezio tr = new Trapezio(8, 4, 5, 3, 3);
        AreaVisitor areaVisitor = new AreaVisitor();
        tr.aceitar(areaVisitor);
        assertEquals(30.0, areaVisitor.getArea(), 0.01);
    }

    @Test
    public void testPerimetroTrapezio() throws Exception {
        Trapezio tr = new Trapezio(8, 4, 5, 3, 3);
        double perimetroEsperado = tr.getBaseMaior() + tr.getBaseMenor() + tr.getLado1() + tr.getLado2();
        PerimetroVisitor perimetroVisitor = new PerimetroVisitor();
        tr.aceitar(perimetroVisitor);
        assertEquals(18.0, perimetroEsperado, 0.01);
    }

    @Test
    public void testMaximizarTrapezio() throws Exception {
        Trapezio tr = new Trapezio(6, 4, 5, 3, 2);
        MaximizarVisitor maxVisitor = new MaximizarVisitor();
        tr.aceitar(maxVisitor);
        assertEquals(12.0, tr.getBaseMaior(), 0.01);
        assertEquals(8.0, tr.getBaseMenor(), 0.01);
        assertEquals(10.0, tr.getAltura(), 0.01);
        assertEquals(6.0, tr.getLado1(), 0.01);
        assertEquals(4.0, tr.getLado2(), 0.01);
    }
}
