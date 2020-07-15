package Figuras2;

public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Auto();
        Vehiculo v2 = new Camion();
        Vehiculo v3 = new Bicicleta();
        Moto v4 = new Moto();

        System.out.println(v1.tipoDeVehiculo());
        System.out.println(v1.desplazarse(25));

        System.out.println(v4.tipoDeVehiculo());
        System.out.println(v4.pirueta());

        System.out.println(v2.tipoDeVehiculo());
        System.out.println(v2.acelerar(10));

        System.out.println(v3.tipoDeVehiculo());
        System.out.println(v3.detenerse());
    }
}
