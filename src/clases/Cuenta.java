package clases;

public interface Cuenta {
    public void deposito(int monto);
    public void giro(int monto);
    public void transferencia(int monto, Cuenta destino);
}
