/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structural.Composite.Department;

import Demo.Demo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL 7550
 */
public class CompositeDemo2 extends Demo {

    public static void main(String args[]) {
        new CompositeDemo2().run();
    }

    @Override
    public void run() {
        ArrayList<Department> allHead = new ArrayList<>();
        ArrayList<Department> allHR = new ArrayList<>();
        ArrayList<Department> allFinance = new ArrayList<>();
        int i = 0;
        final HeadDepartment CEO = new HeadDepartment(i++, "CEO");
        HeadDepartment hrHead = new HeadDepartment(i++, "HR International");
        HeadDepartment finHead = new HeadDepartment(i++, "Finance International");

        Department hr1 = new HRDepartment(i++, "HR Brazil");
        Department hr2 = new HRDepartment(i++, "HR USA");
        Department hr3 = new HRDepartment(i++, "HR Egypt");
        Department fin1 = new FinancialDepartment(i++, "Finance Brazil");
        Department fin2 = new FinancialDepartment(i++, "Finance USA");
        Department fin3 = new FinancialDepartment(i++, "Finance Egypt");

        allHead.addAll(List.of(hrHead, finHead));
        allHR.addAll(List.of(hr1, hr2, hr3));
        allFinance.addAll(List.of(fin1, fin2, fin3));

        for (Department d : allHead) {
            CEO.addDepartment(d);
        }
        for (Department d : allHR) {
            hrHead.addDepartment(d);
        }
        for (Department d : allFinance) {
            finHead.addDepartment(d);
        }

        CEO.printDepartmentName();

    }
}
