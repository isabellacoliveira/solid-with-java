package open.closed.principle.correto;

public class CreditCardPayment implements Payment {
    @Override
    public void process() {
        // Lógica para processar pagamento com cartão de crédito
        System.out.println("Processing credit card payment...");
    }
}
