package main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 13, 4, 5);
        System.out.println("Input Numbers : " + numbers);

        // Filter data using stream
        List<Integer> filteredNumber = numbers.stream()
                .filter(number -> number != 1)
                .collect(Collectors.toList());
        System.out.println("Filtered number list : " + filteredNumber);
    }
}
