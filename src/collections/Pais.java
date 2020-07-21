package collections;

import java.util.Objects;

public class Pais {
    private String nombre;
    private String capital;
    private int poblacion;

    public Pais(String nombre, String capital, int poblacion) {
        this.nombre = nombre;
        this.capital = capital;
        this.poblacion = poblacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCapital() {
        return capital;
    }

    public int getPoblacion() {
        return poblacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pais)) return false;
        Pais pais = (Pais) o;
        return poblacion == pais.poblacion &&
                nombre.equals(pais.nombre) &&
                capital.equals(pais.capital);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, capital, poblacion);
    }
}
