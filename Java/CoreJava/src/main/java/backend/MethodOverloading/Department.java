package main.java.backend.MethodOverloading;

public class Department extends College
{
    private int courseid;

    public Department(String name, int courseid)
    {
        super(name);
        this.courseid = courseid;
//        System.out.println("Name:" +name);
//        System.out.println("Courseid:" +courseid);
    }

    public Department(int courseid)
    {
        super("UTA");
        this.courseid = courseid;
//        System.out.println("Name:" +name);
//        System.out.println("Courseid:" +courseid);
    }

    public void disply()
    {
        System.out.println("Name:" +name);
        System.out.println("Courseid:" +courseid);
    }
}