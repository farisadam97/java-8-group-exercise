package main;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Optional;

public class main {
    @FunctionalInterface
    interface booleanOddOrEven{
        boolean oddOrEven(int a);
    }

    public boolean OddOrEvenNumber(int a, booleanOddOrEven booleanOddOrEven){
        return booleanOddOrEven.oddOrEven(a);
    }

    public boolean testingOddOrEven(int x){
        return OddOrEvenNumber(x,(a) ->a % 2==0 ? true : false);
    }

    public static void main(String[] args) {
//        Create Interface and using lambda
        main mainA = new main();
        System.out.println(mainA.testingOddOrEven(5));

//        Using Method reference
        Function<String,String> toLowerCase = String::toLowerCase;
        String testText = toLowerCase.apply("TesTLowErCaSEtHisText");
        System.out.println(testText);

        List<Integer> numbers = Arrays.asList(1, 2, 13, 4, 5);
        System.out.println("Input Numbers : " + numbers);

        // Filter data using stream and mapping data into new structure
        List<String> filteredNumber = numbers.stream()
                .map(Object::toString) // mapping integer list into string list
                .filter(number -> number.startsWith("1")) // filter the list
                .collect(Collectors.toList());
        System.out.println("Filtered and mapped numbers list : " + filteredNumber);
        Integer totalValue = numbers.stream().reduce(0, (a,b) -> a+b);
        System.out.println("Total Value = " + totalValue);

        Person p = new Person();
        String personName = Optional.ofNullable(p.getName()).orElse("No Name");
        System.out.println("Person Name = " + personName);

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
        Period pE = Period.between(workDate, LocalDate.now());
        System.out.println(pE.getDays()+ " Days");

        //Using Duration to show total duration between two instants
        LocalTime start = LocalTime.of(7, 23,22);
        LocalTime end = LocalTime.of(9, 34,13);
        long wacthTime = Duration.between(start, end).getSeconds();
        System.out.println(wacthTime + " Seconds");
    }
}
