/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuilderMethod.buildermethod;
import creational.domain.SocialEconomicLevel;
import java.time.LocalDate;
import creational.domain.Student;

/**
 *
 * @author Hilary Madelein
 */
public class StudentBuilder implements UniversityEntityBuilder {
    private String firstName;
    private String lastName;
    private String dui;
    private LocalDate birthDate;
    private SocialEconomicLevel socialEconomicLevel;

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
    
    public void buildSocialEconomicLevel(SocialEconomicLevel socialEconomicLevel) {
        this.socialEconomicLevel = socialEconomicLevel;
    }

    @Override
    public Student getResult() {
        return new Student(firstName, lastName, dui, birthDate, socialEconomicLevel);
    }
}