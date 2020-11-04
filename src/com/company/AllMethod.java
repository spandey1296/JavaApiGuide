package com.company;
import java.util.Arrays;
import java.util.List;
public class AllMethod {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Conventional way of printing arraylist

        System.out.println("Printing List using advance for loop");
        for (int number : numbers) {

            System.out.print(number);
        }

        // Lambda Expression to print arraylist - Way 1
        System.out.println("Printing Lsit using Lambda express foreach using forEach expression");
        numbers.forEach((Integer value) -> System.out.println(value));

        // Lambda Expression to print arraylist - Way 2
        numbers.forEach(value -> System.out.println(value));

        // Lambda Expression (method reference) to print arraylist - Way 3
        numbers.forEach(System.out::println);
    }
}
