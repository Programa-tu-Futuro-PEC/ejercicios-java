package clases;

public class Auto {
    String marca;
    String modelo;
    String color;
    int velocidadActual;
    boolean velocidadMaxima;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public boolean isVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(boolean velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public Auto() { }

    public Auto(String marca, String modelo, String color, int velocidadActual, boolean velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidadActual = velocidadActual;
        this.velocidadMaxima = velocidadMaxima;
    }

    void encenderMotor(){
        Auto a = null;
        a.color = "verde";

        a.aumentarVelocidad(10);
        System.out.println(a.marca + " "+a.modelo);
        a.color = "verde";
        Auto b = new Auto("toyota", "yaris", "blanco", 0, false);
    }
    void frenar(){ }
    void apagarMotor(){}

    void aumentarVelocidad(int v){
        if (!velocidadMaxima){
            velocidadActual += v;
        }
    }
    


}
