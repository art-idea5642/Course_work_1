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
        increaseSalaryByPercentage(20);
        System.out.println();
        printAll();
        System.out.println(getSum(1));
        System.out.println(getMinSalary(2));
        System.out.println(getMaxSalary(4));
        System.out.println(getAverageSalary(3));
        printAllNames(1);
        printAllWithLessSalary(100000);
        System.out.println();
        printAllWithMoreSalary(120000);


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

    public static Employee getMinSalary() {
        Employee minSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary.getSalary()) {
                minSalary = employee;
            }
        }
        return minSalary;
    }

    public static Employee getMaxSalary() {
        Employee maxSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary.getSalary()) {
                maxSalary = employee;
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

    public static void increaseSalaryByPercentage(int percent) {
        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() + employee.getSalary() / 100 * percent);
        }
    }

    public static Employee getMinSalary(int department) {
        Employee minSalary = null;
        for (Employee employee : employees) {
            if (employee.getDepartmentNumber() != department) {
                continue;
            }
            if (minSalary == null || employee.getSalary() < minSalary.getSalary()) {
                minSalary = employee;
            }
        }
        return minSalary;
    }

    public static Employee getMaxSalary(int department) {
        Employee maxSalary = null;
        for (Employee employee : employees) {
            if (employee.getDepartmentNumber() != department) {
                continue;
            }
            if (maxSalary == null || employee.getSalary() > maxSalary.getSalary()) {
                maxSalary = employee;
            }
        }
        return maxSalary;
    }

    public static double getSum(int department) {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartmentNumber() == department) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static double getAverageSalary(int department) {
        int quantity = 0;
        double salarySum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartmentNumber() != department) {
                continue;
            }
            quantity++;
            salarySum += employee.getSalary();

        }
        return salarySum / quantity;
    }

    public static void increaseSalaryByPercentage( int department, int percent) {
        for (Employee employee : employees) {
            if (employee.getDepartmentNumber() != department) {
                continue;
            }
            employee.setSalary( employee.getSalary() + employee.getSalary() / 100 * percent);
        }
    }
    public static void printAllNames(int department) {
        for (Employee employee : employees) {
            if (employee.getDepartmentNumber() != department) {
                continue;
            }
            System.out.println(employee.getEmployeeName());
        }
    }
    public static void printAllWithLessSalary(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= salary) {
                continue;
            }
            System.out.println(employee);
        }
    }
    public static void printAllWithMoreSalary(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                continue;
            }
            System.out.println(employee);
        }
    }


}