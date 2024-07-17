/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuilderMethod.buildermethod;

import creational.domain.Teacher;

import java.time.LocalDate;

/**
 *
 * @author Hilary Madelein
 */
public class TeacherBuilder implements UniversityEntityBuilder {
    private String firstName;
    private String lastName;
    private String dui;
    private LocalDate birthDate;
    private String academicDegree;

    @Override
    public void buildFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void buildLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void buildDUI(String dui) {
        this.dui = dui;
    }

    @Override
    public void buildBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    
    public void buildAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }


    @Override
    public Teacher getResult() {
        return new Teacher(firstName, lastName, dui, birthDate, academicDegree);
    }
}