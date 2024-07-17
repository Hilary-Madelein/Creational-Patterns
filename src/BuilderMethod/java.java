/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BuilderMethod;

import creational.buildermethod.AdminStaffBuilder;
import creational.buildermethod.StudentBuilder;
import creational.buildermethod.TeacherBuilder;
import creational.buildermethod.UniversityEntityDirector;
import creational.domain.AdministrativePersonal;
import creational.domain.SocialEconomicLevel;
import creational.domain.Student;
import creational.domain.Teacher;
import java.time.LocalDate;

/**
 *
 * @author Star_Media
 */
public class java {
    public static void main(String[] args) {
        // Creación del director
        UniversityEntityDirector director = new UniversityEntityDirector();

        // Creación y configuración del TeacherBuilder
        TeacherBuilder teacherBuilder = new TeacherBuilder();
        director.constructTeacher(teacherBuilder, "Juan", "Betancourt", "18150510", LocalDate.of(1975, 3, 15), "Doctorado en Fisica");
        Teacher profesor = teacherBuilder.getResult();
        System.out.println("Profesor creado: " + profesor.fullName() + " con grado: " + profesor.getAcademicDegree());

        // Creación y configuración del StudentBuilder
        StudentBuilder studentBuilder = new StudentBuilder();
        director.constructStudent(studentBuilder, "Karla", "Ramirez", "87654321", LocalDate.of(1998, 6, 18), SocialEconomicLevel.HIGH);
        Student estudiante = studentBuilder.getResult();
        System.out.println("Estudiante creado: " + estudiante.fullName()+ " con nivel socieconomico: " + estudiante.getSocialEconomicLevel());

        // Creación y configuración del AdminStaffBuilder
        AdminStaffBuilder adminBuilder = new AdminStaffBuilder();
        director.constructAdminStaff(adminBuilder, "Roberto", "Gonzalez", "11112222", LocalDate.of(1980, 9, 18), "Jefe de Administracion");
        AdministrativePersonal personalAdmin = adminBuilder.getResult();
        System.out.println("Personal administrativo creado: " + personalAdmin.fullName() + " con rol: " + personalAdmin.getCharge());
    }
}