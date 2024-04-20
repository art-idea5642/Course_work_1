package EmployeeBook;

import java.util.Objects;

public class Employee {
    private final String employeeName;
    private int departmentNumber;
    private double salary;
    private final long id;
    private static long generator = 1;

    public Employee(String employeeName, int departmentNumber, double salary) {
        this.employeeName = employeeName;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
        this.id = generator++;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public double getSalary() {
        return salary;
    }

    public long getId() {
        return id;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Сотрудник: " + employeeName +
                ". Номер отдела: " + departmentNumber +
                ". Зарплата: " + salary +
                ". ID: " + id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return departmentNumber == employee.departmentNumber && salary == employee.salary && id == employee.id && Objects.equals(employeeName, employee.employeeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeName, departmentNumber, salary, id);
    }


}
