package com.engeto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Guest {
    private String name;
    private LocalDate dateOfBirth;



    public Guest(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;

    }
    public Guest(String name) {
        this.name = name;


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
        return   name +
                ", (" + dateOfBirth + ")";
    }
}
