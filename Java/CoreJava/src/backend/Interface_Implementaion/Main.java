package backend.Interface_Implementaion;

interface Interface1
        {
            public abstract void display();

            int add(int a,int b);
        }

interface Interface2
{
    void show();
    int sub(int a, int b);
}



public class Main {
    public static void main(String[] args) {
        Class1 c1 = new Class1();
        c1.display();
        c1.show();
        int res1= c1.add(3,4);
        int res2= c1.sub(7,5);
        System.out.println("Sum: " +res1);
        System.out.println("Diff: " +res2);
    }
}
