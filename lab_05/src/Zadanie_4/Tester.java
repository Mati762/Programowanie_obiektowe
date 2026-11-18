package Zadanie_4;

public class Tester extends Employee {
    private int hourlyOvertime;
    private double overtimeRate;

    public Tester(String name, double baseSalary, int hourlyOvertime, double overtimeRate) {
        super(name, baseSalary);
        this.hourlyOvertime = hourlyOvertime;
        this.overtimeRate = overtimeRate;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + (hourlyOvertime * overtimeRate);
    }
}