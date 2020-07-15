package Figuras2;

public class Bicicleta implements Vehiculo{

    int posicion = 0;

    @Override
    public String desplazarse(int distancia) {
        posicion += distancia;
        return "pedaleé hasta "+posicion;
    }

    @Override
    public String detenerse() {
        return "frenando con los dos frenos como un campeon";
    }

    @Override
    public String acelerar(int velocidad) {
        return "estoy pedaleando mas juerte";
    }

    @Override
    public String tipoDeVehiculo() {
        return "Bicicleta";
    }
}
