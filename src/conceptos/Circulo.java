package conceptos;

public class Circulo extends FiguraGeometrica {

    private double radio;
    final double PI = 3.1416;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        double area = 0.0D;
        area = PI * (Math.pow(radio, 2));
        return area;
    }

    @Override
    public double perimetro() {
        double perimetro = 0.0;
        perimetro = PI * 2 * radio;
        return perimetro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
