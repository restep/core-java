package com.restep.v1ch04;

import java.text.SimpleDateFormat;

/**
 * @author restep
 * @date 2019/2/26
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employeeArr = new Employee[3];

        employeeArr[0] = new Employee("a", 75000, 1987, 12, 15);
        employeeArr[1] = new Employee("b", 50000, 1989, 10, 1);
        employeeArr[2] = new Employee("c", 40000, 1990, 3, 15);

        for (Employee employee : employeeArr) {
            employee.raiseSalary(5);
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for (Employee employee : employeeArr) {
            System.out.println("name: " + employee.getName() + " salary: " + employee.getSalary() + " hireDay: "
                    + sdf.format(employee.getHireDay()));
        }
    }
}
