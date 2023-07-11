package main.java.backend.ArrayList;

import java.util.ArrayList;

public class ArrayListToArray {

    public static void main(String[] args) {
        ArrayList<Integer> rollno = new ArrayList<>();
        rollno.add(1);
        rollno.add(2);
        rollno.add(3);
        rollno.add(4);
        rollno.add(5);

//        Object[] arr = rollno.toArray();


        Integer[] arr = new Integer[rollno.size()];
        arr = rollno.toArray(arr);


         for (int i = 0; i < arr.length; i++) {
             System.out.println(arr[i]);
         }
    }
}
