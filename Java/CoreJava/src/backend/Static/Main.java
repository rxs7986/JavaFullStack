package backend.Static;

class A

{
    private static int var;



    public static int getvalue()
    {

        return var;
    }

    public static void initialize(int v)
    {
        //this.var = var;
        var = v;
    }


    static{
        initialize(20);

    }



}
public class Main {
    public static void main(String[] args) {
//        A obj = new A();
        System.out.println("Value:" + A.getvalue());

    }
}