import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        String[] arr = {"apple", "mango", "banana", "grape"};

       Arrays.stream(arr)

               .filter((str) -> str.length() % 2 == 0)

        .sorted( (s1,s2) -> Integer.compare(s1.length(),s2.length()))

                .forEach(y->System.out.println(y));

    }
}
