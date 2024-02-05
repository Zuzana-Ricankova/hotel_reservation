import com.engeto.Guests;
import com.engeto.Reservation;
import com.engeto.Rooms;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //region Pokoje

        Rooms room1 = new Rooms(1, 1, true,
                        true, 1000);
        Rooms room2 = new Rooms(2, 1, true,
                        true, 1000);
        Rooms room3 = new Rooms(3, 3, false,
                        true, 2400);

        List<Rooms> listOfRooms = new ArrayList<>();
        listOfRooms.add(room1);
        listOfRooms.add(room2);
        listOfRooms.add(room3);

        for (Rooms rooms : listOfRooms){
            System.out.print("Room number " + rooms.getNumberOFTheRoom() + ", ");
            System.out.print("numbers of beds are " + rooms.getBeds() + ", ");
            System.out.print("room has balcony: " + rooms.getBalcony() + ", ");
            System.out.print("room has the sea view: " + rooms.getSea() + ", ");
            System.out.println("room's price: "+ rooms.getPricePerNight() + " CZK.");
        }

        //endregion Pokoje

        //region Hosté

        Guests firstGuest = new Guests("Adéla Malíková",
                LocalDate.of(1993, 3, 13));
        Guests secondGuest = new Guests("Jan Dvořáček",
                LocalDate.of(1995, 5, 5));
        List<Guests> listOfGuests = new ArrayList<>();
        listOfGuests.add(firstGuest);
        listOfGuests.add(secondGuest);


        for (Guests guests : listOfGuests) {
            System.out.print(guests.getName());
            System.out.println(" (" + guests.getDateOfBirth() + ") ");

        }

        //endregion Hosté

        //Rezervace
        Reservation reservation1 = new Reservation (room1,firstGuest, LocalDate.of(2021, 7, 19),
                LocalDate.of(2021, 7, 21), true);

        System.out.println(reservation1.toString());

        //nejde mi ulozit druheho hosta ze seznamu:
        Reservation reservation2 = new Reservation(room3, firstGuest, listOfGuests.get(1), LocalDate.of(2021, 9, 1),
                LocalDate.of(2021, 9, 14), true);






        //List<Reservation> listOfReservation = new ArrayList<>();
        //listOfReservation.add(reservation1);

        //for (Reservation reservation : listOfReservation) {
            //System.out.print(reservation.getRoom());
           // System.out.println(" (" + reservation.getDateOfBirth() + ") ");

        }















        }
