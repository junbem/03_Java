package com.ohgiraffers.hw1.model.dto;

import java.io.Serializable;

public class StudentDTO extends PersonDTO {
    private int grade;
    private String major;

    public StudentDTO() {
    }

    public StudentDTO(String name,int age, double height, double weight, String major, int grade) {
        super(name,age, height, weight);
        this.name = name;
        this.major = major;
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "name='" + name + '\'' +
                ", age=" + getAge() +
                ", height=" + getHeight() +
                ", weight=" + getWeight() +
                ", major='" + major + '\'' +
                ", grade=" + grade +
                '}';
    }

}
