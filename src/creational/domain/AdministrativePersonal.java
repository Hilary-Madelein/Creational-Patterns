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
public class AdministrativePersonal extends Person{

    private String charge;            

    public AdministrativePersonal(String firstName, String lastName, String dui, String charge) {
        super(firstName, lastName, dui);
        this.charge = charge;
    }

    public AdministrativePersonal(String firstName, String lastName, String dui, 
            LocalDate birthDate, String charge) {
        super(firstName, lastName, dui, birthDate);
        this.charge = charge;
    }
    
    
    
    @Override
    public void task() {
        System.out.println("SOY UN: " + this.getClass().getName().toUpperCase() + 
            " Y GESTIONO A LOS MIEMBORS DE LAS IES");    
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    @Override
    public String toString() {
        return "AdministrativePersonal{"
                + super.toString() + ", "
                + "charge=" + charge + '}';
    }
    
    
}
