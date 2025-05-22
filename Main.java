import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ElementoConcretoIF> figuras = List.of(
                new Circulo(5),
                new Retangulo(4, 3),
                new Triangulo(4, 5, 3),
                new Trapezio(6, 4, 3, 2, 2)
        );

        VisitorIF desenho = new DesenhoVisitor();
        VisitorIF area = new AreaVisitor();
        VisitorIF perimetro = new PerimetroVisitor();
        VisitorIF maximizar = new MaximizarVisitor();

        System.out.println(">> Desenhando:");
        figuras.forEach(f -> f.aceitar(desenho));

        System.out.println("\n>> Calculando Área:");
        figuras.forEach(f -> f.aceitar(area));

        System.out.println("\n>> Calculando Perímetro:");
        figuras.forEach(f -> f.aceitar(perimetro));


        figuras.forEach(f -> f.aceitar(maximizar));
        System.out.println("\n>> Recalculando após Maximizar:");
        figuras.forEach(f -> f.aceitar(area));
        figuras.forEach(f -> f.aceitar(perimetro));
    }
}