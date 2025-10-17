package principle.segregationInterface.errado;

public class Main {
    public static void main(String[] args) {
        Trabalhador funcionario = new Funcionario();
        funcionario.trabalhar();
        funcionario.comer();
        funcionario.dormir();

        Trabalhador robot = new Robots();
        robot.trabalhar();

        try {
            robot.comer();
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }

        try {
            robot.dormir();
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
