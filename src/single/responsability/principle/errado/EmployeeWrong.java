package single.responsability.principle.errado;

public class EmployeeWrong {
    private String name;
    private double baseSalary;
    private int hoursWorked;

    // Constructor
    public EmployeeWrong(String name, double baseSalary, int hoursWorked) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.hoursWorked = hoursWorked;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    // Method to calculate salary
    public double calculateSalary() {
        return baseSalary * hoursWorked;
    }

    // Method to generate report
    public String generateReport() {
        return "Employee Report: " + name;
    }
}