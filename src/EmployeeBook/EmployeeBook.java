package EmployeeBook;

public class EmployeeBook {
    private final Employee[] employees;

    public EmployeeBook(int storageSize) {
        employees = new Employee[storageSize];
    }


    public boolean add(String employeeName, int departmentNumber, double salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = new Employee(employeeName, departmentNumber, salary);
                return true;
            }
        }
        return false;
    }

    public void deleteById(long id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                return;
            }
        }
    }

    public Employee getEmployeeById(long id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                return employees[i];
            }
        }
        return null;
    }

    public void printAll() {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            System.out.println(employee.toString());
        }
    }

    public double getSum() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            sum += employee.getSalary();
        }
        return sum;
    }

    public Employee getMinSalary() {
        Employee minSalary = employees[0];
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary() < minSalary.getSalary()) {
                minSalary = employee;
            }
        }
        return minSalary;
    }

    public Employee getMaxSalary() {
        Employee maxSalary = employees[0];
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary() > maxSalary.getSalary()) {
                maxSalary = employee;
            }
        }
        return maxSalary;
    }

    public double getAverageSalary() {
        int quantity = 0;
        double salarySum = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            quantity++;
            salarySum += employee.getSalary();

        }
        return salarySum / quantity;
    }

    public void printAllNames() {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            System.out.println(employee.getEmployeeName());
        }
    }

    public void increaseSalaryByPercentage(int percent) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            employee.setSalary(employee.getSalary() + employee.getSalary() / 100 * percent);
        }
    }

    public Employee getMinSalary(int department) {
        Employee minSalary = null;
        for (Employee employee : employees) {
            if (employee == null || employee.getDepartmentNumber() != department) {
                continue;
            }
            if (minSalary == null || employee.getSalary() < minSalary.getSalary()) {
                minSalary = employee;
            }
        }
        return minSalary;
    }

    public Employee getMaxSalary(int department) {
        Employee maxSalary = null;
        for (Employee employee : employees) {
            if (employee == null || employee.getDepartmentNumber() != department) {
                continue;
            }
            if (maxSalary == null || employee.getSalary() > maxSalary.getSalary()) {
                maxSalary = employee;
            }
        }
        return maxSalary;
    }

    public double getSum(int department) {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartmentNumber() == department) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public double getAverageSalary(int department) {
        int quantity = 0;
        double salarySum = 0;
        for (Employee employee : employees) {
            if (employee == null || employee.getDepartmentNumber() != department) {
                continue;
            }
            quantity++;
            salarySum += employee.getSalary();

        }
        return salarySum / quantity;
    }

    public void increaseSalaryByPercentage(int department, int percent) {
        for (Employee employee : employees) {
            if (employee == null || employee.getDepartmentNumber() != department) {
                continue;
            }
            employee.setSalary(employee.getSalary() + employee.getSalary() / 100 * percent);
        }
    }

    public void printAllNames(int department) {
        for (Employee employee : employees) {
            if (employee == null || employee.getDepartmentNumber() != department) {
                continue;
            }
            System.out.println(employee.getEmployeeName());
        }
    }

    public void printAllWithLessSalary(int salary) {
        for (Employee employee : employees) {
            if (employee == null || employee.getSalary() >= salary) {
                continue;
            }
            System.out.println(employee);
        }
    }

    public void printAllWithMoreSalary(int salary) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary() < salary) {
                continue;
            }
            System.out.println(employee);
        }
    }
}
