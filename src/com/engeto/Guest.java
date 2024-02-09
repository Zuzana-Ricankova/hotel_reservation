package com.engeto;

import java.time.LocalDate;

public class Guest {
    //prvni host
     String name;
    LocalDate dateOfBirth;




    public Guest(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;

    }



    ///region getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    ///endregion getter and setter


    @Override
    public String toString() {
        return "name: " + name +
                ", date of birth: " + dateOfBirth ;
    }
}
