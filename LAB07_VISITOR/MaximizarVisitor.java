public class MaximizarVisitor implements VisitorIF {
    @Override
    public void visitaCirculo(Circulo c) {
        try {
            c.setRaio(c.getRaio() * 2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void visitaRetangulo(Retangulo r) {
        try {
            r.setLargura(r.getLargura() * 2);
            r.setAltura(r.getAltura() * 2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void visitaTriangulo(Triangulo t) {
        try {
            t.setBase(t.getBase() * 2);
            t.setAltura(t.getAltura() * 2);
            t.setLado1(t.getLado1() * 2);
            t.setLado2(t.getLado2() * 2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void visitaTrapezio(Trapezio tr) {
        try {
            tr.setBaseMaior(tr.getBaseMaior() * 2);
            tr.setBaseMenor(tr.getBaseMenor() * 2);
            tr.setAltura(tr.getAltura() * 2);
            tr.setLado1(tr.getLado1() * 2);
            tr.setLado2(tr.getLado2() * 2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
