import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ingrese una nota");
        double n1 = Double.parseDouble(in.nextLine());
        if (!(n1>=1 && n1<=7)) {
            System.out.println("nota invalida");
            System.exit(0);
        }
        System.out.println("ingrese una nota");
        double n2 = Double.parseDouble(in.nextLine());//(double) "2.0"
        if (n2 < 1 || n2 > 7) {
            System.out.println("nota invalida");
            System.exit(-1);
        }
        System.out.println("ingrese una nota");
        double n3 = Double.parseDouble(in.nextLine());
        if (n3 < 1 || n3 > 7) {
            System.out.println("nota invalida");
            System.exit(-1);
        }
        double promedio = (n1 + n2 + n3) / 3.0;
        if (promedio >= 4) {
            System.out.println("pasaste");
        } else {
            System.out.println("rip");
        }

    }

    public int mediano(int x, int y, int z){
        return 0;
    }

}
