package clases;

public class Banco {
    public static void main(String[] args) {
        CuentaCorriente c1 = new CuentaCorriente("juanito", 30000);
        CuentaCorriente c2 = new CuentaCorriente("pablito", 10000);

        System.out.println("juanito: "+c1.getSaldo());
        System.out.println("pablito: "+c2.getSaldo());

        c1.deposito(5000);
        c2.giro(1000);

        System.out.println("juanito: "+c1.getSaldo());
        System.out.println("pablito: "+c2.getSaldo());

        c1.transferencia(10000, c2);

        System.out.println("juanito: "+c1.getSaldo());
        System.out.println("pablito: "+c2.getSaldo());
    }
}
