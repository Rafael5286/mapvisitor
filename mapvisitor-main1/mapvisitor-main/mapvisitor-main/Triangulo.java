public class Triangulo implements ElementoConcretoIF {
    double base, altura, lado1, lado2;

    public Triangulo(double base, double altura, double lado1, double lado2) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public void aceitar(VisitorIF visitor) {
        visitor.visitaTriangulo(this);
    }
}