package single.responsability.principle.correto;

public class Main {
    public static void main(String[] args) {
        // Criando um funcionário
        Employee employee = new Employee("Isabella Oliveira", 50.0, 160);

        // Calculando o salário
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        double salary = salaryCalculator.calculateSalary(employee);

        // Gerando o relatório
        ReportGenerator reportGenerator = new ReportGenerator();
        String report = reportGenerator.generateReport(employee);

        // Exibindo os resultados
        System.out.println(report);
        System.out.println("Salário calculado: R$ " + salary);
    }
}
