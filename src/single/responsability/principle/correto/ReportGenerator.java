package single.responsability.principle.correto;

public class ReportGenerator {
    public String generateReport(Employee employee) {
        return "Employee Report: " + employee.getName();
    }
}