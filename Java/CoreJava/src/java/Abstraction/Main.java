package java.Abstraction;

public class Main {
    public static void main(String[] args) {
        Department finance = new FinanceDepartment(10);
        int departmentSize = finance.getDepartmentSize();
        System.out.println("Finance department size: " + departmentSize);

    }
}