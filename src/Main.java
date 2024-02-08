import com.engeto.Guest;
import com.engeto.Reservation;
import com.engeto.Room;
import com.engeto.TypeOfVacation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static com.engeto.TypeOfVacation.Recreational_stay;
import static com.engeto.TypeOfVacation.Working_stay;

public class Main {
    public static void main(String[] args) {

        //Pokoje:
        Room room1 = new Room(1, 1, true,
                true, 1000);
        Room room2 = new Room(2, 1, true,
                true, 1000);
        Room room3 = new Room(3, 3, false,
                true, 2400);

        List<Room> listOfRooms = new ArrayList<>();
        listOfRooms.add(room1);
        listOfRooms.add(room2);
        listOfRooms.add(room3);

        for (Room room : listOfRooms) {
            System.out.print("Room number " + room.getNumberOFTheRoom() + ", ");
            System.out.print("numbers of beds are " + room.getBeds() + ", ");
            System.out.print("room has balcony: " + room.getBalcony() + ", ");
            System.out.print("room has the sea view: " + room.getSea() + ", ");
            System.out.println("room's price: " + room.getPricePerNight() + " CZK.");
        }


        //Hosté
        Guest firstGuest = new Guest("Adéla Malíková",
                LocalDate.of(1993, 3, 13));
        Guest secondGuest = new Guest("Jan Dvořáček",
                LocalDate.of(1995, 5, 5));
        List<Guest> listOfGuests = new ArrayList<>();
        listOfGuests.add(firstGuest);
        listOfGuests.add(secondGuest);


        for (Guest guest : listOfGuests) {
            System.out.print(guest.getName());
            System.out.println(" (" + guest.getDateOfBirth() + ") ");

        }


        //Rezervace
        Reservation reservation1 = new Reservation(room1, List.of(firstGuest), LocalDate.of(2021, 7, 19),
                LocalDate.of(2021, 7, 21), Working_stay);
        Reservation reservation2 = new Reservation(room3, List.of(firstGuest, secondGuest), LocalDate.of(2021, 9, 1),
                LocalDate.of(2021, 9, 14), Recreational_stay);





        List<Reservation> listOfReservation = new ArrayList<>();
        listOfReservation.add(reservation1);
        listOfReservation.add(reservation2);


        for (Reservation reservation : listOfReservation){
            System.out.println("List of reservation: " + "\t" + reservation.getRoom().getNumberOFTheRoom() +
                    ", " + reservation.getListOfGuests() + ", " + reservation.getDateStart() +
                            ", " + reservation.getDateEnd() + ", " + reservation.getTypeOfVacation() + ".");
        }


        }


    }

