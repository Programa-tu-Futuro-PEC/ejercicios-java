package clases;

import clases.exception.SobregiroException;

public class Banco {
    public static void main(String[] args) {
        CuentaCorriente c1 = new CuentaCorriente("juanito", 20000, 0);
        CuentaCorriente c2 = new CuentaCorriente("pablito", 20000, 0);

        System.out.println("juanito: "+c1.getSaldo());
        System.out.println("pablito: "+c2.getSaldo());

        c1.deposito(5000);
        try {
            c2.giro(1000);
        } catch (SobregiroException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("juanito: "+c1.getSaldo());
        System.out.println("pablito: "+c2.getSaldo());

        try {
            c1.transferencia(10000, c2);
        } catch (SobregiroException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("juanito: "+c1.getSaldo());
        System.out.println("pablito: "+c2.getSaldo());
    }
}
