package anotacoes.dataEHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Data2 {
    
    public static void main(String[] args) {
        
        LocalDate d01 = LocalDate.parse("2023-10-13");
        LocalDateTime d02 = LocalDateTime.parse("2023-10-14T01:05:10");

        //Definido um horario UTC
        Instant d03 = Instant.parse("2023-10-14T01:05:10Z");

        // Todos os timezone disponiveis no Java
        /*  for (String string : ZoneId.getAvailableZoneIds()) {
            System.out.println(string);
        } */
        

        // Converterndo data-hora global para local
        //Convertendo para fuso local
        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        // Convertendo para fuso especifico
        LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));

        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));


        //Manipulação do Instance
        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);
        System.out.println("r3: " + r3);
        System.out.println("r4: " + r4);
        
        //Date
        System.out.println("d01: " + d01.getDayOfMonth());
        System.out.println("d01: " + d01.getMonthValue());
        System.out.println("d01: " + d01.getYear());
        
        //DateTime
        System.out.println("d02: " + d02.getHour());
        System.out.println("d02: " + d02.getMinute());
        








    }
}
