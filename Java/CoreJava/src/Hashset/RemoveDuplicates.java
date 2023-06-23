package Hashset;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String fruit = "Banana";
        Set<Character> uniqueChars = new HashSet<>();

        for (char c : fruit.toCharArray()) {
            uniqueChars.add(c);
        }

        StringBuilder result = new StringBuilder();
        for (char c : uniqueChars) {
            result.append(c);
        }

        String f = result.toString();
        System.out.println(f);
    }
}
