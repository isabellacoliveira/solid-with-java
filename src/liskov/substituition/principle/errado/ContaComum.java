package liskov.substituition.principle.errado;

public class ContaComum {
    protected double saldo;

    public ContaComum(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}