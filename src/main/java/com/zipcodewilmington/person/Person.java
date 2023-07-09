package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private boolean isAlive;

    public Person() {  //these are the defaults
        this.name = "";
        this.age = Integer.MAX_VALUE;
        this.isAlive = true;



    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(boolean isAlive) {
        this.isAlive = isAlive;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Boolean isAlive() { return isAlive;}
}
