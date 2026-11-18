package Zadanie_4;

public class Administrator extends Employee {
    private double systemAllowance;

    public Administrator(String name, double baseSalary, double systemAllowance) {
        super(name, baseSalary);
        this.systemAllowance = systemAllowance;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + systemAllowance;
    }
}