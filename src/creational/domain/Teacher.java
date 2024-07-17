/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.domain;

import java.time.LocalDate;

/**
 *
 * @author wduck
 */
public class Teacher extends Person{
    
    private String academicDegree;

    public Teacher(String firstName, String lastName, String dui, String academicDegree) {
        super(firstName, lastName, dui);
        this.academicDegree = academicDegree;
    }

    public Teacher(String firstName, String lastName, String dui, LocalDate birthDate, String academicDegree) {
        super(firstName, lastName, dui, birthDate);
        this.academicDegree = academicDegree;
    }

    @Override
    public void task() {
        System.out.println("SOY UN: " + this.getClass().getCanonicalName().toUpperCase() + 
            " E IMPARTO CLASES");
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    @Override
    public String toString() {
        return  super.toString() + ", "
                + "academicDegree=" + academicDegree + '}';
    }

    
    
}
