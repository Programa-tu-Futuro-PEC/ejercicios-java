package clases;

import clases.exception.SobregiroException;

public interface Cuenta {
    public void deposito(int monto);
    public void giro(int monto) throws SobregiroException;
    public void transferencia(int monto, Cuenta destino) throws SobregiroException;
}
