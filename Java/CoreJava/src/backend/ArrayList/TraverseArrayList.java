package backend.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;


public class TraverseArrayList {

    public static void main (String args[])
    {
        ArrayList<String> str = new ArrayList<String>();
        str.add("Rachana");
        str.add("Sanda");
        str.add("Master's Student from UTA");


        //For Loop
        System.out.println("Using forLoop: ");

        for (int i =0; i< str.size(); i++)
        {
            System.out.println(str.get(i));
        }


        //Enhanced For
        System.out.println("\n Using Enhanced for: ");

        for(String i: str)
        {
            System.out.println(i);
        }

        //ForEach with Stream
        System.out.println("\n Using ForEach: ");
        str.forEach(str1 ->System.out.println(str1));
        //str.stream().map(i -> str.get(Integer.parseInt(i))).forEach(System.out::println);


        //Using Iterator
        System.out.println("\n Using Iterator: ");
        Iterator<String> iterator = str.iterator();
        while (iterator.hasNext()) {
            String str1 = iterator.next();
            System.out.println(str1);
        }


        //Using ParallelStream
        System.out.println("\n Using ParallelStream: ");
        str.parallelStream().forEach(str2->System.out.println(str2));





    }
}


