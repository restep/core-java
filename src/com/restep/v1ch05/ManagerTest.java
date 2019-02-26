package com.restep.v1ch05;

/**
 * @author restep
 * @date 2019/2/26
 */
public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        Employee[] employeeArr = new Employee[3];

        employeeArr[0] = boss;
        employeeArr[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        employeeArr[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);

        for (Employee employee : employeeArr) {
            System.out.println("name: " + employee.getName() + " salary: " + employee.getSalary());
        }
    }
}
