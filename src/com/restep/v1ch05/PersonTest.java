package com.restep.v1ch05;

/**
 * @author restep
 * @date 2019/2/26
 */
public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];

        people[0] = new Employee("a", 50000, 1989, 10, 1);
        people[1] = new Student("b", "computer science");

        for (Person p : people) {
            System.out.println(p.getName() + ", " + p.getDescription());
        }
    }
}
