package main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 13, 4, 5);
        System.out.println("Input Numbers : " + numbers);

        // Filter data using stream and mapping data into new structure
        List<String> filteredNumber = numbers.stream()
                .map(Object::toString) // mapping integer list into string list
                .filter(number -> number.startsWith("1")) // filter the list
                .collect(Collectors.toList());
        System.out.println("Filtered number list : " + filteredNumber);
    }
}
