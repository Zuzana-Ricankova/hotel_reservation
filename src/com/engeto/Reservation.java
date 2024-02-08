package com.engeto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.engeto.TypeOfVacation;
import static com.engeto.TypeOfVacation.Recreational_stay;
import static com.engeto.TypeOfVacation.Working_stay;
import com.engeto.Guest;
import com.engeto.Room;


public class Reservation {
    private Room room;
    private Guest guest;

    private List<Guest> listOfGuests;

    private LocalDate dateStart;
    private LocalDate dateEnd;
    private TypeOfVacation typeOfVacation;

    public Reservation(Room room, List<Guest> listOfGuests, LocalDate dateStart,
                       LocalDate dateEnd, TypeOfVacation typeOfVacation) {
        this.room = room;
        this.listOfGuests = listOfGuests;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.typeOfVacation = typeOfVacation;
    }


    ///region getter

    public Room getRoom() {
        return room;
    }

    public Guest getGuest() {
        return guest;
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


    ///endregion getter


}









