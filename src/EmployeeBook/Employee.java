package EmployeeBook;

import java.util.Objects;

public class Employee {
    private String employeeName;
    private int departmentNumber;
    private int salary;
    private long id;
    private static long generator = 1;

    public Employee(String employeeName, int departmentNumber, int salary) {
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

    public int getSalary() {
        return salary;
    }

    public long getId() {
        return id;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(int salary) {
        this.salary = salary;
    }

    public static int findSumSalary(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i <= employees.length - 1; i++) {
            sum = sum + employees[i].getSalary();
        }
        return sum;
    }

    public static int findMinSalary(Employee[] employees) {
        int min = employees[0].getSalary();
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
            }
        }
        return min;
    }

    public static int findMaxSalary(Employee[] employees) {
        int max = employees[1].getSalary();
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
            }
        }
        return max;
    }

    public static int findMiddleSalary(Employee[] employees) {
        int middleSalary = findSumSalary(employees) / employees.length;
        ;
        return middleSalary;
    }

    public static void printNames(Employee[] employees) {
        for (int i = 0; i <= employees.length - 1; i++) {
            System.out.println(employees[i].getEmployeeName());
        }
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

    public static void printAllEmployees(Employee[] employees) {
        for (int i = 0; i <= employees.length - 1; i++) {
            System.out.println(employees[i].toString());
        }
    }

}
