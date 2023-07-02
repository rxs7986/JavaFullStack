package main.java.backend.Abstraction;

public class FinanceDepartment extends Department {
    private int departmentSize;

    public FinanceDepartment(int departmentSize) {
        this.departmentSize = departmentSize;
    }

    @Override
    public int getDepartmentSize() {
        return departmentSize;
    }
}
