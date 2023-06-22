package backend.HashMap;

public class ArrayTargetSum {

    public static void main (String args[])
    {
        int[] arr = {10,20,30,40,50,60};
        int target = 50;

        for (int i=0; i< arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j] == target)
                {
                   System.out.println("firstno: " + i + "secondno: " +j +arr[i] + arr[j]);
                }
            }
        }
    }
}
