package clases;

public class Cliente {

    private String rut;
    private String email;
    private int telefono;
    private String domicilio;
    private boolean preferencial;
    private int edad;

    public Cliente(String rut, String email, int telefono, String domicilio, boolean preferencial, int edad) {
        this.rut = rut;
        this.email = email;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.preferencial = preferencial;
        this.edad = edad;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRut() {
        return rut;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public boolean isPreferencial() {
        return preferencial;
    }

    public int getEdad() {
        return edad;
    }
}
