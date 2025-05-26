import static org.junit.Assert.*;
import org.junit.Test;

public class TrapezioTest {

    @Test
    public void testArea() {
        Trapezio tr = new Trapezio(6, 4, 3, 5, 5);
        AreaVisitor area = new AreaVisitor();
        tr.aceitar(area);
        double areaEsperada = ((6 + 4) * 3.0) / 2; 
        assertEquals(areaEsperada, ((tr.baseMaior + tr.baseMenor) * tr.altura) / 2, 0.01);
    }
    
    @Test
    public void testPerimetroTrapezio() {
        Trapezio tr = new Trapezio(6, 4, 3, 5, 7);
        PerimetroVisitor perimetroVisitor = new PerimetroVisitor();
        tr.aceitar(perimetroVisitor);
        double perimetroEsperado = 6 + 4 + 5 + 7;
        assertEquals(perimetroEsperado, tr.baseMaior + tr.baseMenor + tr.lado1 + tr.lado2, 0.01);
    }
    
    @Test
    public void testMaximizar() {
        Trapezio tr = new Trapezio(6, 4, 3, 5, 5);
        MaximizarVisitor max = new MaximizarVisitor();
        tr.aceitar(max);
        assertEquals(12, tr.baseMaior, 0.01);
        assertEquals(8, tr.baseMenor, 0.01);
        assertEquals(6, tr.altura, 0.01);
        assertEquals(10, tr.lado1, 0.01);
        assertEquals(10, tr.lado2, 0.01);
    }
}
