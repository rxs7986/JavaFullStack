
package Task4;

final class Final
{
    final int age;

    Final(int age) {
        this.age = age;
    }

    final int getAge()
    {
        return age;
    }

}

public class FinalImplementation {
    public static  void main(String[] args)
    {
       Final obj = new Final(20);
       System.out.println("The Age is: " +obj.getAge());
    }
}