/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author NUWAA
 */
public class LeafEmployee implements Employee{
    
    String name;
    String position;
    double salary;

    public LeafEmployee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public double getSalary(boolean isTotal) {
        return this.salary;
    }
    
}
