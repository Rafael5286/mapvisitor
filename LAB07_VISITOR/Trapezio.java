public class Trapezio implements ElementoConcretoIF {
    private double baseMaior, baseMenor, altura, lado1, lado2;

    public Trapezio(double baseMaior, double baseMenor, double altura, double lado1, double lado2) throws Exception {
        if (baseMaior <= 0 || baseMenor <= 0 || altura <= 0 || lado1 <= 0 || lado2 <= 0) {
            throw new Exception("Todas as medidas devem ser maiores que zero");
        }
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(double baseMaior) throws Exception {
        if (baseMaior <= 0) {
            throw new Exception("Base maior deve ser maior que zero");
        }
        this.baseMaior = baseMaior;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) throws Exception {
        if (baseMenor <= 0) {
            throw new Exception("Base menor deve ser maior que zero");
        }
        this.baseMenor = baseMenor;
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

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) throws Exception {
        if (lado1 <= 0) {
            throw new Exception("Lado1 deve ser maior que zero");
        }
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) throws Exception {
        if (lado2 <= 0) {
            throw new Exception("Lado2 deve ser maior que zero");
        }
        this.lado2 = lado2;
    }

    @Override
    public void aceitar(VisitorIF visitor) {
        visitor.visitaTrapezio(this);
    }
}
