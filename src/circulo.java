class Circulo extends Figura {
    private double radio;
    final double PI = Math.PI;

    public Circulo() {
    }

    Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        return PI * radio * radio;
    }

    @Override
    double calcularPerimetro() {
        return 2 * PI * radio;
    }

    @Override
    public String toString() {
        return "Circulo [radio=" + radio + "]";
    }
}
