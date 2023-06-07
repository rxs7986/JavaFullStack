
public class Main {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        //int[] arr1;
        //arr1 = new int[7];
        int x = 2;
        System.out.println("Original Array: ");
        for(int i=0; i<arr.length;i++)
        {
            System.out.printf(String.valueOf(arr[i]+" "));

        }
        for (int i = 0;i<x;i++)
        {
            int f = arr[0] , j;
            for (j=0;j<arr.length-1;j++)
            {
                arr[j] = arr[j+1];
                //System.out.printf(String.valueOf(arr[j]));
            }

            arr[j] = f;
        }


        System.out.println("Array after left rotation by x position: ");
        for(int i=0; i<arr.length;i++)
        {
            System.out.printf(String.valueOf(arr[i]+" "));

        }


    }
}