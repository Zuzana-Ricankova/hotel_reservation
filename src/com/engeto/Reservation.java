package com.engeto;
import com.engeto.Guests;
import com.engeto.Rooms;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Reservation {
    private Rooms rooms;
    private Guests guests;


    private List<Guests> listOfGuests;

    private LocalDate dateStart;
    private LocalDate dateEnd;
    private Boolean isItLeasureTravel;



    public Reservation(Rooms rooms, Guests guests, LocalDate dateStart, LocalDate dateEnd,
                       Boolean isItLeasureTravel) {
        this.rooms = rooms;
        this.guests = guests ;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.isItLeasureTravel = isItLeasureTravel;


    }

    public Reservation(Rooms rooms, Guests guests, List<Guests> listOfGuests,LocalDate dateStart, LocalDate dateEnd,
                       Boolean isItLeasureTravel) {
        this.rooms = rooms ;
        this.guests = guests;
        this.listOfGuests = listOfGuests;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.isItLeasureTravel = isItLeasureTravel;


    }


    ///region getter

    public Rooms getRooms() {
        return rooms;
    }

    public Guests getGuests() {
        return guests;
    }

    public List<Guests> getListOfGuests() {
        return listOfGuests;
    }

    public LocalDate getDateStart() {
        return dateStart;
    }

    public LocalDate getDateEnd() {
        return dateEnd;
    }

    public Boolean getItLeasureTravel() {
        return isItLeasureTravel;
    }


    ///endregion getter

    public String toString() {
        return "Reservation: " +
                "Room: " + rooms.getNumberOFTheRoom() +
                ", Guest: " + guests.getName() +
                ", Date start: " + dateStart +
                ", Date end: " + dateEnd +
                ", Is it leasure travel: " + isItLeasureTravel +
                '.';
    }



    }
