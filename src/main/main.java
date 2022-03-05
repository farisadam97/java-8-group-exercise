package main;

import java.util.Optional;

public class main {
    public static void main(String[] args) {
        Person p = new Person();
        String personName = Optional.ofNullable(p.getName()).orElse("No Name");
        System.out.println(personName);
    }
}
