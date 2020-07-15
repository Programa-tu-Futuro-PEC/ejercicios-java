package clases;

public class Triangulo implements Figura{

    private double ladoA ;
    private double ladoB ;
    private double ladoC ;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public double perimetro() {
        return ladoA + ladoB + ladoC;
    }

    @Override
    public double area() {
        double semiperimetro = perimetro()/2;
        return Math.sqrt(semiperimetro
                *(semiperimetro-ladoA)
                *(semiperimetro-ladoB)
                *(semiperimetro-ladoC));
    }
}
