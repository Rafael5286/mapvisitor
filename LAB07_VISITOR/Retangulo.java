public class Retangulo implements ElementoConcretoIF {
    private double largura, altura;

    public Retangulo(double largura, double altura) throws Exception {
        if (largura <= 0 || altura <= 0) {
            throw new Exception("Largura e altura devem ser maiores que zero");
        }
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) throws Exception {
        if (largura <= 0) {
            throw new Exception("Largura deve ser maior que zero");
        }
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) throws Exception {
        if (altura <= 0) {
            throw new Exception("Altura deve ser maior que zero");
        }
        this.altura = altura;
    }

    @Override
    public void aceitar(VisitorIF visitor) {
        visitor.visitaRetangulo(this);
    }
}
