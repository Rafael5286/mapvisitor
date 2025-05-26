import static org.junit.Assert.*;
import org.junit.Test;

public class RetanguloTest {

	@Test
	public void testAreaRetangulo() {
	    Retangulo r = new Retangulo(5, 3);
	    AreaVisitor areaVisitor = new AreaVisitor();
	    r.aceitar(areaVisitor);
	    assertEquals(15.0, areaVisitor.getArea(), 0.01);
	}


    @Test
    public void testPerimetroRetangulo() {
        Retangulo r = new Retangulo(5, 3);
        PerimetroVisitor perimetroVisitor = new PerimetroVisitor();
        r.aceitar(perimetroVisitor);
        assertEquals(16.0, r.altura * 2 + r.largura * 2, 0.01);
    }

    @Test
    public void testMaximizarRetangulo() {
        Retangulo r = new Retangulo(2, 4);
        MaximizarVisitor maxVisitor = new MaximizarVisitor();
        r.aceitar(maxVisitor);
        assertEquals(4.0, r.largura, 0.01);
        assertEquals(8.0, r.altura, 0.01);
    }
}

