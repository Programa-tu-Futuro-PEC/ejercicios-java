package collections;

import Figuras2.Auto;
import Figuras2.Bicicleta;
import Figuras2.Camion;
import Figuras2.Vehiculo;

import java.util.*;

public class Listas {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        Vehiculo v1 = new Auto();
        Vehiculo v2 = new Bicicleta();
        Vehiculo v3 = new Camion();
        Map<String, Vehiculo> diccionarioVehiculos = new HashMap<>();
        diccionarioVehiculos.put("Auto", v1);
        diccionarioVehiculos.put("Bicicleta", v2);
        diccionarioVehiculos.put("Camion", v3);

        System.out.println(diccionarioVehiculos.get("Bicicleta").acelerar(20));

        for (String llave : diccionarioVehiculos.keySet()) {
            System.out.println(llave);
            System.out.println(diccionarioVehiculos.get(llave));
        }

        //vehiculos.add(v1);
        //vehiculos.add(v2);
        //vehiculos.add(v3);
        //System.out.println(vehiculos.get(1).tipoDeVehiculo());
        //System.out.println(vehiculos.get(2).detenerse());

        //for (Vehiculo v: vehiculos) {
        //    System.out.println(v.acelerar(10));
        //}
    }
}
