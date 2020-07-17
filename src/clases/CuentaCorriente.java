package clases;

import clases.exception.IllegalAmountException;
import clases.exception.SobregiroException;

public class CuentaCorriente implements Cuenta{

    private String cliente;
    private int saldo;
    private int lineaDeCredito;

    public String getCliente() {
        return cliente;
    }

    public int getSaldo() {
        return saldo;
    }

    public CuentaCorriente(String cliente, int saldo, int lineaDeCredito) {
        this.cliente = cliente;
        this.saldo = saldo;
        this.lineaDeCredito = lineaDeCredito;
    }

    @Override
    public void deposito(int monto){
        if (monto <= 0)
            throw new IllegalAmountException("Monto a depositar debe ser positivo");
        this.saldo += monto;
    }

    @Override
    public void giro(int monto) throws SobregiroException {
        if (monto <= 0)
            throw new IllegalAmountException("Monto a girar debe ser positivo");
        if (monto<=this.saldo+lineaDeCredito)
            this.saldo-=monto;
        else
            throw new SobregiroException("Monto excede linea de credito");
    }

    @Override
    public void transferencia(int monto, Cuenta destino) throws SobregiroException {
        if (monto <= 0)
            throw new IllegalAmountException("Monto a transferir debe ser positivo");
        if (monto>this.saldo+lineaDeCredito)
            throw new SobregiroException("Monto a transferir excede linea de credito");
        this.saldo -= monto;
        destino.deposito(monto);
    }

}
