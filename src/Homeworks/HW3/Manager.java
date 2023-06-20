package Homeworks.HW3;


public class Manager extends Employee {
    public Manager(String firstName, String lastName, String role, String phone, int salary, int age) {
        super(firstName, lastName, role, phone, salary, age);

    }

    public static void increaseSalary(Employee[] employees, double amount) {
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                employee.increaseSalary(amount);
            }
        }
    }
}
