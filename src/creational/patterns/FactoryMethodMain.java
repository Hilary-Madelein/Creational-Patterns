/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package creational.patterns;

import creational.domain.Person;
import creational.factorymethod.AdministrativePersonalFactory;
import creational.factorymethod.PersonFactoryMethod;
import creational.factorymethod.StudentFactory;
import creational.factorymethod.TeacherFactory;

/**
 *
 * @author wduck
 */
public class FactoryMethodMain {

    public static void main(String[] args) {
       
        System.out.println("Hello World!");
        
        PersonFactoryMethod personFactory;
        //personFactory = new TeacherFactory();
        //personFactory = new StudentFactory();
        personFactory = new AdministrativePersonalFactory();
        
        Person object = personFactory.create();
        System.out.println(object.toString());
        System.out.println();
        System.out.println(object.fullName());
        object.task();
        
    }
}
