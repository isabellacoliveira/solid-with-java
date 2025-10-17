package liskov.substituition.principle.correto;

public class ContaPremium extends ContaComum {
    public ContaPremium(double saldoInicial) {
        super(saldoInicial);
    }
    // Não sobrescreve o método sacar para manter o comportamento esperado
}
