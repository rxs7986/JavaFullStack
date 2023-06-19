import java.util.Arrays;

public class VowelCount {
    public static void main(String[] args) {
        String[] strings = {"siri", "cortana", "edge", "firefox"};

        Arrays.stream(strings)
                .filter(str -> containsVowels(str))
                .forEach(str -> System.out.println(str + " VowelCount: " + countVowels(str)));
    }

    private static boolean containsVowels(String str) {
        for (char ch : str.toCharArray()) {
            if (isVowel(ch)) {
                return true;
            }
        }
        return false;
    }



    private static int countVowels(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (isVowel(ch)) {
                count++;
            }
        }
        return count;
    }
    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }


}
