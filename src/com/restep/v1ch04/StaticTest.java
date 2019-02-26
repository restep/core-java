package com.restep.v1ch04;

/**
 * @author restep
 * @date 2019/2/26
 */
public class StaticTest {
    public static void main(String[] args) {
        Employee[] employeeArr = new Employee[3];

        employeeArr[0] = new Employee("a", 40000);
        employeeArr[1] = new Employee("b", 60000);
        employeeArr[2] = new Employee("c", 65000);

        for (Employee employee : employeeArr) {
            employee.setId();
            System.out.println("name: " + employee.getName() + " id: " + employee.getId() + " salary: "
                    + employee.getSalary());
        }

        int nextId = Employee.getNextId();
        System.out.println("nextId: " + nextId);
    }
}
