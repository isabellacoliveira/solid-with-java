package open.closed.principle.correto;

public class PaymentProcessor {
    public void processPayment(Payment payment) {
        payment.process();
    }
}
