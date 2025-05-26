public class PerimetroVisitor implements VisitorIF {
    public void visitaCirculo(Circulo c) {
        System.out.println("Perímetro do Círculo: " + (2 * Math.PI * c.raio));
    }

    public void visitaRetangulo(Retangulo r) {
        System.out.println("Perímetro do Retângulo: " + (2 * (r.largura + r.altura)));
    }

    public void visitaTriangulo(Triangulo t) {
        System.out.println("Perímetro do Triângulo: " + (t.base + t.lado1 + t.lado2));
    }

    public void visitaTrapezio(Trapezio tr) {
        System.out.println("Perímetro do Trapézio: " + (tr.baseMaior + tr.baseMenor + tr.lado1 + tr.lado2));
    }
}