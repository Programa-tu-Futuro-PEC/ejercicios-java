import java.util.Scanner;

public class X {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese su edad : ");
        int edad = in.nextInt();
        System.out.println("Ingrese su Salario : ");
        int Salario = in.nextInt();
        int bonificacion = in.nextInt();
        if (edad <16) {
            bonificacion = 0;
        }else {
            if (edad >= 19 && edad <= 50) {
                bonificacion = Salario * 5 / 100;
            }
            if (edad >= 51 && edad <= 60) {
                bonificacion = Salario * 10 / 100;
            }
            if (edad > 60) {
                bonificacion = Salario * 15 / 100;
            }
            System.out.println("Edad : " + edad);
            System.out.println("Salario : " + Salario);
            System.out.println("Bonificacion : " + bonificacion);
            System.out.println("Salario Bonificado : " + Salario + bonificacion);
        }
    }
}
