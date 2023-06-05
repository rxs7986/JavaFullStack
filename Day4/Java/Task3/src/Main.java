 class A
{
    private static int var;

    static{
        var = initialize();

    }

    public static int initialize()
    {
        return 20;
    }

    public static int getvalue()
    {
        //this.var = var;
        return var;
    }


}
public class Main {
    public static void main(String[] args) {
//        A obj = new A();
        System.out.println("Value:" +A.getvalue());

    }
}