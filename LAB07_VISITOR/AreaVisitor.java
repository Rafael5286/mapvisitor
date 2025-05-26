public class AreaVisitor implements VisitorIF {
    private double area;

    @Override
    public void visitaCirculo(Circulo c) {
        double raio = c.getRaio();
        area = Math.PI * raio * raio;
        System.out.println("Área do Círculo: " + area);
    }

    @Override
    public void visitaRetangulo(Retangulo r) {
        area = r.getLargura() * r.getAltura();
        System.out.println("Área do Retângulo: " + area);
    }

    @Override
    public void visitaTriangulo(Triangulo t) {
        area = (t.getBase() * t.getAltura()) / 2.0;
        System.out.println("Área do Triângulo: " + area);
    }

    @Override
    public void visitaTrapezio(Trapezio tr) {
        area = ((tr.getBaseMaior() + tr.getBaseMenor()) * tr.getAltura()) / 2.0;
        System.out.println("Área do Trapézio: " + area);
    }

    public double getArea() {
        return area;
    }
}
