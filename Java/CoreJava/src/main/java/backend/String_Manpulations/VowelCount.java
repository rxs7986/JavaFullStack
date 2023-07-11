package backend.String_Manpulations;

import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {

        int counter = 0;
        System.out.println("Enter a String:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str.toLowerCase();
        char[] str1 = str.toCharArray();

        for (int i=0;i<str1.length;i++)
        {
            if(str1[i]=='a'|| str1[i]=='e' || str1[i]=='i'|| str1[i]=='o'|| str1[i]=='u')
            {
                counter++;
            }

        }

        System.out.println("The vowel count is: " +counter);
    }
}