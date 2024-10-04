package com.example.prototype;

import java.util.List;
import java.util.Map;

public class Employee implements Cloneable {
    public String name;
    public String designation;
    public List<String> skills;
    public Map<String, Integer> experience;

    public Employee() {
    }

    public Employee(String name, String designation, List<String> skills, Map<String, Integer> experience) {
        this.name = name;
        this.designation = designation;
        this.skills = skills;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", skills=" + skills +
                ", experience=" + experience +
                '}';
    }

    @Override
    public Employee clone() {
        Employee employee = new Employee();
        employee.name = this.name;
        employee.designation = this.designation;
        employee.skills = List.copyOf(this.skills); // make sure to create a copy of the objects
        employee.experience = Map.copyOf(this.experience);

        return employee;
    }
}
