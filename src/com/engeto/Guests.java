package com.engeto;

import java.time.LocalDate;

public class Guests {
    //prvni host
    String name;
    LocalDate dateOfBirth;




    public Guests(String name, LocalDate dateOfBirth) {
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


}
