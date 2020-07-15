package clases;

public class Circulo extends Circunferencia implements Figura{

    public Circulo(double radio) {
        super(radio);
    }

    @Override
    public double sector() {
        return 0;
    }

    @Override
    public double area() {
        return 0;
    }
}
