package clases;

public class Circulo extends Circunferencia implements Figura{

    public Circulo(double radio) {
        super(radio);
    }

    public double area(){
        return Math.PI * Math.pow(this.radio,2);
    }

}
