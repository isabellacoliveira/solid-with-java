package dependency.inversion.principle.correto;

public class NotificationService {
    private EmailService emailService;

    public NotificationService() {
        this.emailService = new EmailService();
    }

    public void sendNotification(String message) {
        emailService.sendEmail(message);
    }
}