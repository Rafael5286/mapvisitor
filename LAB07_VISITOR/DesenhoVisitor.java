public class DesenhoVisitor implements VisitorIF {
    @Override
    public void visitaCirculo(Circulo c) {
        System.out.println("Desenhando Círculo com raio " + c.getRaio());
    }

    @Override
    public void visitaRetangulo(Retangulo r) {
        System.out.println("Desenhando Retângulo " + r.getLargura() + "x" + r.getAltura());
    }

    @Override
    public void visitaTriangulo(Triangulo t) {
        System.out.println("Desenhando Triângulo com base " + t.getBase() + " e altura " + t.getAltura());
    }

    @Override
    public void visitaTrapezio(Trapezio tr) {
        System.out.println("Desenhando Trapézio com bases " + tr.getBaseMaior() + " e " + tr.getBaseMenor());
    }
}
