package dependency.inversion.principle.errado;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification("Olá, aluno FIAP!");
    }
}
