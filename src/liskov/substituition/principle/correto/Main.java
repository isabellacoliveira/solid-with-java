package liskov.substituition.principle.correto;

public class Main {
    public static void main(String[] args) {
        ContaComum contaComum = new ContaComum(1000);
        ContaComum contaPremium = new ContaPremium(1000);

        ProcessadorDeSaques processador = new ProcessadorDeSaques();

        // Processando saque para ContaComum
        processador.processarSaque(contaComum, 200);  // Saída: Saque processado. Saldo atual: 800.0

        // Processando saque para ContaPremium
        processador.processarSaque(contaPremium, 200);  // Saída: Saque processado. Saldo atual: 800.0
    }
}