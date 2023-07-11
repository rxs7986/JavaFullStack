package main.java.backend.Interface_Implementaion;

public class Class1 implements Interface1, Interface2
{
//     private int x, y;
    @Override
    public void display() {
        System.out.println("Implementing abstract method in Interface1");;
    }

    public int add(int a, int b)
    {
        return a+b;
    }

    public int sub(int a, int b)
    {
        return a-b;
    }
    @Override
    public void show() {

        System.out.println(" Implementing abstract method in Interface2");

    }
}