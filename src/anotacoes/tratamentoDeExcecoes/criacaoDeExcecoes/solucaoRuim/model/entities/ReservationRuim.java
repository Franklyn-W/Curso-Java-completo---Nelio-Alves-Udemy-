package anotacoes.tratamentoDeExcecoes.criacaoDeExcecoes.solucaoRuim.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ReservationRuim {

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public ReservationRuim(Integer roomNumber, Date checkIn, Date checkOut) {
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

    public String updateDate(Date checkIn, Date checkOut) {

        Date now = new Date();

        if (checkIn.before(now) || checkOut.before(now)) {
            return "Erro in reservation: Reservation dates for updates must be future dates";
        }
        if (!checkOut.after(checkIn)) {
            return "Erro in reservation: Check-out date must be after check-in date";
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;

        return null;

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
