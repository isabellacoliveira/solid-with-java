package dependency.inversion.principle.correto;

public class EmailService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("Email enviado: " + message);
    }
}
