package com.restep.v1ch05;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author restep
 * @date 2019/2/26
 */
public class Employee extends Person {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee() {

    }

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;

        Calendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();
    }

    @Override
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }

        if (otherObject == null) {
            return false;
        }

        if (getClass() != otherObject.getClass()) {
            return false;
        }

        Employee other = (Employee) otherObject;

        return name.equals(other.getName()) && salary == other.salary && hireDay.equals(other.getHireDay());
    }

    @Override
    public int hashCode() {
        return 7 * name.hashCode() + 11 * new Double(salary).hashCode() + 13 * hireDay.hashCode();
    }

    @Override
    public String toString() {
        return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay
                + "]";
    }
}
