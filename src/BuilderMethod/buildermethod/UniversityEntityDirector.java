/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuilderMethod.buildermethod;
import java.time.LocalDate;
import creational.domain.SocialEconomicLevel;

/**
 *
 * @author Hilary Madelein
 */

public class UniversityEntityDirector {

    // Método para construir un Teacher utilizando un Builder
   public void constructTeacher(UniversityEntityBuilder builder, String firstName, String lastName, String dui, LocalDate birthDate, String academicDegree) {
        builder.buildFirstName(firstName);
        builder.buildLastName(lastName);
        builder.buildDUI(dui);
        builder.buildBirthDate(birthDate);
        if (builder instanceof TeacherBuilder) {
            ((TeacherBuilder) builder).buildAcademicDegree(academicDegree);
        }
    }

    // Método para construir un Student utilizando un Builder
    public void constructStudent(UniversityEntityBuilder builder, String firstName, String lastName, String dui, LocalDate birthDate, SocialEconomicLevel level) {
        builder.buildFirstName(firstName);
        builder.buildLastName(lastName);
        builder.buildDUI(dui);
        builder.buildBirthDate(birthDate);
        if (builder instanceof StudentBuilder) {
            ((StudentBuilder) builder).buildSocialEconomicLevel(level);
        }
    }

    // Método para construir un AdministrativePersonnel utilizando un Builder
    public void constructAdminStaff(UniversityEntityBuilder builder, String firstName, String lastName, String dui, LocalDate birthDate, String charge) {
        builder.buildFirstName(firstName);
        builder.buildLastName(lastName);
        builder.buildDUI(dui);
        builder.buildBirthDate(birthDate);
        if (builder instanceof AdminStaffBuilder) {
            ((AdminStaffBuilder) builder).buildCharge(charge);
        }
    }
}

