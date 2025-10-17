package single.responsability.principle.correto;

public class SalaryCalculator {
    public double calculateSalary(Employee employee) {
        return employee.getBaseSalary() * employee.getHoursWorked();
    }
}