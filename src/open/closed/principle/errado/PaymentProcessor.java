package open.closed.principle.errado;

public class PaymentProcessor {
    public void processPayment(String paymentType) {
        if (paymentType.equals("creditCard")) {
            // Lógica para processar pagamento com cartão de crédito
            System.out.println("Processing credit card payment...");
        } else if (paymentType.equals("paypal")) {
            // Lógica para processar pagamento com PayPal
            System.out.println("Processing PayPal payment...");
        }
    }
}