package entities;

public class Employee {

    private String name;
    private double grossSalary;
    private double tax;

    public Employee(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public double netSalary () {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * (percentage / 100.0);
    }

    public void displayInfo() {
        System.out.println("Nome: " + name);
        System.out.println("Salario Bruto: " + grossSalary);
        System.out.println("Salario Liquido: " + netSalary());
    }
}
