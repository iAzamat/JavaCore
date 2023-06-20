package Homeworks.HW3;

public class Employee {
    private String firstName;
    private String lastName;
    private String role;
    private String phone;
    private int salary;
    private int age;


    public Employee(String firstName, String lastName, String role, String phone, int salary, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


    @Override
    public String toString() {
        return String.format("employee {%s %s," +
                        " role: %s," +
                        " phone: %s," +
                        " salary: %d," +
                        " age: %d}",
                lastName, firstName, role, phone, salary, age);
    }

    public void increaseSalary(double amount) {
        this.salary += amount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
