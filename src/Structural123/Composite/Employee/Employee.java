/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structural123.Composite.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL 7550
 */
public class Employee {

    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;
// constructor

    public Employee(String name, String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return name + "  $" + salary + " " + dept;
    }
}
