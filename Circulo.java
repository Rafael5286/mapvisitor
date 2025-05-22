public class Circulo implements ElementoConcretoIF {
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void aceitar(VisitorIF visitor) {
        visitor.visitar(this);
    }
}
