package clases;

import clases.exception.IllegalAmountException;
import clases.exception.SobregiroException;

public class CuentaVista implements Cuenta{

    private int saldo;
    private String Cliente;
    private int girosPorMes;

    public CuentaVista(int saldo, String cliente, int girosPorMes) {
        this.saldo = saldo;
        Cliente = cliente;
        this.girosPorMes = girosPorMes;
    }

    @Override
    public void deposito(int monto) {
        if (monto <= 0)
            throw new IllegalAmountException("Monto a depositar debe ser positivo");
        this.saldo += monto;
    }

    @Override
    public void giro(int monto) throws SobregiroException {
        if (monto <= 0)
            throw new IllegalAmountException("Monto a girar debe ser positivo");
        if (girosPorMes>0){
            if (monto<=saldo){
                girosPorMes--;
                saldo -= monto;
            } else {
                throw new SobregiroException("Monto a girar excede el saldo");
            }
        }
    }

    @Override
    public void transferencia(int monto, Cuenta destino) throws SobregiroException {
        if (monto <= 0)
            throw new IllegalAmountException("Monto a transferir debe ser positivo");
        if (monto<=saldo){
            saldo -= monto;
            destino.deposito(monto);
        } else {
            throw new SobregiroException("Monto a transferir excede saldo");
        }
    }
}
