package anotacoes.tratamentoDeExcecoes.criacaoDeExcecoes.solucaoBoa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import anotacoes.tratamentoDeExcecoes.criacaoDeExcecoes.solucaoBoa.model.entities.ReservationBoa;
import anotacoes.tratamentoDeExcecoes.criacaoDeExcecoes.solucaoBoa.model.exceptions.DomainException; 

public class SolucaoBoa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // Solução Boa - Utilização de bloco try-catch e lançamento de exception personalizado pelo método.
        try {

            System.out.print("Room number: ");
            int roomNumber = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            ReservationBoa reservation = new ReservationBoa(roomNumber, checkIn, checkOut);
            System.out.println(reservation);
            System.out.println();

            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            reservation.updateDate(checkIn, checkOut);
            System.out.println(reservation);

        } catch (ParseException e) {
            System.out.println("Invalid Date Format.");

        } catch(DomainException e){
            System.out.println(e.getMessage());
        } catch(RuntimeException e){
            System.out.println("Unexpected error");
        }

        sc.close();
    }
}
