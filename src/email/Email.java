package email;

public class Email {
    private String nombre;
    private String direccion;
    private String ultimoMensaje;
    private String contrasenha;

    public Email(String nombre, String direccion, String contrasenha) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.contrasenha = contrasenha;
    }

    public Email() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getUltimoMensaje() {
        return ultimoMensaje;
    }

    public void setUltimoMensaje(String ultimoMensaje) {
        this.ultimoMensaje = ultimoMensaje;
    }

    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
    }

    public void enviar(String mensaje, Email destino){
        destino.recibir(mensaje);
    }

    public void recibir(String mensaje){
        this.ultimoMensaje = mensaje;
    }

    public void leer(){
        System.out.println(this.ultimoMensaje);
    }
    
    public Email copia(){
        Email copia = new Email();
        copia.nombre = this.nombre;
        copia.direccion = this.direccion;
        copia.contrasenha = this.contrasenha;
        copia.ultimoMensaje = this.ultimoMensaje;
        return copia;
    }

}
