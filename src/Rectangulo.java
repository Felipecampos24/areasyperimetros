class Rectangulo extends Figura {
    private double base;
    private double altura;

    Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return base * altura;
    }

    @Override
    double calcularPerimetro() {
        return (2 * base) + (2 * altura);
    }

    @Override
    public String toString() {
        return "Rectangulo [base=" + base + ", altura=" + altura + "]";
    }
}
