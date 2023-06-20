package Homeworks.HW3;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return Double.compare(emp1.getSalary(), emp2.getSalary());

//        double salary1 = emp1.getSalary();
//        double salary2 = emp2.getSalary();
//
//        if (salary1 < salary2) {
//            return -1;
//        } else if (salary1 == salary2) {
//            return 0;
//        } else {
//            return 1;
//        }
    }
}
