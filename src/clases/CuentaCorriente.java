package clases;

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
        this.saldo += monto;
    }

    @Override
    public void giro(int monto){
        if (monto<=this.saldo+lineaDeCredito)
            this.saldo-=monto;
    }

    @Override
    public void transferencia(int monto, Cuenta destino) {
        if (monto>this.saldo+lineaDeCredito) return;
        this.saldo -= monto;
        destino.deposito(monto);
    }

}
