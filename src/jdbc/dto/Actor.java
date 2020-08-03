package jdbc.dto;

public class Actor {
    private String nombre;
    private char genero;

    public Actor(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero.charAt(0);
    }

    public String getNombre() {
        return nombre;
    }

    public char getGenero() {
        return genero;
    }
}
