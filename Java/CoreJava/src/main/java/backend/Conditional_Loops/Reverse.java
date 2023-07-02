package backend.Conditional_Loops;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Reverse {
    public static void main(String[] args) {

        int n = 12345;
        int rem = 0;
        int rev = 0;

        while(n!=0)
        {
            rem  = n%10;
            rev =  (rev*10) + rem;
            n = n/10;

        }

        System.out.println("Reversed Number is: " +rev);







    }



}