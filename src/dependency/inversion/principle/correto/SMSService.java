package dependency.inversion.principle.correto;

public class SMSService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS enviado: " + message);
    }
}
