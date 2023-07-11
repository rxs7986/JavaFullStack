package backend.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int n = 4;
        int[] b = new int[4];
        int j = n;
        int a[] = {1,2,3,4};
        for (int i = 0; i < n; i++) {
            a[j - 1] = a[i];
            j = j - 1;
        }

        // printing the reversed array
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
    }
}