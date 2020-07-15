package clases;

public class Circunferencia {
    protected double radio;
    private double PI = 3.14159264;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double perimetro(){
        return 2 * PI * radio;
    }

}
