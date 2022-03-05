package main;

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
        List<Integer> numbers = Arrays.asList(1, 2, 13, 4, 5);
        System.out.println("Input Numbers : " + numbers);

//        Create Interface and using lambda
        main mainA = new main();
        System.out.println(mainA.testingOddOrEven(5));

//        Using Method reference
        Function<String,String> toLowerCase = String::toLowerCase;
        String testText = toLowerCase.apply("TesTLowErCaSEtHisText");
        System.out.println(testText);



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
    }
}
