package com.restep.v1ch05;

/**
 * @author restep
 * @date 2019/2/26
 */
public class Student extends Person {
    private String major;

    public Student() {

    }

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return "a student majoring in " + major;
    }
}
