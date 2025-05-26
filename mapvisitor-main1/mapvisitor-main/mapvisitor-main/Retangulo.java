public class Retangulo implements ElementoConcretoIF {
    double largura, altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public void aceitar(VisitorIF visitor) {
        visitor.visitaRetangulo(this);
    }
}
