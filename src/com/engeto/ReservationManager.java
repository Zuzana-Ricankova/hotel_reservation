package com.engeto;

import java.util.ArrayList;
import java.util.List;

import static com.engeto.TypeOfVacation.Working_stay;
import static com.engeto.TypeOfVacation.Recreational_stay;



public class ReservationManager {
    private List<Reservation> listOfReservation = new ArrayList<>();
    private List<Guest> listOfGuests;

    private int numberOfReservation;
    private int numberOfWorkingReservation;
    private Integer averageGuests;
    private String recreationalReservation;
    private int totalCountOfReservationWithOneGuest;
    private int totalCountOfReservationWithTwoGuests;
    private int totalCountOfReservationWithMoreThanTwoGuests;






    //add, prida nam novou rezervaci do listu
    public void addReservation(Reservation reservation){
        this.listOfReservation.add(reservation);
    }


    //get
    public List<Reservation> getListOfReservation() {
        return listOfReservation;
    }


    //clear
    public void clearReservation() {
        listOfReservation.clear();
    }


    public int getNumberOfReservation() {
        return listOfReservation.size();

    }


    //Number of working type reservation :
    public int getNumberOfWorkingReservation() {
        int count = 0;
        for (Reservation reservation : listOfReservation) {
            if (reservation.getTypeOfVacation().equals(Working_stay)){
                count++;
            }
        }
        return count;
    }



    public Integer getAverageGuests() {
        for (Reservation reservation : listOfReservation) {
            averageGuests = (reservation.getTotalNumberOfGuests())/(listOfReservation.size());
        } return averageGuests;
    }


    public String getRecreationalReservation() {
        int i = 0;
        for (Reservation reservation : listOfReservation) {
            if (reservation.getTypeOfVacation().equals(Recreational_stay) && i < 8) {
                i ++;
                {
                    System.out.println(i + " " + reservation.toString());
                }
            }
            }
        return "";
    }

//    Celkový počet rezervací s jedním hostem
    public int getTotalCountOfReservationWithOneGuest() {
        int l = 0;
        for (Reservation reservation : listOfReservation) {
            if(reservation.getNumberOfGuests() == 1 ){
                l++;
            }
        }
        return  l;
    }

//    Celkový počet rezervací se dvěma  hosty
    public int getTotalCountOfReservationWithTwoGuests(){
        int n = 0;
        for (Reservation reservation : listOfReservation) {
            if (reservation.getNumberOfGuests() == 2) {
                n++;
            }
        }
        return n;
    }

//    Celkový počet rezervací s více než dvěma  hosty
    public int getTotalCountOfReservationWithMoreThanTwoGuests() {
        int r = 0;
        for (Reservation reservation : listOfReservation) {
            if (reservation.getNumberOfGuests() > 2) {
                r++;
            }
        }
        return r;
    }

    @Override
    public String toString() {
        return "List of reservations: \n" +  listOfReservation +
                ", listOfGuests=" + listOfGuests ;
    }
}
