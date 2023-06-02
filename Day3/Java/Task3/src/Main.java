 class Vehicle
{
    public void display()
    {
        System.out.println("I am driving a Vehicle");
    }
}

class Car extends Vehicle
{
    public void display()
    {
        System.out.println("I am driving a car");
    }
}
public class Main
{
    public static void main(String[] args) {
        Vehicle obj = new Vehicle();
        Car obj1 = new Car();
        obj.display();
        obj1.display();

    }
}