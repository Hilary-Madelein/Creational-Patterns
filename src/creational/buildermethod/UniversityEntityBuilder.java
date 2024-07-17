/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package creational.buildermethod;

import creational.domain.Person;
import java.time.LocalDate;

/**
 *
 * @author Hilary Madelein
 */

public interface UniversityEntityBuilder {
    void buildFirstName(String firstName);
    void buildLastName(String lastName);
    void buildDUI(String dui);
    void buildBirthDate(LocalDate birthDate);
    Person getResult();
}