package main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Optional;
import java.util.*;

public class main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 13, 4, 5);
        System.out.println("Input Numbers : " + numbers);


        // ADD DATE TIME API IN OUR CODE //

        System.out.println(LocalDateTime.of(2015, Month.MARCH, 20, 06, 30));
        System.out.println(LocalDate.now().plusDays(1)); //SHOW TOMORROW DATE

        //Using Period to show total days between two date
        LocalDate workDate = LocalDate.of(2022, 2, 21);
        Period p = Period.between(workDate, LocalDate.now());
        System.out.println(p.getDays());

        //Convert to New Date Time API
        Date tgl = new Date();
        //System.out.println(tgl);
        Calendar cln = Calendar.getInstance();
        //System.out.println(cln.getCalendarType());
        System.out.println(LocalDateTime.ofInstant(tgl.toInstant(), ZoneId.systemDefault()));
        System.out.println(LocalDateTime.ofInstant(cln.toInstant(), ZoneId.systemDefault()));
    }
}
