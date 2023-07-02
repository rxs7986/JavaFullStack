package backend.Functional_Interface;

import java.util.Arrays;

public class AverageOfOddNumbers {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double average = Arrays.stream(numbers)
                .filter(num -> num % 2 != 0)
                .mapToDouble(num -> num * num)
                .average()
                .orElse(0.0);

        System.out.println("Average of squares of odd numbers: " + average);
    }
}
