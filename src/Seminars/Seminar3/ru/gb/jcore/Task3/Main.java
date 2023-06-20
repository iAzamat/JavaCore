package Seminars.Seminar3.ru.gb.jcore.Task3;

public class Main {

    public static void salaryUp(Employee[] employees, int age, int addSalary) {
        for (Employee employee : employees) {
            if (employee.getAge() > age) {
                employee.setSalary(employee.getSalary() + addSalary);
            }
        }
    }

    public static void salaryUp(Employee[] employees) {
        salaryUp(employees, 45, 5000);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Иван", "Сидоров", "Менеджер", "1234567890", 100000, 29);
        Employee employee2 = new Employee("Максим", "Леонтьев", "Менеджер", "1234567890", 100000, 35);
        Employee employee3 = new Employee("Александр", "Иванов", "Менеджер", "1234567890", 100000, 46);
        Employee employee4 = new Employee("Алексей", "Петров", "Менеджер", "1234567890", 100000, 52);
        Employee employee5 = new Employee("Константин", "Александров", "Менеджер", "1234567890", 100000, 50);

        Employee[] employees = new Employee[]{employee1, employee2, employee3, employee4, employee5};

        salaryUp(employees);

        for (Employee employee : employees) {
            employee.employeeInfo();
        }
    }
}
