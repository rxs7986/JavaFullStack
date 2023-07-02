package backend.Java_8_Features;

import java.util.Optional;

public class ReturnsStringInUpperCase {


    public static void returnUpperStr(Optional<String> opt){

        String res;

        if(opt.isEmpty()){
            System.out.println("Empty Optional");
        }
       else
        {
            res = opt.get().toUpperCase();
            System.out.println(res);
        }


    }
    public static void main(String[] args) {

        String value = "Rachana";
        String val = null;
        Optional<String> optionalVal = Optional.ofNullable(val);
        returnUpperStr(optionalVal);


    }
}
