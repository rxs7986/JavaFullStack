package main.java.backend.Exceptions;

import java.lang.Integer;
import java.lang.Exception;


public class RegularException {
    String str = "123f";


    public int number() {
        int i =0;
        try {
            i = Integer.parseInt(str);
            return i;
        } catch(NumberFormatException e)
        {

            throw e;

        }


    }


    public static void main(String[] args) {
        RegularException o = new RegularException();

        System.out.println("Returned Integer: " + o.number());


    }
}