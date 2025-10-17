package open.closed.principle.correto;

public class PayPalPayment implements Payment {
    @Override
    public void process() {
        // Lógica para processar pagamento com PayPal
        System.out.println("Processing PayPal payment...");
    }
}
