package main.java.backend.Runtime_Polymorphism;

public class Main
{
    public static void main(String[] args) {
        Vehicle obj = new Vehicle();
        Vehicle obj1 = new Car();
        obj.display();
        obj1.display();

    }
}