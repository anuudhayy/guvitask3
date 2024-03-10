package com.guvi.task3;

public class Employee extends Product {
    private String name;
    private double annualSalary;

    public Employee(int pid, String name, double annualSalary) {
        super(pid, 0, 1); // Set quantity to 1 for employee
        this.name = name;
        this.annualSalary = annualSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public double calcTax() {
        return annualSalary * INCOME_TAX;
    }
}