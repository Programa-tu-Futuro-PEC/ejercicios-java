package jdbc.dto;

public class Personaje {
    private String a_nombre;
    private String p_nombre;
    private int p_anho;
    private String personaje;

    public Personaje(String a_nombre, String p_nombre, int p_anho, String personaje) {
        this.a_nombre = a_nombre;
        this.p_nombre = p_nombre;
        this.p_anho = p_anho;
        this.personaje = personaje;
    }

    public String getA_nombre() {
        return a_nombre;
    }

    public String getP_nombre() {
        return p_nombre;
    }

    public int getP_anho() {
        return p_anho;
    }

    public String getPersonaje() {
        return personaje;
    }
}
