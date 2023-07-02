package backend.Java_8_Features;

import java.lang.management.OperatingSystemMXBean;
import java.util.Optional;

public class ReturnStringLength {

    public static void  returnLength(String str) {

        Optional<String> optVal = Optional.ofNullable(str);

        if(optVal.isPresent()){
            int x = str.length();
            System.out.println("The String length is:" +str.length());
        }
        else
            System.out.println("Empty String");

    }

    public static void main(String[] args) {

//        ReturnStringLength obj = new ReturnStringLength();

        String value = "Rachana";
        String val = null;

        ReturnStringLength.returnLength(value);


        //System.out.println("The String length is:" +obj.returnLength(value));





    }
}

