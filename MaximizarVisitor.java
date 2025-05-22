public class MaximizarVisitor implements VisitorIF {
    public void visitar(Circulo c) {
        c.raio *= 2;
    }

    public void visitar(Retangulo r) {
        r.largura *= 2;
        r.altura *= 2;
    }

    public void visitar(Triangulo t) {
        t.base *= 2;
        t.altura *= 2;
        t.lado *= 2;
    }

    public void visitar(Trapezio tr) {
        tr.baseMaior *= 2;
        tr.baseMenor *= 2;
        tr.altura *= 2;
        tr.lado1 *= 2;
        tr.lado2 *= 2;
    }
}
