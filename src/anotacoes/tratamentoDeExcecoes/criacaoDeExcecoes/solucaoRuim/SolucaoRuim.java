package anotacoes.tratamentoDeExcecoes.criacaoDeExcecoes.solucaoRuim;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import anotacoes.tratamentoDeExcecoes.criacaoDeExcecoes.solucaoRuim.model.entities.ReservationRuim;

public class SolucaoRuim {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int roomNumber = sc.nextInt();
        System.out.print("Check-in date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());
        System.out.print("Check-out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());

        if (!checkOut.after(checkIn)) {
            System.out.println("Erro in reservation: Check-out date must be after check-in date");
        } else {
            ReservationRuim reservation = new ReservationRuim(roomNumber, checkIn, checkOut);
            System.out.println(reservation);
            System.out.println();

            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            // Solução muito ruim - Lógica inserida no método, que retorna uma String
            String error = reservation.updateDate(checkIn, checkOut);
            if (error != null) {
                System.out.println("Error in reservation: " + error);
            } else {
                System.out.println(reservation);
            }
            /*
             * A semântica da operação é prejudicada
             * *Retornar string não tem nada haver com atualização de reserva
             * *E se a operação tivesse que retornar uma String?
             * Ainda não é possível tratar exceções em construtores
             * Ainda não há auxílio do compilador: o programador deve "lembrar" de verificar
             * se houve erro
             * A lógica fica estruturada em condicionais aninhadas
             */

        }
        sc.close();
    }
}
