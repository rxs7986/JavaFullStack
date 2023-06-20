package backend.ArrayList;

import java.util.ArrayList;

public class StudentArrayList {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Student student1 = new Student();
        student1.setFname("Rachana");
        student1.setLname("Sanda");
        student1.setGpa(3.8);
        students.add(student1);

        Student student2 = new Student();
        student2.setFname("Archana");
        student2.setLname("Sanda");
        student2.setGpa(3.9);
        students.add(student2);

        Student student3 = new Student();
        student3.setFname("Ramana");
        student3.setLname("Sagar");
        student3.setGpa(3.7);
        students.add(student3);



        double totalGpa = 0.0;
        for (Student student : students) {
            totalGpa += student.getGpa();
        }

        double averageGpa = totalGpa / students.size();

        ArrayList<Student> remStudents = new ArrayList<>();

        for (Student student : students) {
            if (student.getGpa() >= averageGpa) {
                remStudents.add(student);
            }
        }

        for (Student student : remStudents) {
            System.out.println("Name: " + student.getFname() + " " + student.getLname());
            System.out.println("GPA: " + student.getGpa());
            System.out.println();
        }
    }
}
