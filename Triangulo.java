public class Triangulo implements ElementoConcretoIF {
    double base, altura, lado;

    public Triangulo(double base, double altura, double lado) {
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    @Override
    public void aceitar(VisitorIF visitor) {
        visitor.visitar(this);
    }
}