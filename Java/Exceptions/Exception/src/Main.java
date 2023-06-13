import java.lang.Integer;
import java.lang.Exception;



class ToString {
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
        ToString o = new ToString();

        System.out.println("Returned Integer: " + o.number());


    }
}