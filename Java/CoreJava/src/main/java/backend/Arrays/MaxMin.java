package backend.Arrays;

public class MaxMin {
    public static void main(String[] args) {
//
//        int arr[]; //initialization
//        arr =new int[5]; //declaration with array size

        int[] arr = {6,9,8,7,10};
        int max = arr[0];
        int min = arr[0];


        System.out.println("The elements in the array are: ");
        for( int j=0; j<arr.length; j++){
            System.out.println(arr[j]);
        }

        for( int i=0; i<arr.length; i++) {


            if (arr[i] > max) {
                max = arr[i];
            }


            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("The largest number in array is: " + max);
        System.out.println("The smallest number in array is: " + min);

    }

}