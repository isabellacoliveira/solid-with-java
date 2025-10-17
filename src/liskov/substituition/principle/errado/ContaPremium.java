package liskov.substituition.principle.errado;

public class ContaPremium extends ContaComum {
    public ContaPremium(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }
}
