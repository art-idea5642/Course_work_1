import EmployeeBook.Employee;
import EmployeeBook.EmployeeBook;

public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook(35);
        employeeBook.add("Иванова Мария Петровна", 1, 125000);
        employeeBook.add("Смирнов Алексей Владимирович", 3, 83000);
        employeeBook.add("Попова Екатерина Андреевна", 5, 140000);
        employeeBook.add("Козлов Денис Сергеевич", 2, 95000);
        employeeBook.add("Новиков Павел Александрович", 4, 105000);
        employeeBook.add("Морозова Анна Игоревна", 1, 130000);
        employeeBook.add("Волкова Ольга Дмитриевна", 2, 72000);
        employeeBook.printAll();
        employeeBook.deleteById(4);
        System.out.println();
        employeeBook.printAll();
        System.out.println();
        System.out.println(employeeBook.getEmployeeById(6));
        System.out.println(employeeBook.getSum());
        System.out.println(employeeBook.getMinSalary());
        System.out.println(employeeBook.getMaxSalary());
        System.out.println(employeeBook.getAverageSalary());
        System.out.println();
        employeeBook.printAllNames();
        employeeBook.increaseSalaryByPercentage(20);
        System.out.println();
        employeeBook.printAll();
        System.out.println();
        System.out.println(employeeBook.getMinSalary(1));
        System.out.println(employeeBook.getMaxSalary(1));
        System.out.println(employeeBook.getSum(1));
        System.out.println(employeeBook.getAverageSalary(1));
        employeeBook.increaseSalaryByPercentage(2, 30);
        System.out.println();
        employeeBook.printAll();
        System.out.println();
        employeeBook.printAllWithLessSalary(130000);
        System.out.println();
        employeeBook.printAllWithMoreSalary(130000);
    }
}