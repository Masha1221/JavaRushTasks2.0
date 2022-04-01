package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Student extends UniversityPerson {

public class Student extends Human {

  


  

    private List<Human> children = new ArrayList<>();



    private double averageGrade;
 
    private Date beginningOfSession;
    private Date endOfSession;

    private int course;

    public Student(String name, int age, double averageGrade) {
        super(name, age);

    public Student(String name, int age, double averageGrade) {
        super(false);
        this.name = name;
        this.age = age;

        this.averageGrade = averageGrade;
    }




    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }



    public void live() {
        learn();
    }

    public void learn() {
    }

    public String getPosition() {
        return "Студент";
    }

    public void incAverageGrade(double delta) {
        setAverageGrade(getAverageGrade() + delta);
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public void setBeginningOfSession(Date date) {
        beginningOfSession = date;
    }

    public void setEndOfSession(Date date) {
        endOfSession = date;
    }

    public double getAverageGrade() {
        return averageGrade;
    }


    public int getCourse() {
        return course;
    }

}