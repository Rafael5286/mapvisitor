public class DesenhoVisitor implements VisitorIF {
    public void visitaCirculo(Circulo c) {
        System.out.println("Desenhando Círculo com raio " + c.raio);
    }

    public void visitaRetangulo(Retangulo r) {
        System.out.println("Desenhando Retângulo " + r.largura + "x" + r.altura);
    }

    public void visitaTriangulo(Triangulo t) {
        System.out.println("Desenhando Triângulo com base " + t.base + " e altura " + t.altura);
    }

    public void visitaTrapezio(Trapezio tr) {
        System.out.println("Desenhando Trapézio com bases " + tr.baseMaior + " e " + tr.baseMenor);
    }
}