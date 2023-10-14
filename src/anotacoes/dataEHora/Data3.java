package anotacoes.dataEHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Data3 {

    public static void main(String[] args) {

        // Calculo de data/horas

        LocalDate d01 = LocalDate.parse("2023-10-14");
        LocalDateTime d02 = LocalDateTime.parse("2023-10-14T01:05:10");
        Instant d03 = Instant.parse("2023-10-14T01:05:10Z");

        // LocalDate
        LocalDate semanaAnteriorLocalDate = d01.minusDays(7);
        LocalDate proximaSemanaLocalDate = d01.plusDays(7);
        LocalDate proximoAnoLocalDate = d01.plusYears(7);

        System.out.println("LocalDate");
        System.out.println("Semana anterior: " + semanaAnteriorLocalDate);
        System.out.println("Proxima semana: " + proximaSemanaLocalDate);
        System.out.println("Proximo ano: " + proximoAnoLocalDate);

        System.out.println("------------------------");

        // LocalDateTime
        LocalDateTime semanaAnteriorLocalDateTime = d02.minusDays(7);
        LocalDateTime proximaSemanaLocalDateTime = d02.plusDays(7);
        LocalDateTime proximoAnoLocalDateTime = d02.plusYears(7);

        System.out.println("LocalDateTime");
        System.out.println("Semana anterior: " + semanaAnteriorLocalDateTime);
        System.out.println("Proxima semana: " + proximaSemanaLocalDateTime);
        System.out.println("Proximo ano: " + proximoAnoLocalDateTime);

        System.out.println("------------------------");

        // Instant
        Instant semanaAnteriorInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant proximaSemanaInstant = d03.plus(7, ChronoUnit.DAYS);

        System.out.println("Instant");
        System.out.println("Semana anterior: " + semanaAnteriorInstant);
        System.out.println("Proxima semana: " + proximaSemanaInstant);

        System.out.println("------------------------");

        // Calculo de data-hora

        Duration t1 = Duration.between(semanaAnteriorLocalDate.atStartOfDay(), d01.atStartOfDay());
        // Duration nao suporta LocalDate, pois nao possiu as informaçoes dos segundos,
        // necessrio realizar conversao

        Duration t2 = Duration.between(semanaAnteriorLocalDateTime, d02);
        Duration t3 = Duration.between(semanaAnteriorInstant, d03);
        Duration t4 = Duration.between(d03, semanaAnteriorInstant);
        
        System.out.println("Calculo de data-hora");
        System.out.println("t1 dias: " + t1.toDays());
        System.out.println("t2 dias: " + t2.toDays());
        System.out.println("t3 dias: " + t3.toDays());
        System.out.println("t4 dias: " + t4.toDays());

    }
}
