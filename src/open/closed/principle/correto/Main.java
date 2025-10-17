package open.closed.principle.correto;

public class Main {
    public static void main(String[] args) {
        // Criando o processador de pagamentos
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        // Processando pagamento com cartão de crédito
        Payment creditCardPayment = new CreditCardPayment();
        paymentProcessor.processPayment(creditCardPayment);

        // Processando pagamento com PayPal
        Payment payPalPayment = new PayPalPayment();
        paymentProcessor.processPayment(payPalPayment);

        // Exemplo: adicionando uma nova forma de pagamento sem alterar código existente
//        Payment pixPayment = new PixPayment();
//        paymentProcessor.processPayment(pixPayment);
    }
}
