package backend.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PrintHashmap {
    public static void main (String args[])
    {
        Student S1 = new Student("Rachana","Sanda", 3.5);
        Student S2 =  new Student("Archana","Sagar",4.0);
        Student S3 = new Student("Ramana","Sandha",4.0);
        Student S4 = new Student("Rach","S",3.0);
        Student S5 = new Student("Pallavi","Madham",3.5);
        Student S6 = new Student("Chandu","Sagar",3.7);
        Student S7 = new Student("Chandrapal","S",3.5);
        Student S8 = new Student("Ram","Kakkula",3.0);




        HashMap<String,Student> students = new HashMap<>();

        students.put(S1.getFirstName(),S1);
        students.put(S2.getFirstName(),S2);
        students.put(S3.getFirstName(),S3);
        students.put(S4.getFirstName(),S4);
        students.put(S5.getFirstName(),S5);
        students.put(S6.getFirstName(),S6);
        students.put(S7.getFirstName(),S7);
        students.put(S8.getFirstName(),S8);

//        for (String firstName: students.keySet() )
//        {
//            Student stu = (Student) students.get(firstName);
//            System.out.println("Firstname: " +firstName +"\tLastName:" +stu.getLastName() + "\tGPA: " +stu.getGPA());
//        }
        System.out.println("\nUsing EntrySet!");
        for (Map.Entry<String, Student> entry : students.entrySet()) {
            String firstName = entry.getKey();
            Student student = (Student) entry.getValue();
            System.out.println("First Name: " + firstName + ", Last Name: " + student.getLastName() + ", GPA: " + student.getGPA());
        }

        System.out.println("\nUsing forEach! ");
        students.forEach((firstName, student1) -> System.out.println("First Name: " + firstName + ", LastName: " + student1.getLastName() + ", GPA: " + student1.getGPA()));

       System.out.println("\nUsing Iterator");
        Iterator<Map.Entry<String, Student>> itr = students.entrySet().iterator();

        while(itr.hasNext())
        {
            Map.Entry<String, Student> obj= itr.next();
            String firstName = obj.getKey();
            Student student2 = (Student) obj.getValue();
            System.out.println("First Name: " + firstName + ", Last Name: " + student2.getLastName() + ", GPA: " + student2.getGPA());
        }




















    }
}
