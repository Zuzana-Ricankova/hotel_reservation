package com.engeto;

import java.util.ArrayList;
import java.util.List;

import static com.engeto.TypeOfVacation.WORKING_STAY;
import static com.engeto.TypeOfVacation.RECREATIONAL_STAY;



public class ReservationManager {
    private List<Reservation> listOfReservation = new ArrayList<>();
    private Double averageGuests;



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
            if (reservation.getTypeOfVacation().equals(WORKING_STAY)){
                count++;
            }
        }
        return count;
    }

    public double getAverageGuests(){
        double averageGuests=0;
        for(Reservation reservation : listOfReservation){
            averageGuests += Double.valueOf(reservation.getNumberOfGuests());
        }
        averageGuests = averageGuests/listOfReservation.size();
        return averageGuests;

    }

//    public Double getAverageGuests() {
//        int totalNumberOfGuests = 0;
//        for (Reservation reservation : listOfReservation) {
//            if (reservation.getNumberOfGuests() == 1) {
//                totalNumberOfGuests++;
//                if (reservation.getNumberOfGuests()==2){totalNumberOfGuests = totalNumberOfGuests +2;
//
//            }
//        }}
//
//     return averageGuests = (double) totalNumberOfGuests / listOfReservation.size();
//    }


    public String getRecreationalReservation() {
        int i = 0;
        for (Reservation reservation : listOfReservation) {
            if (reservation.getTypeOfVacation().equals(RECREATIONAL_STAY) && i < 8) {
                i ++;
                {
                    System.out.println(i + " " + reservation.toString());
                }
            }
            }
        return "";
    }

    public int getTotalCountOfReservationWithNumOfGuests(int guestCount) {
        int numberOfReservations = 0;
        for (Reservation reservation : listOfReservation) {
            if(reservation.getNumberOfGuests() == guestCount) {
                numberOfReservations++; {if (reservation.getNumberOfGuests() == guestCount && guestCount>2){
                    numberOfReservations = 0;
                }
                }
            }
        }
        return numberOfReservations;
    }


    @Override
    public String toString() {
        return "List of reservations: \n" +  listOfReservation;
    }
}
