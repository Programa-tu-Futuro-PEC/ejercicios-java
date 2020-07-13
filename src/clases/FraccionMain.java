package clases;

import java.util.Scanner;

public class FraccionMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numerador fraccion 1");
        int n1 = sc.nextInt();
        System.out.println("Ingrese denominador fraccion 1");
        int d1 = sc.nextInt();
        System.out.println("Ingrese numerador fraccion 2");
        int n2 = sc.nextInt();
        System.out.println("Ingrese denominador fraccion 2");
        int d2 = sc.nextInt();
        Fraccion x = new Fraccion(n1, d1);
        Fraccion y = new Fraccion(n2, d2);
        Fraccion resultado = new Fraccion(0,0);
        System.out.println("Ingrese operación");
        sc.nextLine();
        String op = sc.nextLine();
        if (op.equals("+")) {
            resultado = x.suma(y);
        } else if (op.equals("-")) {
            resultado = x.resta(y);
        } else if (op.equals("*")) {
            resultado = x.producto(y);
        } else if (op.equals("/")) {
            resultado = x.division(y);
        } else {
            System.out.println("Opción inválida");
            System.exit(-1);
        }
        System.out.println("Resultado: "+resultado.imprimir());
    }
}
