/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structural.Composite.Department;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL 7550
 */
public class HeadDepartment extends Department {

    private final List<Department> childDepartments;

    public HeadDepartment(Integer id, String name) {
        super(id, name);
        this.childDepartments = new ArrayList<>();
    }

    @Override
    public void printDepartmentName() {
        super.printDepartmentName();
        childDepartments.forEach(Department::printDepartmentName);
    }

    public void addDepartment(Department department) {
        childDepartments.add(department);
    }

    public void removeDepartment(Department department) {
        childDepartments.remove(department);
    }
}
