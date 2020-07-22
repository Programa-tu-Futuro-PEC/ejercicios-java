package collections;

import java.util.List;

public class Persona {

    private String nombre;
    private List<Persona> amigos;
    private Pais origen;

    public Persona(String nombre, List<Persona> amigos) {
        this.nombre = nombre;
        this.amigos = amigos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Persona> getAmigos() {
        return amigos;
    }

    public void setAmigos(List<Persona> amigos) {
        this.amigos = amigos;
    }

    public void borrarAmigo(Persona p){
        this.amigos.remove(p);
    }

}
