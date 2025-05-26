public class PerimetroVisitor implements VisitorIF {
    @Override
    public void visitaCirculo(Circulo c) {
        System.out.println("Perímetro do Círculo: " + (2 * Math.PI * c.getRaio()));
    }

    @Override
    public void visitaRetangulo(Retangulo r) {
        System.out.println("Perímetro do Retângulo: " + (2 * (r.getLargura() + r.getAltura())));
    }

    @Override
    public void visitaTriangulo(Triangulo t) {
        System.out.println("Perímetro do Triângulo: " + (t.getBase() + t.getLado1() + t.getLado2()));
    }

    @Override
    public void visitaTrapezio(Trapezio tr) {
        System.out.println("Perímetro do Trapézio: " + (tr.getBaseMaior() + tr.getBaseMenor() + tr.getLado1() + tr.getLado2()));
    }
}
