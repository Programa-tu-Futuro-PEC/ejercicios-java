package animales;

public class MAin {
    public static void main(String[] args) {
        Serpiente s = new Serpiente();
        System.out.println(s.psssssss());
        System.out.println(s.reptar());
        System.out.println(s.comer());

        Gallo g = new Gallo();
        System.out.println(g.kikiriki());
        System.out.println(g.volar());
        System.out.println(g.comer());
    }
}
