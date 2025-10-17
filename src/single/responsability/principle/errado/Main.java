package single.responsability.principle.errado;

public class Main {
    public static void main(String[] args) {
        // Criando um funcionário
        EmployeeWrong employee = new EmployeeWrong("Isabella Oliveira", 50.0, 160);

        // Calculando o salário
        double salary = employee.calculateSalary();

        // Gerando o relatório
        String report = employee.generateReport();

        // Exibindo os resultados
        System.out.println(report);
        System.out.println("Salário calculado: R$ " + salary);
    }
}
