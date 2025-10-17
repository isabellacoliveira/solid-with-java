package liskov.substituition.principle.correto;

public class ProcessadorDeSaques {
    public void processarSaque(ContaComum conta, double valor) {
        conta.sacar(valor);
        System.out.println("Saque processado. Saldo atual: " + conta.getSaldo());
    }
}
