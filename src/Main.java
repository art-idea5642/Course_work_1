import EmployeeBook.Employee;
import EmployeeBook.EmployeeBook;

public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.add("Иванова Мария Петровна", 1, 125000);
        employeeBook.add("Смирнов Алексей Владимирович", 3, 83000);
        employeeBook.add("Попова Екатерина Андреевна", 5, 140000);
        employeeBook.add("Козлов Денис Сергеевич", 2, 95000);
        employeeBook.add("Новиков Павел Александрович", 4, 105000);
        employeeBook.add("Морозова Анна Игоревна", 1, 130000);
        employeeBook.add("Волкова Ольга Дмитриевна", 2, 72000);
        employeeBook.printAll();
        employeeBook.deleteById(4);
        employeeBook.printAll();
        System.out.println(employeeBook.getEmployeeById(6));

    }
}