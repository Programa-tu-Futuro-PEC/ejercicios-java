package Figuras2;

public abstract class VehiculoMotorizado implements Vehiculo{
    int posicion = 0;
    int velocidad = 0;

    @Override
    public String desplazarse(int distancia) {
        posicion += distancia;
        return "me moví hasta "+posicion;
    }

    @Override
    public String detenerse() {
        velocidad = 0;
        return "me detuve";
    }

    @Override
    public String acelerar(int velocidad) {
        this.velocidad += velocidad;
        return "aceleré a "+this.velocidad+"km/h";
    }
}
