

public class Main {
    public static void main(String[] args) {

        char[] arr = {'r','a','c','h'};

        System.out.println("The elements in array are: ");
        for (int i=0; i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println("Printing the array elements in the reverse order: ");

        for (int i= arr.length-1; i>=0; i--)
        {
            System.out.println(arr[i]);
        }
    }
}