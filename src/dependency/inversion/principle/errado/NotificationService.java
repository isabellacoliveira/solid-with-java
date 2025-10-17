package dependency.inversion.principle.errado;

public class NotificationService {
    private EmailService emailService;

    public NotificationService() {
        this.emailService = new EmailService();
    }

    public void sendNotification(String message) {
        emailService.sendEmail(message);
    }
}
