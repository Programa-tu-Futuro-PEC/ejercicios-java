package clases;

public class Rectangulo implements Figura{

    private double ladoA;
    private double ladoB;

    public Rectangulo(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    @Override
    public double perimetro() {
        return 2*ladoA + 2*ladoB;
    }

    @Override
    public double area() {
        return ladoA * ladoB;
    }
}
