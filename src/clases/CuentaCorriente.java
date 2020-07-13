package clases;

public class CuentaCorriente {

    String cliente;
    int saldo;

    public CuentaCorriente(String cliente, int saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    void deposito(int monto){
        this.saldo += monto;
    }

    void giro(int monto){
        if (monto>this.saldo)
            return;
        this.saldo -= monto;
    }

    void transferencia(int monto, CuentaCorriente destino){
        if (monto>this.saldo) return;
        this.saldo -= monto;
        destino.saldo += monto;
    }

}
