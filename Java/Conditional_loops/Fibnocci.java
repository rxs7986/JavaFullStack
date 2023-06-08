

public class Fibonocci {
    public static void main(String[] args) {
        int f1 = 0;
        int f2 = 1;
        int counter = 0;

        while (counter < 10)
        {
            System.out.println(f1);
            int f3 = f1 + f2;
            f1  = f2;
            f2 = f3;
            counter++;
        }

    }
}