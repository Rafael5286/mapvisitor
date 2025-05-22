public class AreaVisitor implements VisitorIF {
    public void visitar(Circulo c) {
        System.out.println("Área do Círculo: " + (Math.PI * c.raio * c.raio));
    }

    public void visitar(Retangulo r) {
        System.out.println("Área do Retângulo: " + (r.largura * r.altura));
    }

    public void visitar(Triangulo t) {
        System.out.println("Área do Triângulo: " + (t.base * t.altura / 2));
    }

    public void visitar(Trapezio tr) {
        System.out.println("Área do Trapézio: " + ((tr.baseMaior + tr.baseMenor) * tr.altura / 2));
    }
}
