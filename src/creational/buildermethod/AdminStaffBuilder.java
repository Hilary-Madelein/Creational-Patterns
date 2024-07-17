/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.buildermethod;
import java.time.LocalDate;
import creational.domain.AdministrativePersonal;

/**
 *
 * @author Hilary Madelein
 */

public class AdminStaffBuilder implements UniversityEntityBuilder {
    private String firstName;
    private String lastName;
    private String dui;
    private LocalDate birthDate;
    private String charge;

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

    public void buildCharge(String charge) {
        this.charge = charge;
    }

    @Override
    public AdministrativePersonal getResult() {
        return new AdministrativePersonal(firstName, lastName, dui, birthDate, charge);
    }
}