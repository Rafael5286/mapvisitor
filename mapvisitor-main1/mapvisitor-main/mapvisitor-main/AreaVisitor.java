public class AreaVisitor implements VisitorIF {
    private double area;

    public void visitaCirculo(Circulo c) {
        area = Math.PI * c.raio * c.raio;
        System.out.println("Área do Círculo: " + area);
    }

    public void visitaRetangulo(Retangulo r) {
        area = r.largura * r.altura;
        System.out.println("Área do Retângulo: " + area);
    }

    public void visitaTriangulo(Triangulo t) {
        area = (t.base * t.altura) / 2.0;
        System.out.println("Área do Triângulo: " + area);
    }

    public void visitaTrapezio(Trapezio tr) {
        area = ((tr.baseMaior + tr.baseMenor) * tr.altura) / 2.0;
        System.out.println("Área do Trapézio: " + area);
    }

    public double getArea() {
        return area;
    }
}
