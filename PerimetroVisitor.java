public class PerimetroVisitor implements VisitorIF {
    public void visitar(Circulo c) {
        System.out.println("Perímetro do Círculo: " + (2 * Math.PI * c.raio));
    }

    public void visitar(Retangulo r) {
        System.out.println("Perímetro do Retângulo: " + (2 * (r.largura + r.altura)));
    }

    public void visitar(Triangulo t) {
        System.out.println("Perímetro do Triângulo: " + (t.base + 2 * t.lado));
    }

    public void visitar(Trapezio tr) {
        System.out.println("Perímetro do Trapézio: " + (tr.baseMaior + tr.baseMenor + tr.lado1 + tr.lado2));
    }
}