package anotacoes.tratamentoDeExcecoes.criacaoDeExcecoes.solucaoBoa.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import anotacoes.tratamentoDeExcecoes.criacaoDeExcecoes.solucaoBoa.model.exceptions.DomainException;

public class ReservationBoa {

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date now = new Date();

    public ReservationBoa(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {

        System.out.println(now);

        if (!checkIn.after(now)) {
            throw new DomainException("Erro in reservation: Check-in date must be from today");
        }

        if (!checkOut.after(checkIn)) {
            throw new DomainException(
                    "Erro in reservation: Check-out date must be after check-in date");
        }

        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duration() {
        long diff = checkOut.getTime() - checkIn.getTime();
        // Tranforma a diferença de dias entre o checkout e o checkin em milisegundos.

        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        // Converte os milisegundos em quantidade de dias
    }

    public void updateDate(Date checkIn, Date checkOut) throws DomainException {

        if (checkIn.before(now) || checkOut.before(now)) {
            throw new DomainException(
                    "Erro in reservation: Reservation dates for updates must be future dates");
        }
        if (!checkOut.after(checkIn)) {
            throw new DomainException(
                    "Erro in reservation: Check-out date must be after check-in date");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Reservation: Room: "
                + getRoomNumber()
                + ", check-in: "
                + sdf.format(checkIn)
                + ", check-out: "
                + sdf.format(checkOut)
                + ", "
                + duration()
                + " nights";
    }

}
