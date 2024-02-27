package com.engeto;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import java.util.ArrayList;
import java.util.List;


public class Reservation {
    private Room room;
    private List<Guest> listOfGuests;
    private LocalDate dateStart;
    private LocalDate dateEnd;
    private TypeOfVacation typeOfVacation;

    private int indexOfReservation;
    private Integer numberOfGuests;
    private long reservationLength;
    private int price;

    private Integer number;






    public Reservation(int indexOfReservation, Room room, List<Guest> listOfGuests, Integer numberOfGuests, LocalDate dateStart,
                       LocalDate dateEnd, TypeOfVacation typeOfVacation) {

        this.indexOfReservation = indexOfReservation;
        this.room = room;
        this.listOfGuests = listOfGuests;
        this.numberOfGuests = numberOfGuests;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.typeOfVacation = typeOfVacation;

    }




    public Integer getNumberOfGuests() {
        return numberOfGuests;
    }

    public int getIndexOfReservation() {
        return indexOfReservation;
    }

    public Room getRoom() {
        return room;
    }

    public List<Guest> getListOfGuests() {
        return listOfGuests;

    }

    public LocalDate getDateStart() {
        return dateStart;
    }

    public LocalDate getDateEnd() {
        return dateEnd;
    }

    public TypeOfVacation getTypeOfVacation() {
        return typeOfVacation;

    }

    /**
     * method returns total number of guests
     * @return total number of guests
     */


    public long getReservationLength() {
        long reservationLength;

        reservationLength = ChronoUnit.DAYS.between(dateStart, dateEnd);
        int number = (int) reservationLength;
        return number;
    }

    public long getPrice() {
        price = (number)*(getRoom().getPricePerNight());
        return price;
    }







    public String toString() {



        return "Reservation: " +dateStart + ", till " + dateEnd +
                ", Guest: " + listOfGuests.toString() +
                " Room: " + room.getNumberOFTheRoom() +
                ", Is it leasure travel: " + getTypeOfVacation() +
                ".\n";

    }




}









