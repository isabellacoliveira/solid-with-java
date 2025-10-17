package single.responsability.principle.facade;

import single.responsability.principle.correto.Employee;
import single.responsability.principle.correto.ReportGenerator;
import single.responsability.principle.correto.SalaryCalculator;

public class EmployeeServiceFacade {
    private SalaryCalculator salaryCalculator;
    private ReportGenerator reportGenerator;

    public EmployeeServiceFacade() {
        this.salaryCalculator = new SalaryCalculator();
        this.reportGenerator = new ReportGenerator();
    }

    public void processEmployee(Employee employee) {
        double salary = salaryCalculator.calculateSalary(employee);
        String report = reportGenerator.generateReport(employee);

        System.out.println(report);
        System.out.println("Salário calculado: R$ " + salary);
    }
}
