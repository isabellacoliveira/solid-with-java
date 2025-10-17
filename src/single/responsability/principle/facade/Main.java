package single.responsability.principle.facade;

import single.responsability.principle.correto.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Isabella Oliveira", 50.0, 160);

        EmployeeServiceFacade employeeService = new EmployeeServiceFacade();
        employeeService.processEmployee(employee);
    }
}
