package anotacoes.dataEHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Data {

    public static void main(String[] args) {

        // Instanciacao de data e hora

        // Hora autal
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now(); // Instant retorna o horario UTC

        // Data no padrao ISO 8601
        LocalDate d04 = LocalDate.parse("2023-10-13");
        LocalDateTime d05 = LocalDateTime.parse("2023-10-13T23:05:10");

        // Manipulando horario
        Instant d06 = Instant.parse("2023-10-13T23:05:10Z");
        Instant d07 = Instant.parse("2023-10-13T23:05:10-03:00"); // O horario informado é 3 horas a menos que o horario
                                                                  // UTC

        // Formato customizado para padrao ISO
        // Tabela de formatação:
        // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate d08 = LocalDate.parse("13/10/2023", fmt);
        LocalDateTime d09 = LocalDateTime.parse("13/10/2023 23:21", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        LocalDate d10 = LocalDate.of(2022, 10, 13);
        LocalDateTime d11 = LocalDateTime.of(2023, 10, 13, 23, 27, 30);

        //data-hora para formato customizado
        //DateFormater para LocalDate e LocalDateTimw
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        //Para Instance
        //Formato Instance necessita de declaracao do fuso horario
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;



        System.out.println("d01: " + d01);
        System.out.println("d02: " + d02);
        System.out.println("d03: " + d03);
        System.out.println("d04: " + d04);
        System.out.println("d05: " + d05);
        System.out.println("d06: " + d06);
        System.out.println("d07: " + d07);
        System.out.println("d08: " + d08);
        System.out.println("d09: " + d09);
        System.out.println("d10: " + d10);
        System.out.println("d11: " + d11);
        System.out.println("----------------------------");


        System.out.println("d05 formatado: " + d05.format(fmt1));
        System.out.println("d05 formatado2: " + fmt1.format(d05));
        System.out.println("d05 formatado3: " + d05.format(fmt2));
        System.out.println("d05 formatado4: " + fmt4.format(d05));
        System.out.println("d06 formatado: " + fmt3.format(d06));
        System.out.println("d06 formatado2: " + fmt5.format(d06));
        
    }

}
