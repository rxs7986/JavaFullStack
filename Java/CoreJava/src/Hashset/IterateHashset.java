package Hashset;

import java.util.HashSet;
import java.util.Iterator;

public class IterateHashset {

    public static void main(String args[])
    {
        HashSet<Integer> numbers = new HashSet();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        Iterator<Integer> itr = numbers.iterator();
        System.out.println("Printing using Iterator!!");
        while(itr.hasNext())
        {
          int num = itr.next();
          System.out.println(num);
        }

        System.out.println("Printing using forEach!!");
        numbers.forEach(n->System.out.println(n));

        System.out.println("Printing using streams forEach!!");
        numbers.stream().forEach(no->System.out.println(no));








    }
}
