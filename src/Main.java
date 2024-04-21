import EmployeeBook.Employee;

public class Main {
    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Иванова Мария Петровна", 1, 125000);
        employees[1] = new Employee("Смирнов Алексей Владимирович", 3, 83000);
        employees[2] = new Employee("Попова Екатерина Андреевна", 5, 140000);
        employees[3] = new Employee("Козлов Денис Сергеевич", 2, 95000);
        employees[4] = new Employee("Новиков Павел Александрович", 4, 105000);
        employees[5] = new Employee("Морозова Анна Игоревна", 1, 130000);
        employees[6] = new Employee("Волкова Ольга Дмитриевна", 2, 72000);
        employees[7] = new Employee("Кузнецов Артем Николаевич", 3, 148000);
        employees[8] = new Employee("Федорова Светлана Викторовна", 5, 75000);
        employees[9] = new Employee("Соколов Андрей Иванович", 2, 90000);

        printAll();
        System.out.println(getSum());
        System.out.println(getMinSalary());
        System.out.println(getMaxSalary());
        System.out.println(getAverageSalary());
        printAllNames();


    }

    public static void printAll() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static double getSum() {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static double getMinSalary() {
        double minSalary = employees[1].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
            }
        }
        return minSalary;
    }

    public static double getMaxSalary() {
        double maxSalary = employees[1].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
        }
        return maxSalary;
    }

    public static double getAverageSalary() {
        return getSum() / employees.length;
    }

    public static void printAllNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getEmployeeName());
        }
    }

}