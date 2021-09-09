/**
 * @author NAE (Noah Ertz) - naertz
 * CIS-175 - Fall 2021
 * Sep 9, 2021
 */

package model;

public class Employee {
    // Instance Variable(s) =======================
    private String name;          // Name
    private double monthlySalary; // Monthly Salary
    private int age;              // Age
    // ============================================
    
    // Constructor(s) ============
    // Default
    public Employee() {
        this.name = "";
        this.monthlySalary = 0.0;
        this.age = 0;
    }
    
    // Name
    public Employee(String name) {
        this.name = name;
        this.monthlySalary = 0.0;
        this.age = 0;
    }
    // ===========================
    
    // Setter(s) =======================================
    // Name
    public void setName(String name) {
        this.name = name;
    }
    
    // Monthly Salary
    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    
    // Age
    public void setAge(int age) {
        this.age = age;
    }
    // =================================================
    
    // Getter(s) =====================
    // Name
    public String getName() {
        return name;
    }
    
    // Monthly Salary
    public double getMonthlySalary() {
        return monthlySalary;
    }
    
    // Age
    public int getAge() {
        return age;
    }
    // ===============================
}
