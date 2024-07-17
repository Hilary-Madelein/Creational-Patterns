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
public class Student extends Person{

    private SocialEconomicLevel socialEconomicLevel;

    public Student(String firstName, String lastName, String dui, 
            SocialEconomicLevel socialEconomicLevel) {
        super(firstName, lastName, dui);
        this.socialEconomicLevel = socialEconomicLevel;
    }

    public Student(String firstName, String lastName, String dui, LocalDate birthDate, 
            SocialEconomicLevel socialEconomicLevel) {
        super(firstName, lastName, dui, birthDate);
        this.socialEconomicLevel = socialEconomicLevel;
    }
    
    @Override
    public void task() {
        System.out.println("SOY UN: " + this.getClass().getCanonicalName().toUpperCase() + 
            " Y RECIBO CLASES");
    }

    public SocialEconomicLevel getSocialEconomicLevel() {
        return socialEconomicLevel;
    }

    public void setSocialEconomicLevel(SocialEconomicLevel socialEconomicLevel) {
        this.socialEconomicLevel = socialEconomicLevel;
    }

    @Override
    public String toString() {
        return "Student{" 
                + super.toString() + ", "
                + "socialEconomicLevel=" 
                + socialEconomicLevel + '}';
    }

    
    
}
