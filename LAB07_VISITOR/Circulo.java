public class Circulo implements ElementoConcretoIF {
    private double raio;

    public Circulo(double raio) throws Exception {
        if (raio <= 0) {
            throw new Exception("Raio deve ser maior que zero");
        }
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) throws Exception {
        if (raio <= 0) {
            throw new Exception("Raio deve ser maior que zero");
        }
        this.raio = raio;
    }

    @Override
    public void aceitar(VisitorIF visitor) {
        visitor.visitaCirculo(this);
    }
}
