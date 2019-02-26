package com.restep.v1ch05;

/**
 * @author restep
 * @date 2019/2/26
 */
public abstract class Person {
    private String name;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    public abstract String getDescription();

    public String getName() {
        return name;
    }
}
