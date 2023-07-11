package main.java.backend.ArrayList;

import java.util.ArrayList;

public class RemoveLastObjonAL {

    public static void  main (String args[])
    {
        ArrayList<Integer> rollno = new ArrayList<Integer>();

        rollno.add(101);
        rollno.add(102);
        rollno.add(103);
        rollno.add(104);
        rollno.add(105);

        rollno.remove(rollno.size()-1);
        System.out.println(rollno);


    }
}
