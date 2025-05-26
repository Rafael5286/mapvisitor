public class Triangulo implements ElementoConcretoIF {
    private double base, altura, lado1, lado2;

    public Triangulo(double base, double altura, double lado1, double lado2) throws Exception {
        if (base <= 0 || altura <= 0 || lado1 <= 0 || lado2 <= 0) {
            throw new Exception("Todos os lados e altura devem ser maiores que zero");
        }
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) throws Exception {
        if (base <= 0) {
            throw new Exception("Base deve ser maior que zero");
        }
        this.base = base;
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
        visitor.visitaTriangulo(this);
    }
}
