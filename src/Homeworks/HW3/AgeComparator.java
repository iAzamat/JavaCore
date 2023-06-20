package Homeworks.HW3;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return Integer.compare(emp1.getAge(), emp2.getAge());

//        int age1 = emp1.getAge();
//        int age2 = emp2.getAge();
//
//        if (age1 < age2) {
//            return -1;
//        } else if (age1 == age2) {
//            return 0;
//        } else {
//            return 1;
//        }

    }
}
