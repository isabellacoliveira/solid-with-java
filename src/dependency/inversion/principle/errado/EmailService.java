package dependency.inversion.principle.errado;

public class EmailService {
    public void sendEmail(String message) {
        System.out.println("Email enviado: " + message);
    }
}
