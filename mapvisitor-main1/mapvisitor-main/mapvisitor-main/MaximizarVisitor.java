public class MaximizarVisitor implements VisitorIF {
    public void visitaCirculo(Circulo c) {
        c.raio *= 2;
    }

    public void visitaRetangulo(Retangulo r) {
        r.largura *= 2;
        r.altura *= 2;
    }

    public void visitaTriangulo(Triangulo t) {
        t.base *= 2;
        t.altura *= 2;
        t.lado1 *= 2;
        t.lado2 *= 2;
    }

    public void visitaTrapezio(Trapezio tr) {
        tr.baseMaior *= 2;
        tr.baseMenor *= 2;
        tr.altura *= 2;
        tr.lado1 *= 2;
        tr.lado2 *= 2;
    }
}
