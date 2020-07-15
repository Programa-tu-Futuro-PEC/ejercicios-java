package clases;

public class FiguraMain {
    public static void main(String[] args) {
        Cuadrado c = new Cuadrado(4);
        Triangulo t = new Triangulo(3,4,5);
        Rectangulo r = new Rectangulo(3,6);

        System.out.println(c.area());
        System.out.println(c.perimetro());
        System.out.println(t.area());
        System.out.println(t.perimetro());
        System.out.println(r.area());
        System.out.println(r.perimetro());
    }
}
