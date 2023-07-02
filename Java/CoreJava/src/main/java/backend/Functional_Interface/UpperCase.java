package backend.Functional_Interface;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.util.Arrays;
import java.util.Comparator;

public class UpperCase {
    public static void main(String[] args) {


        String[] arr = { "rat","cat","bat","mat"};

        Arrays.stream(arr)
                .map(
                        str->str.substring(0,1).toUpperCase() +  str.substring(1))
                .sorted(Comparator.naturalOrder())
                .forEach(y->System.out.println(y));











    }
}