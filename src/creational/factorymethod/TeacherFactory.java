/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.factorymethod;

import java.time.LocalDate;
import java.time.Month;
import creational.domain.Person;
import creational.domain.Teacher;

/**
 *
 * @author wduck
 */
public class TeacherFactory extends PersonFactoryMethod{

    @Override
    public Person create() {
        Teacher object = (Teacher)dataIngress(); 
        return object;
    }

    @Override
    public Person dataIngress() {
        // AquI INGRESAR INFO
        LocalDate now = LocalDate.of(1978, Month.MARCH, 27);
        Teacher s = new Teacher("Corazón", "Barriga", "1134608674", now, "Cardiológo y Gastroenterólogo");
        return s;
    }
}
