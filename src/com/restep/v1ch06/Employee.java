package com.restep.v1ch06;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author restep
 * @date 2019/2/27
 */
public class Employee implements Cloneable, Comparable<Employee> {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee() {

    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();

        cloned.setHireDay((Date) hireDay.clone());

        return cloned;
    }

    @Override
    public int compareTo(Employee other) {
        if (salary < other.getSalary()) {
            return -1;
        }
        if (salary > other.getSalary()) {
            return 1;
        }
        return 0;
    }

    public void setHireDay(int year, int month, int day) {
        Date newHireDay = new GregorianCalendar(year, month - 1, day).getTime();
        this.hireDay = newHireDay;
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public String toString() {
        return "Employee[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
