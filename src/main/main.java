package main;

import java.time.*;
import java.util.*;

public class main {
    public static void main(String[] args) {

        // ADD DATE TIME API IN OUR CODE //

        System.out.println(LocalDateTime.of(2015, Month.MARCH, 20, 06, 30));
        System.out.println(LocalDate.now().plusDays(1)); //SHOW TOMORROW DATE

        //Convert to New Date Time API
        Date tgl = new Date();
        //System.out.println(tgl);
        Calendar cln = Calendar.getInstance();
        //System.out.println(cln.getCalendarType());
        System.out.println(LocalDateTime.ofInstant(tgl.toInstant(), ZoneId.systemDefault()));
        System.out.println(LocalDateTime.ofInstant(cln.toInstant(), ZoneId.systemDefault()));

        //Using Period to show total days between two date
        LocalDate workDate = LocalDate.of(2022, 2, 21);
        Period p = Period.between(workDate, LocalDate.now());
        System.out.println(p.getDays());

        //Using Duration to show total duration between two instants
        LocalTime start = LocalTime.of(7, 23,22);
        LocalTime end = LocalTime.of(9, 34,13);
        long wacthTime = Duration.between(start, end).getSeconds();
        System.out.println(wacthTime);
    }
}
