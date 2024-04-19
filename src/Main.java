import EmployeeBook.Employee;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Иванова Мария Петровна", 1, 125000),
                new Employee("Смирнов Алексей Владимирович", 3, 83000),
                new Employee("Попова Екатерина Андреевна", 5, 140000),
                new Employee("Козлов Денис Сергеевич", 2, 95000),
                new Employee("Новиков Павел Александрович", 4, 105000),
                new Employee("Морозова Анна Игоревна", 1, 130000),
                new Employee("Волкова Ольга Дмитриевна", 2, 72000),
                new Employee("Кузнецов Артем Николаевич", 3, 148000),
                new Employee("Федорова Светлана Викторовна", 5, 75000),
                new Employee("Соколов Андрей Иванович", 2, 90000),
        };
        Employee.printAllEmployees(employees);
        System.out.println(Employee.findSumSalary(employees));
        System.out.println(Employee.findMinSalary(employees));
        System.out.println(Employee.findMaxSalary(employees));
        System.out.println(Employee.findMiddleSalary(employees));
        Employee.printNames(employees);
    }
}