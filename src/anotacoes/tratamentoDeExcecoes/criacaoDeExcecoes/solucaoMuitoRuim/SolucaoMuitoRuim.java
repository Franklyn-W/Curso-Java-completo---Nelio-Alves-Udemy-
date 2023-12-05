package anotacoes.tratamentoDeExcecoes.criacaoDeExcecoes.solucaoMuitoRuim;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import anotacoes.tratamentoDeExcecoes.criacaoDeExcecoes.solucaoMuitoRuim.model.entities.ReservationMuitoRuim;

public class SolucaoMuitoRuim {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int roomNumber = sc.nextInt();
        System.out.print("Check-in date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());
        System.out.print("Check-out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());

        // Solução muito ruim - Lógica inserida no programa principal
        if (!checkOut.after(checkIn)) {
            System.out.println("Erro in reservation: Check-out date must be after check-in date");
        } else {
            ReservationMuitoRuim reservation = new ReservationMuitoRuim(roomNumber, checkIn, checkOut);
            System.out.println(reservation);
            System.out.println();

            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            Date now = new Date();

            if (checkIn.before(now) || checkOut.before(now)) {
                System.out.println("Erro in reservation: Reservation dates for updates must be future dates");
            } else if (!checkOut.after(checkIn)) {
                System.out.println("Erro in reservation: Check-out date must be after check-in date");
            } else {
                reservation.updateDate(checkIn, checkOut);
                System.out.println(reservation);
            }
        }

        sc.close();
    }
}
