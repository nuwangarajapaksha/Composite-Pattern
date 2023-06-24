/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NUWAA
 */
public class CompositeEmployee implements Employee {

    String name;
    String position;
    double salary;
    List<Employee> employees = new ArrayList<>();

    public CompositeEmployee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public double getSalary(boolean isTotal) {
        double empSalary = 0.0;
        if (isTotal) {
            for (Employee employee : employees) {
                empSalary = empSalary + employee.getSalary(isTotal);
            }
        }
        empSalary = empSalary + salary;
        return empSalary;
    }
    
    public void addEmployee(Employee emp) {
        this.employees.add(emp);
    }

}
