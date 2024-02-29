package com.engeto;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;


public class Reservation {
    private Room room;
    private List<Guest> listOfGuests;
    private Guest anotherGuest;
    private LocalDate dateStart;
    private LocalDate dateEnd;
    private TypeOfVacation typeOfVacation;
    private int indexOfReservation;
    private int price;
    private int guestCount;


    public Reservation(int indexOfReservation, Room room, List<Guest> listOfGuests, Guest anotherGuest, LocalDate dateStart,
                       LocalDate dateEnd, TypeOfVacation typeOfVacation, int guestCount) {

        this.indexOfReservation = indexOfReservation;
        this.room = room;
        this.listOfGuests = listOfGuests;
        this.anotherGuest = anotherGuest;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.typeOfVacation = typeOfVacation;
        this.guestCount = guestCount;

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

    public Guest getAnotherGuest() {
        return anotherGuest;
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

    public int getPrice() {
        price = ((int)getReservationLength())*(getRoom().getPricePerNight());
        return price;
    }

    public int getNumberOfGuests(){
        return guestCount;

    }


    public String toString() {
        String isRoomSeaView = null;
        if(room.getSea().equals(true))  isRoomSeaView = "ano";


        return  dateStart + " až " + dateEnd + ": " +
                 listOfGuests.toString() +
                "[" + room.getNumberOFTheRoom() + ", " + isRoomSeaView + "]" + " za " + getPrice() + " Kč" +
                ".\n";

    }




}









