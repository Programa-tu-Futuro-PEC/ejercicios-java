package clases;

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
        this.saldo += monto;
    }

    @Override
    public void giro(int monto) {
        if (girosPorMes>0){
            if (monto<=saldo){
                girosPorMes--;
                saldo -= monto;
            }
        }
    }

    @Override
    public void transferencia(int monto, Cuenta destino) {
        if (monto<=saldo){
            saldo -= monto;
            destino.deposito(monto);
        }
    }
}
