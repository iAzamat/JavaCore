package Homeworks.HW3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Иван", "Сидоров", "Backend разработчик", "1234567890", 120000, 37));
        employees.add(new Employee("Максим", "Леонтьев", "Frontend разработчик", "1234567890", 110000, 35));
        employees.add(new Manager("Александр", "Иванов", "Руководитель проекта", "1234567890", 200000, 46));
        employees.add(new Employee("Алексей", "Петров", "Менеджер по продажам", "1234567890", 90000, 42));
        employees.add(new Employee("Константин", "Александров", "Дизайнер", "1234567890", 150000, 32));

        System.out.println("Список сотрудников до повышения зарплаты:");
        printEmployees(employees);

        System.out.println("Список сотрудников после повышения зарплаты:");
        Manager.increaseSalary(employees.toArray(new Employee[0]), 10000);
        printEmployees(employees);

        System.out.println("Список сотрудников после сортировки по зарплате:");
        employees.sort(new SalaryComparator());
        printEmployees(employees);

        System.out.println("Список сотрудников после сортировки по возрасту:");
        employees.sort(new AgeComparator());
        printEmployees(employees);
    }

    public static void printEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println();
    }
}
