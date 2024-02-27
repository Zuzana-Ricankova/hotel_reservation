import com.engeto.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.engeto.ReservationManager;

import static com.engeto.TypeOfVacation.RECREATIONAL_STAY;
import static com.engeto.TypeOfVacation.WORKING_STAY;

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


        //Hosté
        Guest firstGuest = new Guest("Adéla Malíková",
                LocalDate.of(1993, 3, 13));
        Guest secondGuest = new Guest("Jan Dvořáček",
                LocalDate.of(1995, 5, 5));
        Guest thirdGuest = new Guest("Karel Dvořák", LocalDate.of(1990, 5,15));
        Guest forthGuest = new Guest("Karel Dvořák", LocalDate.of(1979, 1,3));
        Guest fifthGuest = new Guest("Karolína Tmavá", LocalDate.of(1997,4,6));



        List<Guest> listOfGuests = new ArrayList<>();
        listOfGuests.add(firstGuest);
        listOfGuests.add(secondGuest);
        listOfGuests.add(thirdGuest);
        listOfGuests.add(forthGuest);
        listOfGuests.add(fifthGuest);


        //Rezervace
        Reservation reservation1 = new Reservation(1, room1, List.of(firstGuest), 1, LocalDate.of(2021, 7, 19),
                LocalDate.of(2021, 7, 21), WORKING_STAY);
        Reservation reservation2 = new Reservation(2, room3, List.of(firstGuest, secondGuest), 2, LocalDate.of(2021, 9, 1),
                LocalDate.of(2021, 9, 14), RECREATIONAL_STAY);


        List<Reservation> listOfReservation = new ArrayList<>();
        listOfReservation.add(reservation1);
        listOfReservation.add(reservation2);


        //ReservationManager
        ReservationManager reservationManager = new ReservationManager();
        reservationManager.addReservation(reservation1);
        reservationManager.addReservation(reservation2);
        System.out.println(reservationManager.getNumberOfReservation());

        System.out.println("....");
        System.out.println(reservationManager.getNumberOfWorkingReservation());
        System.out.println("....");

        System.out.println(reservationManager.getAverageGuests());

        reservationManager.addReservation(new Reservation(3, room3, List.of(thirdGuest), 1,
                LocalDate.of(2023,6,1), LocalDate.of(2023,6,7), WORKING_STAY));
        reservationManager.addReservation(new Reservation(4, room2, List.of(forthGuest), 1, LocalDate.of(2023, 7,18),
                LocalDate.of(2023,7,21), RECREATIONAL_STAY));

        System.out.println("......");
        for (int i = 1; i <= 10; i++) {
            reservationManager.addReservation(new Reservation(4 + i, room2, List.of(fifthGuest), 1,
                    LocalDate.of(2023, 7,31).plusDays(i),
                    LocalDate.of(2023,8,1).plusDays(i), RECREATIONAL_STAY));
        }


        reservationManager.addReservation(new Reservation(15, room3, List.of(fifthGuest), 1,
                LocalDate.of(2023,8,1),
                LocalDate.of(2023, 8,31), RECREATIONAL_STAY));

        System.out.println(".....");
        System.out.println(reservationManager.toString());

        System.out.println("..Výpis prvních 8 rekreačních rezervací...");
            System.out.println(reservationManager.getRecreationalReservation());
        System.out.println(".....");


        List<ReservationManager> listOfReservationManager = new ArrayList<>();

        System.out.println("______________");
        //SOUHRN!!!

        //Počet rezervací
        System.out.println("Počet rezervací: " + reservationManager.getNumberOfReservation());

        //Počet rezervací s pracovním pobytem
        System.out.println("Počet rezervací s pracovním pobytem: " + reservationManager.getNumberOfWorkingReservation());



        System.out.println("______________");
        //Průměrný počet hostů na rezervaci
        System.out.println("Průměrný počet hostů na rezervaci: " + reservationManager.getAverageGuests());

        //Vypíše prvních 8 rezervací s rekračním pobytem
        System.out.println("Vypíše prvních 8 rezervací s rekračním pobytem: ");
            System.out.println(reservationManager.getRecreationalReservation());

        //Celkový počet rezervací s jedním hostem
        System.out.println("Celkový počet rezervací s jedním hostem: " +
                reservationManager.getTotalCountOfReservationWithNumOfGuests(1));

        //Celkový počet rezervací se dvěma  hosty
        System.out.println("Celkový počet rezervací se dvěma  hosty: " +
                reservationManager.getTotalCountOfReservationWithNumOfGuests(2));

        //Celkový počet rezervací s více než dvěma  hosty
        System.out.println("Celkový počet rezervací s více než dvěma  hosty: "+
                        reservationManager.getTotalCountOfReservationWithNumOfGuests(3));









    }


    }

