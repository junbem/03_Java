package com.ohgiraffers.hw1.model.dto;

import java.io.Serializable;
public class EmployeeDTO extends PersonDTO{
    private int salary;
    private String dept;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String name, int age, double height, double weight, int salary, String dept) {
        super(name,age, height, weight);
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "name='" + name + '\'' +
                "age =" + getAge() + '\'' +
                "height=" + getHeight() + '\'' +
                "weight=" + getWeight() + '\'' +
                "salary=" + salary +
                ", dept='" + dept + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
