/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.domain;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

/**
 *
 * @author wduck
 */
public abstract class Person {
    
    private String uuid;
    private String firstName;
    private String lastName;
    private String dui;
    private LocalDate birthDate;


    public Person(String firstName, String lastName, String dui) {
        uuid= UUID.randomUUID().toString();   
        this.firstName = firstName;
        this.lastName = lastName;
        this.dui = dui;
        this.birthDate = LocalDate.now();
        
    }
    
    public Person(String firstName, String lastName, String dui, LocalDate birthDate) {
        this(firstName, lastName, dui);
        this.birthDate = birthDate;
    }
    
    public String fullName(){
        return lastName + " " + firstName;
    }
    
    public abstract void task();
    
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.uuid);
        hash = 17 * hash + Objects.hashCode(this.firstName);
        hash = 17 * hash + Objects.hashCode(this.lastName);
        hash = 17 * hash + Objects.hashCode(this.birthDate);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (!Objects.equals(this.uuid, other.uuid)) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        return Objects.equals(this.birthDate, other.birthDate);
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + " {" + "uuid=" + uuid + ", firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate + '}';
    }
   
}
