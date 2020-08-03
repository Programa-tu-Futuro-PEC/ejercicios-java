package jdbc.dto;

public class Pelicula {
    private String nombre;
    private int anho;
    private double calificacion;

    public Pelicula(String nombre, int anho, double calificacion) {
        this.nombre = nombre;
        this.anho = anho;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnho() {
        return anho;
    }

    public double getCalificacion() {
        return calificacion;
    }
}
