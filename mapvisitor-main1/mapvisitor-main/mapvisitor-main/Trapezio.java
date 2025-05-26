public class Trapezio implements ElementoConcretoIF {
    double baseMaior, baseMenor, altura, lado1, lado2;

    public Trapezio(double baseMaior, double baseMenor, double altura, double lado1, double lado2) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public void aceitar(VisitorIF visitor) {
        visitor.visitaTrapezio(this);
    }
}